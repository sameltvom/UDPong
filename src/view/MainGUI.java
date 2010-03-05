package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainGUI extends JFrame {
	private DrawingArea drawingArea;
	
	public MainGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(100, 100);
		drawingArea = new DrawingArea();
		this.add(drawingArea);
		this.pack();
		this.setVisible(true);
		
		drawingArea.drawBall(10, 10);
	}
	
	public DrawingArea getDrawingArea() {
		return drawingArea;
	}
	
	
}
