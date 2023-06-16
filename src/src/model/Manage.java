package model;
import java.io.Serializable;

public class Manage implements Serializable {
	private String user_id;     //USER_ID
	private String date;        //DATE
	private String breakfast;   //BREAKFAST
	private String bftext;      //BFTEXT
	private String lunch;       //LUNCH
	private String lctext;      //LCTEXT
	private String dinner;      //DINNER
	private String dntext;      //DNTEXT
	private int snack;          //SNACK
	private int exercise;       //EXERCISE
	private int drink;          //DRINK
	private double dayweight;   //DAYWEIGHT
	private String picture;      //PICTURE
	private double bmi;         //BMI

	public Manage(String user_id, String date, String breakfast, String bftext, String lunch, String lctext, String dinner
           , String dntext, int snack, int exercise, int drink, double dayweight, String picture, double bmi) {
		super();
		this.user_id =user_id;
		this.date = date;
		this.breakfast = breakfast;
		this.bftext = bftext;
		this.lunch = lunch;
		this.lctext = lctext;
		this.dinner = dinner;
		this.dntext = dntext;
		this.snack = snack;
		this.exercise = exercise;
		this.drink = drink;
		this.dayweight = dayweight;
		this.picture = picture;
		this.bmi = bmi;
	}

	public Manage() {
		super();
		this.user_id = "";
		this.date = "";
		this.breakfast = "";
		this.bftext = "";
		this.lunch = "";
		this.lctext = "";
		this.dinner = "";
		this.dntext = "";
		//this.snack = "";
		//this.exercise = "";
		//this.drink = "";
		//this.dayweight = "";
		this.picture = "";
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

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getBftext() {
		return bftext;
	}

	public void setBftext(String bftext) {
		this.bftext = bftext;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getLctext() {
		return lctext;
	}

	public void setLctext(String lctext) {
		this.lctext = lctext;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getDntext() {
		return dntext;
	}

	public void setDntext(String dntext) {
		this.dntext = dntext;
	}

	public int getSnack() {
		return snack;
	}

	public void setSnack(int snack) {
		this.snack = snack;
	}

	public int getExercise() {
		return exercise;
	}

	public void setExercise(int exercise) {
		this.exercise = exercise;
	}

	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}

	public double getDayweight() {
		return dayweight;
	}

	public void setDayweight(double dayweight) {
		this.dayweight = dayweight;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
}
