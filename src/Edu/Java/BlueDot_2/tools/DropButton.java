package Edu.Java.BlueDot_2.tools;

import java.util.ArrayList;

import javax.swing.JButton;

import Edu.Java.BlueDot_2.Contacts.User;
/**
 * DropButton.java
 * @author Deri Oct 4, 201610:28:09 AM
 * ����һ��ɾ�����ݿ� ����
 */
public class DropButton extends JButton {

	private static final long serialVersionUID = 1L;
	public static final String LINE = System.getProperty("line.separator");
	private SqlMessage sqlM;
	public DropButton(String string) {
		super(string);
	}
	public SqlMessage delete(ArrayList<User> list){
		sqlM = new SqlMessage("",true);
		StringBuilder sb = new StringBuilder();
		for (User user : list) {
			if(!FileManager.removeUser(user).isResult()){
				sqlM.setResult(false);
//				sb.append(user.getName()+"  ɾ��ʧ��;");
				sb.append(user.getName()+","+user.getTelnum()+"  ɾ��ʧ��;");
			}
		}
		sqlM.setMassege(sb.toString());
		return sqlM;
	}
}
