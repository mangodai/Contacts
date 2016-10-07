package Edu.Java.BlueDot_2.SetPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Edu.Java.BlueDot_2.Contacts.User;
import Edu.Java.BlueDot_2.tools.DropButton;
import Edu.Java.BlueDot_2.tools.FileManager;
import Edu.Java.BlueDot_2.tools.MyCenter;
import Edu.Java.BlueDot_2.tools.MyTable;
import Edu.Java.BlueDot_2.tools.SqlMessage;

/**
 * Search.java
 * 
 * @author Deri Oct 3, 20167:21:42 PM 创建一个查找类
 */
public class Search extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField jtf = new JTextField(20);
	private JButton sure = new JButton("确定");
	private DropButton drop = new DropButton("删除你所查询的数据");
	private JPanel panel = new JPanel();
	private JPanel head = new JPanel();
	private MyCenter center = new MyCenter(new FlowLayout());
	private JScrollPane jsp = null;
	private JLabel l1 = new JLabel("请输入数据：[模糊]电话");
	
	private ArrayList<User> list = null;

	// private JTableModen tableModen
	public Search(String string) {
		super(string);
		initi();
		System.gc();
		this.getContentPane().add(panel);
		// this.getContentPane().setLayout(new BorderLayout(5,5));
		panel.add(addHead(), BorderLayout.NORTH);
		panel.add(addCenter(), BorderLayout.CENTER);
	}

	private void initi() {
		// this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 600);
		// this.setSize(500, 500);
		setJMenuBar(new MBar());
		// this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	private JPanel addCenter() {
		list = FileManager.getAll();
		JTable table = addTables(list);
		jsp = new JScrollPane(table);
		center.add(jsp, BorderLayout.CENTER);
		return center;
	}

	private JTable addTables(ArrayList<User> temp) {
		MyTable jt = MyTable.initi(list);
		;
		return jt;
	}

	// private JTable addTable() {
	// String[] rowNum = tableHead();
	// tableModel = new DefaultTableModel(data, rowNum);
	// table = new JTable(tableModel);
	// table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// 自动调整尺寸模式
	// tableModel.addRow(tableHead());
	// addRow();
	// // table.disable();
	// table.setEnabled(false);
	// return table;
	// }
	private JPanel addHead() {
		head.add(l1);
		head.add(jtf);
		head.add(sure);
		head.setBorder(BorderFactory.createTitledBorder("查询区"));
		sure.addActionListener(new SureListener());
		return head;
	}

	private class SureListener implements ActionListener {
		Search temp = Search.this;

		@Override
		public void actionPerformed(ActionEvent e) {
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			temp.center.removeAll();
			temp.center.updateUI();
			temp.center.add(panel);
			String key = temp.jtf.getText().trim();
			temp.jtf.setText("");
			System.out.println(key);
			if (!key.equals("")) {
				list = FileManager.get(key);
				panel.add(drop, BorderLayout.NORTH);
			} else {
				list = FileManager.getAll();
			}
			JTable table = temp.addTables(list);
			jsp = new JScrollPane(table);
			panel.add(jsp, BorderLayout.CENTER);
			drop.addActionListener(new DropListener());

		}

	}
	private class DropListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.YES_OPTION == JOptionPane
					.showConfirmDialog(null, "确认删除这些数据？", "确认对话框",
							JOptionPane.YES_NO_OPTION)) {
				System.out.println("用户确认删除");
				SqlMessage result = drop.delete(list);
				if (!result.isResult()) {
					JOptionPane.showMessageDialog(null, result.getMassege());
				} else {
					JOptionPane.showMessageDialog(null, "请点击确定刷新");
					
				}
				/*
				list = FileManager.getAll();
				JTable table = addTables(list);
				jsp = new JScrollPane(table);
				s.validate();*/
				Search s =Search.this;
				s.panel.removeAll();	
				s.panel.add(addHead(), BorderLayout.NORTH);
				s.panel.add(addCenter(), BorderLayout.CENTER);
				s.panel.updateUI();
				s.panel.validate();
			}else{
				System.out.println("用户取消");
			}
		}
	}

}
