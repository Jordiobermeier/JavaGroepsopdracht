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
        JButton reset = new JButton("reset");
        JButton apply = new JButton("Apply");
        
        reset.setBounds(800, 10, 400, 20);
        endTurn.setBounds(600, 10, 400, 20);
        apply.setBounds(1000, 10, 400, 20);
        
        add(reset);
        add(endTurn);
        add(apply);
        
        EndTurnHandler turnEnd = new EndTurnHandler();
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


