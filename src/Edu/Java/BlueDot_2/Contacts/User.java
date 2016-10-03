package Edu.Java.BlueDot_2.Contacts;

public class User {
	private String name = null;
	private int telnum = 0;
	private int user_id = 0;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public User(){
		super();
	}
	public User(String name, int telnum) {
		super();
		this.name = name;
		this.telnum = telnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelnum() {
		return telnum;
	}

	public void setTelnum(int telnum) {
		this.telnum = telnum;
	}
}
