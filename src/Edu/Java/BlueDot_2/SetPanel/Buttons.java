package Edu.Java.BlueDot_2.SetPanel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import Edu.Java.BlueDot_2.tools.MyButton;
/**
 * 
 * @author MangoDai 2016��10��1������8:47:20
 *
 */
public class Buttons extends JPanel {
	private static final long serialVersionUID = 1L;
//	private HashMap<String,MyButton> bSet = new HashMap<String,MyButton>();
	public Buttons() {
		super();
//		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setLayout(new GridLayout(4,1));
		addButton();
	}
	private void addButton() {
		this.add(new MyButton("��ѯ"));
		this.add(new MyButton("����"));
		this.add(new MyButton("ɾ��"));
		this.add(new MyButton("�˳�"));
	}
	
}
