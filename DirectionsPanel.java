import java.awt.*;
import javax.swing.*;

public class DirectionsPanel extends JPanel{
	
	Image image;
	int imageNum;
	String[] imageNames;
	
	//Constructer
	public DirectionsPanel() {
		imageNum = 0;
		imageNames = new String[] {"src/1-Navigation.png", "src/2-Controls.png", "src/3-Obstacles.png", "src/4-Elements.png"};
		ImageIcon tempIcon = new ImageIcon(imageNames[imageNum]);
		image = tempIcon.getImage();
	}
	
	//Paint Component
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;

		imageNum++;
		if (imageNum > 3){
			imageNum = 0;
		}
		
		ImageIcon tempIcon = new ImageIcon(imageNames[imageNum]);
		image = tempIcon.getImage();
		
		g2d.drawImage(image, 0, 0, null);
	}
}