package model;
import java.io.Serializable;

public class Title implements Serializable {
	private String title_id;
	private int title_point;
	private String title_name;
	private String title_image;

	public Title(String title_id , int title_point , String title_name , String title_image) {
		super();
		this.setTitle_id(title_id);
		this.setTitle_point(title_point);
		this.setTitle_name(title_name);
		this.setTitle_image(title_image);
	}

	public Title() {
		this.setTitle_id("");
		this.setTitle_point(Integer.parseInt(""));
		this.setTitle_name("");
		this.setTitle_image("");
	}

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public int getTitle_point() {
		return title_point;
	}

	public void setTitle_point(int title_point) {
		this.title_point = title_point;
	}

	public String getTitle_name() {
		return title_name;
	}

	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}

	public String getTitle_image() {
		return title_image;
	}

	public void setTitle_image(String title_image) {
		this.title_image = title_image;
	}

}
