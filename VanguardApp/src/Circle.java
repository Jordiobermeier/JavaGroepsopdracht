import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



public class Circle extends JPanel {
	JTextField inputBase, inputPower, outputTotal;
	String inputBaseText, inputPowerText, outputTotalText;
	int base,power,total;
	JButton set;
	                              
	public JTextField getInputBase() {
		return inputBase;
	}
	public void setInputBase(JTextField inputBase) {
		this.inputBase = inputBase;
	}
	public int getBase() {
		return base;
	}

	public int Compare() {
	    base = getBase();
		total = base;
		return total;
	}
	public Circle() {
		inputBase = new JTextField( 10 );
		inputBase.setText("" + base);
	
		inputPower = new JTextField( 10 );
		outputTotal = new JTextField( 10 );
		outputTotal.setText("" + total);
		JButton set = new JButton ("set"); 
		add( inputBase );
		add( inputPower );
		add( outputTotal );
		add ( set ); 
		inputBase.setBounds(10,10,200,40);
		inputPower.setBounds(10,10,200,40);
		outputTotal.setBounds(10,10,200,40);
		
		baseInputHandler valueSet = new baseInputHandler();
		set.addActionListener(valueSet);
}
		
	class baseInputHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			base = Integer.parseInt(inputBaseText);
			total = base;
		}
			
		}
		
	
}