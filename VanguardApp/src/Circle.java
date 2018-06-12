import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Circle extends JPanel {
	JTextField inputBase, inputPower, outputTotal;
	public Circle() {
		inputBase = new JTextField( 10 );
		inputPower = new JTextField( 10 );
		outputTotal = new JTextField( 10 );
		
		add( inputBase );
		add( inputPower );
		add( outputTotal );
		
		inputBase.setBounds(10,10,200,40);
		inputPower.setBounds(10,10,200,40);
		outputTotal.setBounds(10,10,200,40);
		
}
}