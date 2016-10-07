package Edu.Java.BlueDot_2.tools;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 * myTextField.java
 * 
 * @author Deri Aug 22, 20168:06:27 PM 自定义一个只能输入数字的文本类
 */
public class MyTextField extends JTextField {

	private static final long serialVersionUID = 1L;

	public MyTextField() {
		super();
		myListener();
	}

	public MyTextField(Document doc, String text, int columns) {
		super(doc, text, columns);
		myListener();
	}

	public MyTextField(int columns) {
		super(columns);
		myListener();
	}

	public MyTextField(String text, int columns) {
		super(text, columns);
		myListener();
	}

	public MyTextField(String text) {
		super(text);
		myListener();
	}

	private void myListener() {
			final String temp = this.getText();
			this.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e){
					int keyChar=e.getKeyChar();
					if(temp.length()>12){
						e.consume();
					}
					if (keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9) {

					}else if(keyChar==KeyEvent.VK_SPACE){
						
					}else{
						e.consume(); 			
						System.out.println(temp.length());
					}
					
				}
			});
			System.out.println(temp.length());
		}

	/*
	 * protected Document createDefaultModel() { return new NumberDocument(); }
	 * 
	 * private static class NumberDocument extends PlainDocument {
	 * 
	 * private static final long serialVersionUID = 1L;
	 * 
	 * public void insertString(int offs, String str, AttributeSet a) throws
	 * BadLocationException {
	 * 
	 * if (str == null) { return; } char[] upper = str.toCharArray(); char[]
	 * temp = new char[upper.length]; for (int i = 0; i < upper.length; i++) {
	 * if (upper[i] >= '0' && upper[i] <= '9') { temp[i] = upper[i]; }
	 * 
	 * } super.insertString(offs, new String(temp).trim(), a); } }
	 */

}
