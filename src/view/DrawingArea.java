package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingArea extends Component {
	private BufferedImage img;
	private BufferedImage ballSprite;
	
	public DrawingArea() {
		/* Create something to draw on */
		img = new BufferedImage(640, 480, BufferedImage.TYPE_BYTE_INDEXED);
		
		/* Load ball image */
		try {
			ballSprite = ImageIO.read(new File("ball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Graphics2D g = (Graphics2D)img.getGraphics();
		g.setColor(Color.BLUE);
		g.drawLine(10, 10, 20, 20);*/
		
		this.setVisible(true);
	}
	
	public void drawBall(int x, int y) {
		Graphics2D g = (Graphics2D)img.getGraphics();
		g.drawImage(ballSprite, x, y, null);
		// do the repainting stuff
		repaint();
	}

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
}
