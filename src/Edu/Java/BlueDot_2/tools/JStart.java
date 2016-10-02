package Edu.Java.BlueDot_2.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Edu.Java.BlueDot_2.Contacts.ContactsMain;
/**
 * 
 * @author MangoDai 2016年10月2日下午3:24:11
 *
 */
public class JStart extends JMenu {

	private static final long serialVersionUID = 1L;
	public JStart(String string) {
		super();
		this.setText(string);
		this.addSeparator();
		JMenuItem search = new JMenuItem("查询联系人");
		search.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				 
			}
			
		});
		JMenuItem deleter = new JMenuItem("删除联系人");
		JMenuItem addSon= new JMenuItem("增加联系人");
		this.add(search);
		this.add(deleter);
		this.add(addSon);
	}

}
