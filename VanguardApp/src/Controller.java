import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*; 

public class Controller extends JPanel {

	Image background;
	static Circle circle = new Circle();
	static Button button = new Button();
	
	public Controller() {
		
		add(button);
	    add(circle);
 
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
 
}
