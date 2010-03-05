package main;

import view.DrawingArea;
import view.MainGUI;

public class PaintingThread extends Thread {
	private GameInformation gameInformation;
	private MainGUI gui;
	
	public PaintingThread(GameInformation gameInformation, MainGUI gui) {
		this.gameInformation = gameInformation;
		this.gui = gui;
		
	}
	
	public void run() {
		int ballX;
		int ballY;
		DrawingArea drawingArea = gui.getDrawingArea();
		
		
		
		while (true) {
			ballX = gameInformation.getBallX();
			ballY = gameInformation.getBallY();
			System.out.println("BallX: "+ballX);
			System.out.println("BallY: "+ballY);
			
			drawingArea.drawBall(ballX, ballY);
			
			ballX += 10;
			ballY += 10;
			
			gameInformation.setBallX(ballX);
			gameInformation.setBallY(ballY);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
