import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JPanel;
import background.MyPanel;

public class VanguardApp extends JFrame {
	  public static void main( String args[] ) {
		    JFrame frame = new VanguardApp();
		    frame.setBounds(8, 40, 1900, 1000);
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.setTitle( "VanguardApp" );
		    
		    frame.setContentPane( new MyPanel() );
		    
//		    JPanel Button = new Button();
//		    frame.setContentPane( Button );

		    frame.setVisible( true );
		  }
}