package Edu.Java.BlueDot_2.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 * 
 * @author MangoDai 2016��10��1������8:45:00
 *
 */
public class MyButton extends JButton{
	private static final long serialVersionUID = 1L;
	public MyButton(String string) {
		super(string);
//		this.setBounds(100, 100, width, height);
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("��ѯ")){
					System.out.println(e.getActionCommand());
				}
				else{
					if(e.getActionCommand().equals("ɾ��")){
						System.out.println(e.getActionCommand());
					}
					else{
						if(e.getActionCommand().equals("����")){
							System.out.println(e.getActionCommand());
						}
						else{
							if(e.getActionCommand().equals("�˳�")){
								System.exit(0);
							}
							else{
								JOptionPane.showMessageDialog(null, "�����ʲô���⣿");
							}
						}
					}
				}
			}
		});
	}


}
