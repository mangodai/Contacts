package Edu.Java.BlueDot_2.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Edu.Java.BlueDot_2.Contacts.ContactsMain;
/**
 * 
 * @author MangoDai 2016��10��2������3:24:11
 *
 */
public class JStart extends JMenu {

	private static final long serialVersionUID = 1L;
	public JStart(String string) {
		super();
		this.setText(string);
		this.addSeparator();
		JMenuItem search = new JMenuItem("��ѯ��ϵ��");
		search.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				 
			}
			
		});
		JMenuItem deleter = new JMenuItem("ɾ����ϵ��");
		JMenuItem addSon= new JMenuItem("������ϵ��");
		this.add(search);
		this.add(deleter);
		this.add(addSon);
	}

}
