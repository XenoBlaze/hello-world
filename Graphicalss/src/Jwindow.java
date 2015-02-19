import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Jwindow extends JFrame {

	private static final long serialVersionUID = 1L;
	public Jwindow(){
	super("Aneeshes JAva GarphicsUI Window");
	setSize(900,600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JPanel p = new JPanel();
	JButton b = new JButton("Start");
	JPanel Ch = new JPanel();
	JCheckBox cb = new JCheckBox("Already Have an Account ");
	JCheckBox cb2 = new JCheckBox("Don't Have an acoount , need to register");
	Ch.add(cb,BorderLayout.NORTH);
	Ch.add(cb2,BorderLayout.NORTH);
	add(Ch);
	p.add(b,BorderLayout.SOUTH);
	add(p);
	
	
}
}
