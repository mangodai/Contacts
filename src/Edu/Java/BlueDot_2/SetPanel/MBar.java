package Edu.Java.BlueDot_2.SetPanel;

import javax.swing.JMenuBar;

import Edu.Java.BlueDot_2.tools.JHelp;
import Edu.Java.BlueDot_2.tools.JStart;

public class MBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	public JHelp help = new JHelp("°ïÖú"); 
	public JStart start = new JStart("¿ªÊ¼"); 
 	public MBar() {
		super();
		this.add(start);
		this.add(help);
	}
 	
	
	
	
}
