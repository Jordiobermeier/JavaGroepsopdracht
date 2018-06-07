import javax.swing.*;
import javax.swing.JPanel;

public class VanguardApp extends JFrame {
	  public static void main( String args[] ) {
		    JFrame frame = new VanguardApp();
		    frame.setSize( 400, 200 );
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.setTitle( "VanguardApp" );

		    JPanel controller = new Controller();
		    frame.setContentPane( controller );

		    frame.setVisible( true );
		  }
}