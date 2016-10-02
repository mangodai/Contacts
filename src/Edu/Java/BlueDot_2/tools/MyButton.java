package Edu.Java.BlueDot_2.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 * 
 * @author MangoDai 2016年10月1日下午8:45:00
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
				if(e.getActionCommand().equals("查询")){
					System.out.println(e.getActionCommand());
				}
				else{
					if(e.getActionCommand().equals("删除")){
						System.out.println(e.getActionCommand());
					}
					else{
						if(e.getActionCommand().equals("增加")){
							System.out.println(e.getActionCommand());
						}
						else{
							if(e.getActionCommand().equals("退出")){
								System.exit(0);
							}
							else{
								JOptionPane.showMessageDialog(null, "你点了什么玩意？");
							}
						}
					}
				}
			}
		});
	}


}
