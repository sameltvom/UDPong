package main;

import view.MainGUI;

public class UDPongMain {
	public static void main(String []args) {
		GameInformation gameInformation = new GameInformation();
		MainGUI gui = new MainGUI();
		
		gui.getDrawingArea().drawBall(20, 20);
		
		PaintingThread paintingThread = new PaintingThread(gameInformation, gui);
		paintingThread.start();
		
		
	}
}
