package model;
import java.io.Serializable;

public class Graph implements Serializable {
	private String user_id;     //USER_ID
	private String date;        //DATE
	private double dayweight;   //DAYWEIGHT
	private double bmi;         //BMI

	public Graph(String user_id, String date, double dayweight, double bmi) {
		super();
		this.user_id =user_id;
		this.date = date;
		this.dayweight = dayweight;
		this.bmi = bmi;
	}

	public Graph() {
		super();
		this.user_id = "";
		this.date = "";
		//this.dayweight = "";
		//this.bmi = "";
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

	public double getDayweight() {
		return dayweight;
	}

	public void setDayweight(double dayweight) {
		this.dayweight = dayweight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
}