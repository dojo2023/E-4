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
  // データベース接続と結果取得のための変数
  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  //全件取得用メソッド
  public List<Bbs> selectAllBbs() {
    // メソッドの結果として返すリスト
    List<Bbs> results = new ArrayList<Bbs>();

    try {
      //ドライバを読み込み、DBに接続
      this.getConnection();

      // Statementオブジェクトの作成
      pstmt = con.prepareStatement("select * from bbs");

      //Select文実行
      rs = pstmt.executeQuery();

      // 6. 結果を表示する
      while (rs.next()) {
        // 1件ずつCountryオブジェクトを生成して結果を詰める
        Bbs Bbs = new Bbs();
        Bbs.setId(rs.getInt("use_id"));
        Bbs.setName(rs.getString("name"));
        Bbs.setChattext(rs.getString("chattext"));

        // リストに追加
        results.add(Bbs);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      this.close();
    }

    return results;
  }

  //1件登録用メソッド
  public void insertBbs(Bbs bbs) {

    try {
      //ドライバを読み込み、DBに接続
      this.getConnection();

      // Statementオブジェクトの作成
      pstmt = con.prepareStatement("insert into bbs(name,content) values(?,?)");

      pstmt.setString(1, bbs.getName());
      pstmt.setString(2, bbs.getChattext());



      //Select文実行
      pstmt.executeUpdate();



    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      this.close();
    }
  }



  public void getConnection() throws SQLException, ClassNotFoundException {
    //ドライバクラス読込
    Class.forName("jdbc:h2:file:C:/dojo6/data/suDB");

    // DBと接続
    con = DriverManager.getConnection("jdbc:mysql://localhost/sample?useSSL=false&characterEncoding=utf8", "sa", "");
    // ※ユーザとパスワードはMySQLに設定済みのものを記載してください。
  }

  private void close() {
    // 接続を閉じる
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (pstmt != null) {
      try {
        pstmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (con != null) {
      try {
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}