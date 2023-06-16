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
				String sql = "select * from Manage WHERE USER_ID LIKE ? AND DATE LIKE ? ORDER BY DATE";
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
					rs.getDouble("BMI")

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


}
