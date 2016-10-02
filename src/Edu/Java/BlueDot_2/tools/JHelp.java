package Edu.Java.BlueDot_2.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
/**
 * 
 * @author MangoDai 2016��10��2������3:05:31
 *
 */
public class JHelp extends JMenu {
	private JMenuItem about = new JMenuItem("����");
	private JMenuItem exit = new JMenuItem("�˳�");
	private static final long serialVersionUID = 1L;

	public JHelp(String string) {
		super(string);
		addItem();
	}
	private void addItem() {
		this.add(about);
		this.add(exit);
		this.addSeparator();
		about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����֪ʶ������ҵ��By����");
			}
		});
		exit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
	}
	


}
