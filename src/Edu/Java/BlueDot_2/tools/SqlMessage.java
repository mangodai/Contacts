package Edu.Java.BlueDot_2.tools;

public class SqlMessage {
	private String massege;
	private boolean result;
	public SqlMessage(){
		super();
	}
	public SqlMessage(String massege, boolean result) {
		super();
		this.massege = massege;
		this.result = result;
	}
	public String getMassege() {
		return massege;
	}
	public void setMassege(String massege) {
		this.massege = massege;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
}
