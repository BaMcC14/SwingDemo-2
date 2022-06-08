package swingDemo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FirstGUI{  				
	
public static void main(String[] argos){
                       
Abc obj = new Abc();
	
	
}//end main method
}//end class FirstGUI

class Abc extends JFrame{
	

	public Abc() {
		
		JLabel l = new JLabel("Welcome");
		add(l);
		
		JLabel l1 = new JLabel("OK");
		add(l1);
		
		
		
		
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}