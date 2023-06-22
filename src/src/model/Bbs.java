package model;

import java.io.Serializable;

public class Bbs implements Serializable {
    private String user_id;
    private String name;
    private String chattext;
    private String date;
	private int visitor;
	private int bbsid;
	
	public Bbs(String user_id, String name, String chattext, String date, int visitor, int bbsid ) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.chattext = chattext;
		this.date = date;
		this.visitor = visitor;
		this.bbsid = bbsid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getVisitor() {
		return visitor;
	}
	public void setVisitor(int visitor) {
		this.visitor = visitor;
	}
	public int getBbsid() {
		return bbsid;
	}
	public void setBbsid(int bbsid) {
		this.bbsid = bbsid;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


}