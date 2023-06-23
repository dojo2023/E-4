/*package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Bbs;

public class FindChattextDAO {

    public  List<Bbs> select(Bbs bbs) {
    	
        final String jdbcId = "sa";
        final String jdbcPass = "";
        final String jdbcUrl = "jdbc:h2:file:C:/dojo6/data/suDB";
        
        System.out.println("Connected....");
        
        try {
        	DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);
        	
        	Class.forName("org.h2.Driver");
        	try(Connection connection = DriverManager.getConnection(jdbcUrl,jdbcId,jdbcPass);){
        		PreparedStatement pStmt = connection.prepareStatement("SELECT * FROM BBS WHERE USER_ID LIKE ? AND NAME LIKE ? AND CHATTEXT LIKE ? AND DATE LIKE ?");
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
    		
        		ResultSet rs = pStmt.executeQuery();
        		// id,name,commentを格納するリスト
                List<Bbs> list = new ArrayList<>();
                while (rs.next()) {
    				Bbs b = new Bbs(
    				rs.getString("USER_ID"),
    				rs.getString("NAME"),
    				rs.getString("CHATTEXT"),
    				rs.getString("DATE"),
    				rs.getInt("VISITOR")
    				);
    				list.add(b);
    			}
                return list;
        	}
                
        }catch(ClassNotFoundException | SQLException e) {
        	throw new RuntimeException(e);
        }
    }
 public  List<Bbs> selectAll(Bbs bbs) {
    	
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
        	}
                return list;
        	}
                
        }catch(ClassNotFoundException | SQLException e) {
        	throw new RuntimeException(e);
        }
    }
}

                    /*rs.close();
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
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed.");
            return null;
        }
        return list;

    }

}*/