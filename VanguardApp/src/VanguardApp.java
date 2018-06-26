import javax.swing.JFrame;


public class VanguardApp extends JFrame {
	  public static void main( String args[] ) {
		    JFrame frame = new VanguardApp();
		    frame.setBounds(8, 40, 1900, 1000);
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.setTitle( "VanguardApp" );

		    frame.setContentPane( new Controller() );

		    frame.setVisible( true );
		  }
}