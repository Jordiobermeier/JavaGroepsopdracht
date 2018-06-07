import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Button extends JPanel {

	static JFrame frame;
	
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

}
    class EndTurnHandler implements ActionListener {
    public void actionPerformed( ActionEvent e) {
    JDialog d = new JDialog ( frame, "Turn End", true);
    d.setLocationRelativeTo(frame);
    d.setVisible(true);
    }
    }
}


