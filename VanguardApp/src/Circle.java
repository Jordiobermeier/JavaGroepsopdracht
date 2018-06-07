import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class Circle extends VanguardApp {
	JTextField inputBase, inputPower, outputTotal;
	JButton reset;
	public Circle() {
		inputBase = new JTextField( 10 );
		inputPower = new JTextField( 10 );
		outputTotal = new JTextField( 10 );

		reset = new JButton();
		
		reset.addActionListener( new resetHandler() );
		
		add( inputBase );
		add( inputPower );
		add( outputTotal );
		add( reset );
		
		}
	class resetHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
}
}
}