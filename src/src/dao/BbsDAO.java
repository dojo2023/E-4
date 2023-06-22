package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Bbs;

public class BbsDAO {

    // DBにchattext,date,counterを加えるメソッド
    public boolean insert(Bbs bo) {
    	/*if(bo.getChattext().isEmpty()) {   
        }*/
        

        final String jdbcId = "sa";
        final String jdbcPass = "";
        final String jdbcUrl = "jdbc:h2:file:C:/dojo6/data/suDB";

        Connection con = null;

        try {

            con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);

            System.out.println("Connected....");

            try {
            	/*
            	 user_id name chattext cpoint date visiter

            	 */
                PreparedStatement pStmt = con.prepareStatement("INSERT INTO bbs (user_id,name,chattext,date,visitor)"
                		+ " VALUES (?, ?, ?, ?, ?)");
                pStmt.setString(1, bo.getUser_id());
                pStmt.setString(2, bo.getName());
                pStmt.setString(3, bo.getChattext());
                pStmt.setString(4, bo.getDate());
                pStmt.setInt(5, bo.getVisitor());

                // ひな形を送信
                int r = pStmt.executeUpdate();

                if (r != 0) {
                    System.out.println(r + "書き込みを追加しました。");
                    return true;
                } else {
                    System.out.println("書き込みできませんでした。");
                }

                pStmt.close();

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
        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("Connection Failed.");

        }
		return false;

    }
    //select method
public  List<Bbs> select(Bbs bbs) {
    	
        final String jdbcId = "sa";
        final String jdbcPass = "";
        final String jdbcUrl = "jdbc:h2:file:C:/dojo6/data/suDB";
        
        System.out.println("Connected....");
        
        try {
        	DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);
        	
        	Class.forName("org.h2.Driver");
        	try(Connection connection = DriverManager.getConnection(jdbcUrl,jdbcId,jdbcPass);){
        		//自動採番new String[]{"bbsid"}の追加
        		PreparedStatement pStmt = connection.prepareStatement("SELECT * FROM BBS WHERE USER_ID LIKE ? AND NAME LIKE ? AND CHATTEXT LIKE ? AND DATE LIKE ?",new String[]{"bbsid"});
        		if (bbs.getUser_id() != null && !bbs.getUser_id().equals("")) {
    				pStmt.setString(1, "%" + bbs.getUser_id() + "%");
    			}
    			else {
    				pStmt.setString(1, "%");
    			}
    			if (bbs.getName() != null && !bbs.getName().equals("")) {
    				pStmt.setString(2, bbs.getName());
    			}
    			else {
    				pStmt.setString(2, "%");
    			}
    			if (bbs.getChattext() != null && !bbs.getChattext().equals("")) {
    				pStmt.setString(3, bbs.getChattext());
    			}
    			else {
    				pStmt.setString(3, "%");
    			}
    			if (bbs.getDate() != null && !bbs.getDate().equals("")) {
    				pStmt.setString(4, bbs.getDate());
    			}
    			else {
    				pStmt.setString(4, "%");
    			}
    			if (bbs.getDate() != null && !bbs.getDate().equals("")) {
    				pStmt.setString(4, bbs.getDate());
    			}
    			else {
    				pStmt.setString(4, "%");
    			}
    			//追加
    			if (bbs.getBbsid() != 0) {
    				pStmt.setInt(4, bbs.getBbsid());
    			}
    			else {
    				pStmt.setString(4, "%");
    			}
    		
        		ResultSet rs = pStmt.executeQuery();
        		// id,name,commentを格納するリスト
                List<Bbs> list = new ArrayList<>();
                while (rs.next()) {
    				Bbs b = new Bbs(
    				rs.getString("USER_ID"),
    				rs.getString("NAME"),
    				rs.getString("CHATTEXT"),
    				rs.getString("DATE"),
    				rs.getInt("VISITOR"),
    				rs.getInt("BBSID")
    				);
    				list.add(b);
    			}
                return list;
        	}
                
        }catch(ClassNotFoundException | SQLException e) {
        	throw new RuntimeException(e);
        }
    }
 public  List<Bbs> selectAll() {
    	
        final String jdbcId = "sa";
        final String jdbcPass = "";
        final String jdbcUrl = "jdbc:h2:file:C:/dojo6/data/suDB";
        
        System.out.println("Connected....");
        
        try {
        	DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);
        	
        	Class.forName("org.h2.Driver");
        	try(Connection connection = DriverManager.getConnection(jdbcUrl,jdbcId,jdbcPass);){
        		PreparedStatement pStmt = connection.prepareStatement("SELECT * FROM BBS");
        		ResultSet rs = pStmt.executeQuery();
        		// id,name,commentを格納するリスト
                List<Bbs> list = new ArrayList<>();
                while (rs.next()) {
                    rs.getString("USER_ID");
                    rs.getString("NAME");
                    rs.getString("CHATTEXT");
                    rs.getString("DATE");
                    rs.getInt("VISITOR");
                    rs.getInt("BBSID");
        	}
                return list;
        	}
                
        }catch(ClassNotFoundException | SQLException e) {
        	throw new RuntimeException(e);
        }
    }
 //update method
}

