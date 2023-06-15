package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Title;

public class TitleDao {
	public List<Title> list() {
		Connection conn = null;
		List<Title> TitleList = new ArrayList<Title>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "select * from TITLE ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Title card = new Title(
					rs.getString("TITLEID"),
					rs.getInt("TITLEPOINT"),
					rs.getString("TITLENAME"),
					rs.getString("TITLEIMAGE")
				);
				TitleList.add(card);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			TitleList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			TitleList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					TitleList = null;
				}
			}
		}

		// 結果を返す
		return TitleList;
	}
}
