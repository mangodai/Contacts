package Edu.Java.BlueDot_2.SetPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Edu.Java.BlueDot_2.tools.MyButton;

/**
 * 
 * @author MangoDai 2016年10月1日下午8:47:20
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
		this.add(buildButton("查询"));
		this.add(buildButton("增加"));
		// this.add(buildButton("删除"));
		this.add(buildButton("退出"));
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
			case "查询":
				System.out.println(e.getActionCommand());
				frame = new Search("通讯录查询");
				break;
			case "删除":
				System.out.println(e.getActionCommand());
				break;
			case "增加":
				System.out.println(e.getActionCommand());
				frame = new Increase("通讯录增加");
				break;

			default:
				System.out.println("不知道你点了什么东西！");
				break;
			}
			frame.setVisible(true);
		}
	}

}
