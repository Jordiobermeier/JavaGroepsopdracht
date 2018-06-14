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
		
}
}