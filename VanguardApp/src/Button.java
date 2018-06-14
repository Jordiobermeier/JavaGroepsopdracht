import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Button extends JPanel {

	static JFrame frame;
	
	int i = 0;
	int j = 600;
	int k = 20;
	int l = 20;
	
	public Button() {
			
		JButton endTurn = new JButton("Turn End");
		JButton reset = new JButton("Reset");
		JButton apply = new JButton("Apply");
		
		add(endTurn);
		add(reset);
		add(apply);
		        
		EndTurnHandler turnEnd = new EndTurnHandler();
		endTurn.addActionListener(turnEnd);
		
		EndTurnHandler Reset = new EndTurnHandler();
		reset.addActionListener(Reset);
		
		EndTurnHandler Apply = new EndTurnHandler();
		apply.addActionListener(Apply);
	
	}

	class EndTurnHandler implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			JDialog d = new JDialog ( frame, "Turn End", true);
			d.setLocationRelativeTo(frame);
			d.setVisible(true);
		}
	}
	
	class Reset implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			// Doe iets
		}
	}
	
	class Apply implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			// Doe iets
		}
	}
	
}


