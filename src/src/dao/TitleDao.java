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
	public List<Title> list(Title title) {
		Connection conn = null;
		List<Title> titleList = new ArrayList<Title>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "select * from TITLE where TITLE_ID like ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (title.getTitle_id() != null) {
				pStmt.setString(1, "%" + title.getTitle_id() + "%");
			}else {
				pStmt.setString(1, "%");
			}
			if (title.getTitle_point() != 0) {
				pStmt.setString(2, "%" + title.getTitle_point() + "%");
			}else {
				pStmt.setString(2, "%");
			}
			if (title.getTitle_name() != null) {
				pStmt.setString(3, "%" + title.getTitle_name() + "%");
			}else {
				pStmt.setString(3, "%");
			}
			if (title.getTitle_image() != null) {
				pStmt.setString(4, "%" + title.getTitle_image() + "%");
			}else {
				pStmt.setString(4, "%");
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Title new_title = new Title(
					rs.getString("TITLEID"),
					rs.getInt("TITLEPOINT"),
					rs.getString("TITLENAME"),
					rs.getString("TITLEIMAGE")
				);
				titleList.add(new_title);
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
			titleList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			titleList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					titleList = null;
				}
			}
		}

		// 結果を返す
		return titleList;
	}
}
