package Edu.Java.BlueDot_2.tools;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyCenter extends JPanel {
	private static final long serialVersionUID = 1L;

	public MyCenter() {
		super();
		this.setBorder(BorderFactory.createTitledBorder("数据区"));
		this.setLayout(new BorderLayout());
		// TODO Auto-generated constructor stub
	}

	public MyCenter(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		this.setBorder(BorderFactory.createTitledBorder("数据区"));
		this.setLayout(new BorderLayout());
		// TODO Auto-generated constructor stub
	}

	public MyCenter(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		this.setBorder(BorderFactory.createTitledBorder("数据区"));
		this.setLayout(new BorderLayout());
		// TODO Auto-generated constructor stub
	}

	public MyCenter(LayoutManager layout) {
		super(layout);
		this.setBorder(BorderFactory.createTitledBorder("数据区"));
		this.setLayout(new BorderLayout());
		// TODO Auto-generated constructor stub
	}

}
