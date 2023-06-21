package model;
import java.io.Serializable;

public class Point implements Serializable {
	//privateなので外から書き込みできないget setで読み書きができるようになる
	private String user_id;
	private int cpoint;
	private int ppoint;

	//コンストラクタ設定
	public Point(String user_id, int cpoint, int ppoint) {
		this.user_id = user_id;
		this.cpoint = cpoint;
		this.ppoint = ppoint;
	}

	//初期値設定
	public Point() {
		this.user_id = "";
		this.cpoint = 0;
		this.ppoint = 0;
	}

	//get set
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getCpoint() {
		return cpoint;
	}
	public void setCpoint(int cpoint) {
		this.cpoint = cpoint;
	}
	public int getPpoint() {
		return ppoint;
	}
	public void setPpoint(int ppoint) {
		this.ppoint = ppoint;
	}
}
