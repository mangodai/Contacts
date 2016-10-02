package Edu.Java.BlueDot_2.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
/**
 * 
 * @author MangoDai 2016年10月2日下午3:05:31
 *
 */
public class JHelp extends JMenu {
	private JMenuItem about = new JMenuItem("关于");
	private JMenuItem exit = new JMenuItem("退出");
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
				JOptionPane.showMessageDialog(null, "蓝点知识梳理作业，By戴超");
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
