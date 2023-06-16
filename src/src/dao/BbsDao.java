package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Bbs;

public class BbsDao {
	public List<Bbs> list() {
		Connection conn = null;
		List<Bbs> BbsList = new ArrayList<Bbs>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "select * from BBS ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をbbsにコピーする
			while (rs.next()) {
				Bbs card = new Bbs(
					rs.getString("USER_ID"),
					rs.getInt("CPOINT"),
					rs.getString("NAME"),
					rs.getString("CHATTEXT"),
					rs.getString("DATE")
				);
				BbsList.add(card);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			BbsList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			BbsList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					BbsList = null;
				}
			}
		}

		// 結果を返す
		return BbsList;
	}
}
