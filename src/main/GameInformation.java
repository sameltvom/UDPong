package main;

public class GameInformation {
	private int ballX;
	private int ballY;
	
	public GameInformation() {
		ballX = 10;
		ballY = 10;
	}
	
	public synchronized int getBallX() {
		return ballX;
	}

	public synchronized void setBallX(int ballX) {
		this.ballX = ballX;
	}

	public synchronized int getBallY() {
		return ballY;
	}

	public synchronized void setBallY(int ballY) {
		this.ballY = ballY;
	}


	
	
	
	
	
}
