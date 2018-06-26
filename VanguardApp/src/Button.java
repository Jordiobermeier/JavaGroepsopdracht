import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Button extends JPanel {

	static JFrame frame;

	Image background;

int TotalPower, CurrentPower,BonusPower, BasePower; 
	public Button() {
		JButton endTurn = new JButton("Turn End");
		EndTurnHandler turnEnd = new EndTurnHandler();
		JButton reset = new JButton("reset");
		JButton apply = new JButton("Apply");
		reset.addActionListener(new Reset());
		apply.addActionListener(new Apply());
		add(reset);
		add(endTurn);
		add(apply);
		endTurn.addActionListener(turnEnd);
	}
	
	class EndTurnHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			BasePower = Integer.parseInt(Controller.circle.inputBase.getText());
			Controller.circle.outputTotal.setText("" + BasePower);
			Controller.circle.inputPower.setText("" + 0);
		}
	}
	class Apply implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			CurrentPower = Integer.parseInt(Controller.circle.outputTotal.getText());
			BonusPower = Integer.parseInt(Controller.circle.inputPower.getText());
			TotalPower = CurrentPower + BonusPower;
			System.out.print(TotalPower);
			Controller.circle.outputTotal.setText("" + TotalPower);
		}
	}
	class Reset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Controller.circle.inputBase.setText("" + 0);
			Controller.circle.outputTotal.setText("" + 0);
			Controller.circle.inputPower.setText("" + 0);
		}
	}
}
