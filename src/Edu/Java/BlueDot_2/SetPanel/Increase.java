package Edu.Java.BlueDot_2.SetPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Edu.Java.BlueDot_2.Contacts.User;
import Edu.Java.BlueDot_2.tools.FileManager;
import Edu.Java.BlueDot_2.tools.MyTextField;
/**
 * Increse.java
 * @author Deri Oct 3, 20169:16:51 PM
 *
 */
public class Increase extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JLabel lblTel;
	private MyTextField telnum;
	private JButton button2;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Increse frame = new Increse();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @param string 
	 */
	public Increase(String string) {
		super(string);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(new MBar());
		System.gc();
		setSize(500, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("宋体", Font.PLAIN, 14));
		lblName.setBounds(76, 36, 200, 50);
		contentPane.add(lblName);

		name = new JTextField();
		name.setBounds(134, 51, 142, 21);
		contentPane.add(name);
		name.setColumns(10);

		lblTel = new JLabel("Tel  :");
		lblTel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblTel.setBounds(76, 82, 200, 50);
		contentPane.add(lblTel);

		telnum = new MyTextField();
		telnum.setColumns(10);
		telnum.setBounds(134, 96, 142, 21);
		contentPane.add(telnum);

		JButton button = new JButton("确定");
//		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBounds(78, 195, 70, 32);
		button.addActionListener(new B1());
		contentPane.add(button);

		button2 = new JButton("重置");
//		button2.setFont(new Font("宋体", Font.PLAIN, 15));
		button2.setBounds(237, 195, 70, 32);
		button2.addActionListener(new B2());
		contentPane.add(button2);
	}
	private class B2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Increase temp = Increase.this;
			temp.telnum.setText("");
			temp.name.setText("");
		}
		
	}
	
	private class B1 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Increase temp = Increase.this;
			User u = new User();
			u.setName(temp.name.getText());
			int num = Integer.parseInt(temp.telnum.getText());
			u.setTelnum(num);
			System.out.println(u.toString());
			temp.telnum.setText("");
			temp.name.setText("");
			FileManager.addUser(u);
		}
		
	}
}
