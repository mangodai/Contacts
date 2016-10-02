package Edu.Java.BlueDot_2.Contacts;

public class User {
	private String name = null;
	private int telnum = 0;

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
