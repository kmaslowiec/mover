package mover; 

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Mover1_2 extends JFrame {

	
	
	private JFrame frame = new JFrame("Mover");
	
	//private JButton button = new JButton("Pause");
	private static Mover1_2 app = new Mover1_2();
	
	
	public static void main(String[] args) {
		
	
				app.window();
	
		
		
		app.robotWork();

	}
	
	public void window(){
		// create a window


		setSize(150,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Image img = new ImageIcon("res/Pics/jupiteIcon.png").getImage();
		setIconImage(img);
		Design panel = new Design();
		
		getContentPane().add(BorderLayout.CENTER  ,  panel);
		
		setVisible(true);
		
		
		
		
	}
	
	public void robotWork(){ // creating a loop to execute robot's work
		while(true){
			app.robotAct();
			
		}
	}
	
	public void robotAct(){
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		
		try {
			Robot robot = new Robot();
			robot.mouseMove(x, y+1);
			Thread.sleep(59000);
		} catch (Exception e) {
			
			
		}
		
		
		
		
	}

}
