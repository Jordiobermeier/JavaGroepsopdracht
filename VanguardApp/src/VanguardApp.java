import javax.swing.*;
import javax.swing.JPanel;

public class VanguardApp extends JFrame {
	  public static void main( String args[] ) {
		    JFrame frame = new VanguardApp();
		    frame.setSize( 400, 200 );
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.setTitle( "VanguardApp" );
<<<<<<< HEAD
		    Circle Circle = new Circle();
		    frame.setContentPane( Circle );
=======
		    JPanel controller = new Controller();
		    frame.setContentPane( controller );
>>>>>>> e8712b54c97b177aa14da5088a9ed06cd0b9080e
		    frame.setVisible( true );
		  }
}