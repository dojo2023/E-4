package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Board;

public class FindChattextDAO {
	public List<Board> findchattext() {
		// id,name,commentを格納するリスト
		List<Board> list = new ArrayList<>();
		final String jdbcId = "id";
        final String jdbcName = "name";
        final String jdbcUrl = "jdbc:h2:file:C:/dojo6/data/suDB";

        Connection con = null;

        try {
        	// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

		// データベースに接続する
		con = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "test", "pass");
		System.out.println("Connected....");
		try {
			Statement st = con.createStatement();
            String sql = "select * from board";
            PreparedStatement pStmt = con.prepareStatement(sql);
            try {
            	// SQL文を実行し、結果表を取得する
            	ResultSet rs = pStmt.executeQuery();
            	
            	/*sqlを送信
            	ResultSet rs = st.executeQuery(sql);*/
            	while (rs.next()) {
            		// DBから取り出したname,chattext,dateをset
            		Board bo = new Board();
            		bo.setName(rs.getString("name"));
            		bo.setChattext(rs.getString("chattext"));
            		bo.setDate(rs.getTimestamp("Date"));
            		
            		// リストに1個ずつ格納。末尾に要素が追加されていく。
                    list.add(bo);
                    }
            	rs.close();
            	st.close();
            	} catch (SQLException e) {
            		e.printStackTrace();
            		}
            } catch (SQLException e) {
            	e.printStackTrace();
            } finally {
            	// データベース接続の切断
            	if (con != null) {
            		try {
                        con.close();
                        } catch (SQLException e) {
                        	e.printStackTrace();
                        	}
            		}
            	}
		} catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Connection Failed.");
            return null;
            }
        return list;
        }
    }

