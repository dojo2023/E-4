package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Point;

public class PointDao {
	//現ポイントを+1か－3するメソッド 引数―ユーザID/counter

	//現ポイントをゼロに戻すメソッド 引数なし　void
	public void zero(){
		Connection conn = null;
		try {
			//JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			//UPDATE POINT SET cpoint = 0;
			String sql = "UPDATE POINT SET cpoint = 0";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();
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


	//登録されているユーザの現ポイントを前回のポイントにコピー 引数なし　void
	public void copy() {
		Connection conn = null;
		try {
			//JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			//UPDATE `table` SET test=number;
			String sql = "UPDATE POINT SET cpoint = ppoint";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();
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

	//ユーザ一人分の現在のポイントと過去のポイントを取り出すメソッド 引数―ユーザID
	public Point userPoint(Point point) {
		Connection conn = null;
		Point inf = new Point();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/suDB", "sa", "");

			// SQL文を準備する
			String sql = "select * from POINT WHERE USER_ID= ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1,point.getUser_id());

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			if (rs.next()) {
			Point detail = new Point(
			rs.getString("USER_ID"),
			rs.getInt("CPOINT"),
			rs.getInt("PPOINT")
			);
			inf = detail;
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
				inf = null;
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
				inf = null;
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
						inf = null;
					}
				}
			}
			// 結果を返す
			return inf;
		}
	}