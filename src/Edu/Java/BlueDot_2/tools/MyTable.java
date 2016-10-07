package Edu.Java.BlueDot_2.tools;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import Edu.Java.BlueDot_2.Contacts.User;

public class MyTable extends JTable {
	private static final long serialVersionUID = 1L;
	private static String[] rowNum = {"序号","姓名","电话号码"};
	public static MyTable initi(ArrayList<User> list){
		Object[][] obj = new Object[list.size()][3];
//		obj[0][0]="序号";
//		obj[0][1]="姓名";
//		obj[0][2]="电话号码";
		for (int i = 0; i < list.size(); i++) {
				User u = list.get(i);
				obj[i][0] = i+1;
				obj[i][1] = u.getName();
				obj[i][2] = u.getTelnum(); 
		}
//		DefaultTableModel tableModel = new DefaultTableModel(obj, rowNum);
		MyTable jt = new MyTable(obj,rowNum);
		jt.setEnabled(false);
//		jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		return jt;
	}
	public MyTable() {
		super();
	}

	public MyTable(int numRows, int numColumns) {
		super(numRows, numColumns);
		// TODO Auto-generated constructor stub
	}

	public MyTable(Object[][] rowData, Object[] columnNames) {
		super(rowData, columnNames);
		// TODO Auto-generated constructor stub
	}

	public MyTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
		super(dm, cm, sm);
		// TODO Auto-generated constructor stub
	}

	public MyTable(TableModel dm, TableColumnModel cm) {
		super(dm, cm);
		// TODO Auto-generated constructor stub
	}

	public MyTable(TableModel dm) {
		super(dm);
		// TODO Auto-generated constructor stub
	}



//	public static void main(String args[]){
//		ArrayList<User> list = FileManager.getAll();
//		MyTable temp = MyTable.initi(list);
////		int numbers = list.size();
////		User u[] = new User[numbers];
////		for (int i = 0; i < u.length; i++) {
////			u[i]=list.get(i);
////		}
//		
//		JFrame frame = new JFrame("JTable Demo");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(300, 500);
//		frame.setResizable(false);
//		frame.setLocationRelativeTo(null);
//		frame.getContentPane().add(temp);
//		frame.setVisible(true);
//	}
}
