package Edu.Java.BlueDot_2.Contacts;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import Edu.Java.BlueDot_2.SetPanel.*;
/**
 * 
 * @author MangoDai 2016��10��1������8:39:52
 * ����һ��������
 */
public class ContactsMain extends JFrame{
	private static final long serialVersionUID = 1L;
	private static JPanel buttons = null;
	private JMenuBar menu=null;
	public ContactsMain(String string) {
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 500);
		this.setResizable(false);
		this.setTitle(string);
		this.setLocationRelativeTo(null);
		addMenu();
		addButtons();
	}	

	private void addButtons() {
		if(buttons == null ){
			buttons = new Buttons();
		}
		this.setLayout(new BorderLayout(5,5));
		this.add(buttons);
	}

	private void addMenu() {
		if(menu == null ){
			menu = new MBar();
		}
		this.setJMenuBar(menu);
	}

	public static void main(String[] args) {
		ContactsMain frame = new ContactsMain("ͨѶ¼_����_����֪ʶ����");
		frame.setVisible(true);
	}
	
	

}
