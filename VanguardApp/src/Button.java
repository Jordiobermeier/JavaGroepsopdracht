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
		
		ResetHandler Reset = new ResetHandler();
		reset.addActionListener(Reset);
		
		ApplyHandler Apply = new ApplyHandler();
		apply.addActionListener(Apply);
	
	}

	class EndTurnHandler implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			JDialog d = new JDialog ( frame, "Turn End", true);
			d.setLocationRelativeTo(frame);
			d.setVisible(true);
		}
	}
	
	class ResetHandler implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			// Doe iets
		}
	}
	
	class ApplyHandler implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			// Doe iets
		}
	}
	
}


