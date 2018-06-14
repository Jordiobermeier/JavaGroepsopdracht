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

	public Button() {
		JButton endTurn = new JButton("Turn End");
		EndTurnHandler turnEnd = new EndTurnHandler();
		JButton reset = new JButton("reset");
		JButton apply = new JButton("Apply");
		add(reset);
		add(endTurn);
		add(apply);
		endTurn.addActionListener(turnEnd);
		setVisible(true);

		try {
			background = ImageIO.read(new File("bg.jpg"));
		} catch (IOException e) {
			System.out.println("Fout bij het laden van de achtergrond afbeelding. " + e.getMessage());
		}

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, this);
		System.out.print(background);
	}
	
	class EndTurnHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JDialog d = new JDialog(frame, "Turn End", true);
			d.setLocationRelativeTo(frame);
			d.setVisible(true);
		}
	}
}
