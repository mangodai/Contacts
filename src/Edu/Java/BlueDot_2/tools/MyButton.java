package Edu.Java.BlueDot_2.tools;

import java.awt.Font;

import javax.swing.JButton;
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
		this.setFont(new Font("����", Font.PLAIN, 15));
		
	}


}
