package model;
import java.io.Serializable;

public class User implements Serializable {
	private String user_id;	  // ID
	private String password; // PW
	private String name;     // ニックネーム
	private Double height;   // 身長
	private Double weight;   // 体重
    private Double target_weight; //目標体重


	public User(String user_id, String password, String name, Double height, Double weight, Double target_weight) {
		this.setUser_id(user_id);
		this.setPassword(password);
		this.setName(name);
		this.setHeight(height);
		this.setWeight(weight);
		this.setTarget_weight(target_weight);
	}

	public User() {
		this.setUser_id("");
		this.setPassword("");
		this.setName("");
		this.setHeight(null);
		this.setWeight(null);
		this.setTarget_weight(null);
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getTarget_weight() {
		return target_weight;
	}

	public void setTarget_weight(Double target_weight) {
		this.target_weight = target_weight;
	}

}
