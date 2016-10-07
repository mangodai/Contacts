package Edu.Java.BlueDot_2.SetPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Edu.Java.BlueDot_2.tools.MyButton;

/**
 * 
 * @author MangoDai 2016��10��1������8:47:20
 *
 */
public class Buttons extends JPanel {
	private static final long serialVersionUID = 1L;
	private ButtonAciton bl = new ButtonAciton();
	public JFrame frame = null;
	// private HashMap<String,MyButton> bSet = new HashMap<String,MyButton>();
	public Buttons() {
		super();
		// this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		// this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setLayout(new GridLayout(3, 1));
		// this.setLayout(new GridLayout(4,1));
		addButton();
	}

	private void addButton() {
		this.add(buildButton("��ѯ"));
		this.add(buildButton("����"));
		// this.add(buildButton("ɾ��"));
		this.add(buildButton("�˳�"));
	}

	public MyButton buildButton(String name) {
		MyButton btn = new MyButton(name);	
		
		btn.addActionListener(bl);
		return btn;
	}
	
	private class ButtonAciton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

//			Buttons panel = Buttons.this;
//			panel.removeAll();
//			panel.updateUI();
//			panel.setLayout(new BorderLayout(5,5));
			if(frame != null){
				frame.setVisible(false);
				frame=null;
			}
			switch (e.getActionCommand()) {
			case "��ѯ":
				System.out.println(e.getActionCommand());
				frame = new Search("ͨѶ¼��ѯ");
				break;
			case "ɾ��":
				System.out.println(e.getActionCommand());
				break;
			case "����":
				System.out.println(e.getActionCommand());
				frame = new Increase("ͨѶ¼����");
				break;

			default:
				System.out.println("��֪�������ʲô������");
				break;
			}
			frame.setVisible(true);
		}
	}

}
