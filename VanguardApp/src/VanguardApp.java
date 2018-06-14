import javax.swing.JFrame;


public class VanguardApp extends JFrame {
	  public static void main( String args[] ) {
		    JFrame frame = new VanguardApp();
		    frame.setBounds(8, 40, 1900, 1000);
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.setTitle( "VanguardApp" );
<<<<<<< HEAD
		    
		    frame.setContentPane( new Button() );
		    
=======
		    frame.setContentPane( new MyPanel() );
		    frame.add(new Button());
		    


>>>>>>> a5cbf819234247977d43ae49f3e0c9b728143fdd
		    frame.setVisible( true );
		  }
}