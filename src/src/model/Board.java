package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable {
    private int id;
    private String name;
    private String chattext;
    private Timestamp date;
	private int counter;


    public Timestamp getDate() {
        return date;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
	public int getCounter() {
		// TODO 自動生成されたメソッド・スタブ
		return counter;
	}
	public void setCounter(int counter) {
		// TODO 自動生成されたメソッド・スタブ
		this.counter = counter;
	}

}