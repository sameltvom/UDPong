package view;

import javax.swing.JFrame;

public class MainGUI extends JFrame {
	public MainGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(100, 100);
		this.add(new DrawingArea());
		this.pack();
		this.setVisible(true);
	}
}
