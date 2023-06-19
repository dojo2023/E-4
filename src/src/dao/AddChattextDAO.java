package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Board;

public class AddChattextDAO {

    // DBにid,name,commentを加えるメソッド
    public AddChattextDAO(Board bo) {

        if(bo.getName().isEmpty()) {
            bo.setName( "名無し");
        }
        if(bo.getChattext().isEmpty()) {
            bo.setChattext( "コメント無し");
        }


        final String jdbcId = "user_id";
        final String jdbcPass = "password";
        final String jdbcUrl = "jdbc:h2:file:C:/dojo6/data/suDB";

        Connection con = null;

        try {

            con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);

            System.out.println("Connected....");

            try {

                PreparedStatement ps = con.prepareStatement("INSERT INTO board (name, chattext) VALUES (?, ?)");

                ps.setString(1, bo.getName());
                ps.setString(2, bo.getChattext());

                // ひな形を送信
                int r = ps.executeUpdate();

                if (r != 0) {
                    System.out.println(r + "件の書き込みを追加しました。");
                } else {
                    System.out.println("書き込みできませんでした。");
                }

                ps.close();

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

    }

}
