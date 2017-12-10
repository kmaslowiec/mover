

package mover;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Design extends JPanel {
	
	public void paintComponent(Graphics g){
		
		
		
		Image img = new ImageIcon("res/Pics/brandMiniMover.png").getImage();
		
		int x = (this.getWidth() - img.getWidth(null)) / 2; // thid mskr pic appear in the middle
	    int y = (this.getHeight() - img.getHeight(null)) / 2;
		g.drawImage(img, x, y, this);
		
		
	}

}

