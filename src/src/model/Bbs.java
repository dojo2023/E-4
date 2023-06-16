package model;
import java.io.Serializable;

public class Bbs implements Serializable {
	private String user_id;
	private String name;
	private int cpoint;
	private String chattext;
	private String date;

	public Bbs(String user_id, int cpoint, String name, String chattext, String date) {
		super();
		this.setUser_id(user_id);
		this.setCpoint(cpoint);
		this.setName(name);
		this.setChattext(chattext);
		this.setDate(date);
	}

	public Bbs() {
		this.setUser_id("");
		this.setCpoint(Integer.parseInt(""));
		this.setName("");
		this.setChattext("");
		this.setName("");
	}
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
	public String getChattext() {
		return chattext;
	}
	public void setChattext(String chattext) {
		this.chattext = chattext;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
