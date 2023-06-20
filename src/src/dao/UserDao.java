package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;


public class UserDao {
	// ログインできるならtrueを返すLoginメソッド
	public boolean Login(User user) {
		Connection conn = null;
		boolean loginResult = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SELECT文を準備する
			String sql = "select count(*) from USER where USER_ID = ? and PASSWORD = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, user.getUser_id());
			pStmt.setString(2,user.getPassword());

			// SELECT文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// ユーザーIDとパスワードが一致するユーザーがいたかどうかをチェックする
			rs.next();
			if (rs.getInt("count(*)") == 1) {
				loginResult = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			loginResult = false;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			loginResult = false;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					loginResult = false;
				}
			}
		}

		// 結果を返す
		return loginResult;
	}

	// 引数userで指定されたレコードを登録する
	public void insert(User user) {
		Connection conn = null;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "insert into USER(USER_ID,PASSWORD,NAME,HEIGHT,WEIGHT,TARGET_WEIGHT)  values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SQL文を完成させる
			if (user.getUser_id() != null && !user.getUser_id().equals("")) {
				pStmt.setString(1, user.getUser_id());
			}
			else {
				pStmt.setString(1, null);
			}
			if (user.getPassword() != null && !user.getPassword().equals("")) {
				pStmt.setString(2, user.getPassword());
			}
			else {
				pStmt.setString(2, null);
			}
			if (user.getName() != null && !user.getName().equals("")) {
				pStmt.setString(3, user.getName());
			}
			else {
				pStmt.setString(3, null);
			}
			if (user.getHeight() != null) {
				pStmt.setDouble(4, user.getHeight());
			}
			else {
				pStmt.setString(4, null);
			}
			if (user.getWeight() != null) {
				pStmt.setDouble(5, user.getWeight());
			}
			else {
				pStmt.setString(5, null);
			}
			if (user.getTarget_weight() != null) {
				pStmt.setDouble(6, user.getTarget_weight());
			}
			else {
				pStmt.setString(6, null);
			}
			// SQL文を実行する
			pStmt.executeUpdate();
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
	}
	// 引数userで指定されたレコードを更新する
	public void update(User user) {
		Connection conn = null;
		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "update USER set NAME=?, =?, HEIGHT=?, TARGET_WEIGHT=? where USER_ID=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			if (user.getName() != null && !user.getName().equals("")) {
				pStmt.setString(1, user.getName());
			}
			else {
				pStmt.setString(1, null);
			}
			if (user.getHeight() != null) {
				pStmt.setDouble(2, user.getHeight());
			}
			else {
				pStmt.setString(2, null);
			}
			if (user.getTarget_weight() != null) {
				pStmt.setDouble(3, user.getTarget_weight());
			}
			else {
				pStmt.setString(3, null);
			}
			pStmt.setString(4, user.getUser_id());

			// SQL文を実行する
			pStmt.executeUpdate();
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
	}
	public User detail(User user) {
		Connection conn = null;
		User profile = new User();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "select * from USER WHERE USER_ID= ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる

				pStmt.setString(1,user.getUser_id());


			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			if (rs.next()) {
				User detail = new User(
				rs.getString("USER_ID"),
				rs.getString("PASSWORD"),
				rs.getString("NAME"),
				rs.getDouble("HEIGHT"),
				rs.getDouble("WEIGHT"),
				rs.getDouble("TARGET_WEIGHT")
				);
				profile = detail;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			profile = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			profile = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					profile = null;
				}
			}
		}

		// 結果を返す
		return profile;
	}
}