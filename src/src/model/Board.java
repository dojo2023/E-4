package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable {
    private String name;
    private String chattext;
    private Timestamp date;
    private int cpoint;
    
    private String titlename;
    private String titleimage;
    

    public Timestamp getDate() {
        return date;
    }
    public void setDate(Timestamp date) {
        this.date = date;
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
	public int getCpoint() {
		return cpoint;
	}
	public void setCpoint(int cpoint) {
		this.cpoint = cpoint;
	}
	public String getTitlename() {
		return titlename;
	}
	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}
	public String getTitleimage() {
		return titleimage;
	}
	public void setTitleimage(String titleimage) {
		this.titleimage = titleimage;
	}

}

