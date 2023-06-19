package model;
import java.io.Serializable;

public class ManageSlide implements Serializable {
	private String user_id;     //USER_ID
	private String date;        //DATE
	private String picture;      //PICTURE

	public ManageSlide(String user_id, String date, String picture) {
		super();
		this.user_id =user_id;
		this.date = date;
		this.picture = picture;
	}

	public ManageSlide() {
		super();
		this.user_id = "";
		this.date = "";
		this.picture = "";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}