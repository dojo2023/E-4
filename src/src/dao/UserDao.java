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
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/sobaudon", "sa", "");

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

	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(User user) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/simpleBC", "sa", "");

			// SQL文を準備する
			String sql = "insert into BC(COMPANY,DEPARTMENT,POSITION,NAME,ZIPCODE,ADDRESS,PHONE,FAX,MAIL,REMARKS)  values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SQL文を完成させる
			if (user.getCompany() != null && !card.getCompany().equals("")) {
				pStmt.setString(1, card.getCompany());
			}
			else {
				pStmt.setString(1, null);
			}
			if (card.getDepartment() != null && !card.getDepartment().equals("")) {
				pStmt.setString(2, card.getDepartment());
			}
			else {
				pStmt.setString(2, null);
			}
			if (card.getPosition() != null && !card.getPosition().equals("")) {
				pStmt.setString(3, card.getPosition());
			}
			else {
				pStmt.setString(3, null);
			}
			if (card.getName() != null && !card.getName().equals("")) {
				pStmt.setString(4, card.getName());
			}
			else {
				pStmt.setString(4, null);
			}
			if (card.getZipCode() != null && !card.getZipCode().equals("")) {
				pStmt.setString(5, card.getZipCode());
			}
			else {
				pStmt.setString(5, null);
			}
			if (card.getAddress() != null && !card.getAddress().equals("")) {
				pStmt.setString(6, card.getAddress());
			}
			else {
				pStmt.setString(6, null);
			}
			if (card.getPhone() != null && !card.getPhone().equals("")) {
				pStmt.setString(7, card.getPhone());
			}
			else {
				pStmt.setString(7, null);
			}
			if (card.getFax() != null && !card.getFax().equals("")) {
				pStmt.setString(8, card.getFax());
			}
			else {
				pStmt.setString(8, null);
			}
			if (card.getMail() != null && !card.getMail().equals("")) {
				pStmt.setString(9, card.getMail());
			}
			else {
				pStmt.setString(9, null);
			}
			if (card.getRemarks() != null && !card.getRemarks().equals("")) {
				pStmt.setString(10, card.getRemarks());
			}
			else {
				pStmt.setString(10, null);
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
	}
}