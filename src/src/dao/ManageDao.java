package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Manage;


public class ManageDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
		public List<Manage> select(Manage param) {
			Connection conn = null;
			List<Manage> manageList = new ArrayList<Manage>();

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/sobaudon", "sa", "");

				// SQL文を準備する
				String sql = "select * from MANAGE WHERE USER_ID LIKE ? AND DATE LIKE ? ORDER BY DATE";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (param.getUser_id() != null) {
					pStmt.setString(1, "%" + param.getUser_id() + "%");
				}
				else {
					pStmt.setString(1, "%");
				}
				if (param.getDate() != null) {
					pStmt.setString(2, "%" + param.getDate() + "%");
				}
				else {
					pStmt.setString(2, "%");
				}

				// SQL文を実行し、結果表を取得する
				ResultSet rs = pStmt.executeQuery();


				// 結果表をコレクションにコピーする
				while (rs.next()) {
					Manage manage = new Manage(
					rs.getString("USER_ID"),
					rs.getString("DATE"),
					rs.getString("BREAKFAST"),
					rs.getString("BFTEXT"),
					rs.getString("LUNCH"),
					rs.getString("LCTEXT"),
					rs.getString("DINNER"),
					rs.getString("DNTEXT"),
					rs.getInt("SNACK"),
					rs.getInt("EXERCISE"),
					rs.getInt("DRINK"),
					rs.getDouble("DAYWEIGHT"),
					rs.getString("PICTURE"),
					rs.getDouble("BMI"),
					rs.getString("COUNTER")

					);
					manageList.add(manage);
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				manageList = null;
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
				manageList = null;
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
						manageList = null;
					}
				}
			}

			// 結果を返す
			return manageList;
		}

		// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
		public boolean insert(Manage manage) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/sobaudon", "sa", "");

				// SQL文を準備する
				String sql = "insert into MANAGE values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (manage.getUser_id() != null && !manage.getUser_id().equals("")) {
					pStmt.setString(1, manage.getUser_id());
				}
				else {
					pStmt.setString(1, null);
				}
				if (manage.getDate() != null && !manage.getDate().equals("")) {
					pStmt.setString(2, manage.getDate());
				}
				else {
					pStmt.setString(2, null);
				}
				if (manage.getBreakfast() != null && !manage.getBreakfast().equals("")) {
					pStmt.setString(3, manage.getBreakfast());
				}
				else {
					pStmt.setString(3, null);
				}
				if (manage.getBftext() != null && !manage.getBftext().equals("")) {
					pStmt.setString(4, manage.getBftext());
				}
				else {
					pStmt.setString(4, null);
				}
				if (manage.getLunch() != null && !manage.getLunch().equals("")) {
					pStmt.setString(5, manage.getLunch());
				}
				else {
					pStmt.setString(5, null);
				}
				if (manage.getLctext() != null && !manage.getLctext().equals("")) {
					pStmt.setString(6, manage.getLctext());
				}
				else {
					pStmt.setString(6, null);
				}
				if (manage.getDinner() != null && !manage.getDinner().equals("")) {
					pStmt.setString(7, manage.getDinner());
				}
				else {
					pStmt.setString(7, null);
				}
				if (manage.getDntext() != null && !manage.getDntext().equals("")) {
					pStmt.setString(8, manage.getDntext());
				}
				else {
					pStmt.setString(8, null);
				}
				if (manage.getSnack() == 0 && manage.getSnack() == 1) {
					pStmt.setInt(9, manage.getSnack());
				}
				else {
					pStmt.setString(9, null);
				}
				if (manage.getExercise() == 0 && manage.getExercise() == 1) {
					pStmt.setInt(10, manage.getExercise());
				}
				else {
					pStmt.setString(10, null);
				}
				if (manage.getDrink() == 0 && manage.getDrink() == 1) {
					pStmt.setInt(11, manage.getDrink());
				}
				else {
					pStmt.setString(11, null);
				}
				if (manage.getDayweight() >= 0 && manage.getDayweight() <= 200) {
					pStmt.setDouble(12, manage.getDayweight());
				}
				else {
					pStmt.setString(12, null);
				}
				if (manage.getPicture() != null && !manage.getPicture().equals("")) {
					pStmt.setString(13, manage.getPicture());
				}
				else {
					pStmt.setString(13, null);
				}
				if (manage.getBmi() >= 10 && manage.getBmi() <= 50) {
					pStmt.setDouble(14, manage.getBmi());
				}
				else {
					pStmt.setString(14, null);
				}
				if (manage.getCounter() != null && !manage.getCounter().equals("")) {
					pStmt.setString(15, manage.getCounter());
				}
				else {
					pStmt.setString(15, null);
				}

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			// 結果を返す
			return result;
		}

		// 引数cardで指定されたレコードを更新し、成功したらtrueを返す
		public boolean update(Manage manage) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/sobaudon", "sa", "");

				// SQL文を準備する
				String sql = "update MANAGE set BREAKFAST=?, BFTEXT=?, LUNCH=?, LCTEXT=?, DINNER=?, DNTEXT=?, SNACK=?, EXERCISE=?, DRINK=?, DAYWEIGHT=?, PICTURE=?, BMI=?, COUNTER=? where NUMBER=?, DATE=?";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (manage.getBreakfast() != null && !manage.getBreakfast().equals("")) {
					pStmt.setString(1, manage.getBreakfast());
				}
				else {
					pStmt.setString(1, null);
				}
				if (manage.getBftext() != null && !manage.getBftext().equals("")) {
					pStmt.setString(2, manage.getBftext());
				}
				else {
					pStmt.setString(2, null);
				}
				if (manage.getLunch() != null && !manage.getLunch().equals("")) {
					pStmt.setString(3, manage.getLunch());
				}
				else {
					pStmt.setString(3, null);
				}
				if (manage.getLctext() != null && !manage.getLctext().equals("")) {
					pStmt.setString(4, manage.getLctext());
				}
				else {
					pStmt.setString(4, null);
				}
				if (manage.getDinner() != null && !manage.getDinner().equals("")) {
					pStmt.setString(5, manage.getDinner());
				}
				else {
					pStmt.setString(5, null);
				}
				if (manage.getDntext() != null && !manage.getDntext().equals("")) {
					pStmt.setString(6, manage.getDntext());
				}
				else {
					pStmt.setString(6, null);
				}
				if (manage.getSnack() == 0 && manage.getSnack() == 1) {
					pStmt.setInt(7, manage.getSnack());
				}
				else {
					pStmt.setString(7, null);
				}
				if (manage.getExercise() == 0 && manage.getExercise() == 1) {
					pStmt.setInt(8, manage.getExercise());
				}
				else {
					pStmt.setString(8, null);
				}
				if (manage.getDrink() == 0 && manage.getDrink() == 1) {
					pStmt.setInt(9, manage.getDrink());
				}
				else {
					pStmt.setString(9, null);
				}
				if (manage.getDayweight() >= 0 && manage.getDayweight() <= 200) {
					pStmt.setDouble(10, manage.getDayweight());
				}
				else {
					pStmt.setString(10, null);
				}
				if (manage.getPicture() != null && !manage.getPicture().equals("")) {
					pStmt.setString(11, manage.getPicture());
				}
				else {
					pStmt.setString(11, null);
				}
				if (manage.getBmi() >= 10 && manage.getBmi() <= 50) {
					pStmt.setDouble(12, manage.getBmi());
				}
				else {
					pStmt.setString(12, null);
				}
				if (manage.getCounter() != null && !manage.getCounter().equals("")) {
					pStmt.setString(13, manage.getCounter());
				}
				else {
					pStmt.setString(13, null);
				}

				pStmt.setString(14, manage.getUser_id());
				pStmt.setString(15, manage.getDate());

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			// 結果を返す
			return result;
		}


}
