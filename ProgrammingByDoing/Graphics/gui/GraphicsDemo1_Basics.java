package gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDemo1_Basics extends Canvas {
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(50, 20, 100, 200); // draw a rectangle
		g.fillOval(200, 200, 200, 200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200, 400, 200, 20); // a filled-in rectangle
		g.drawOval(200, 430, 200, 100);

		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);

		g.setColor(Color.red);
		g.fillRect(600, 400, 100, 100);
	}

	public static void main(String[] args) {
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1_Basics canvas = new GraphicsDemo1_Basics();
		win.add(canvas);
		win.setVisible(true);
	}
}

/*
 * Assignments turned in without these things will receive half credit or less.
 * Answer any questions in comments at the top of GraphicsDemo1.java.
 * 
 * 1. How big is the window that appears? How many pixels wide? How many pixels
 * tall? 2. In the call to the function g.drawRect(), there are four numbers.
 * What do they mean? Try changing them to figure it out. 3. What about the call
 * to fillOval()? What do the four numbers mean here? 4. What are the two
 * numbers in the call to drawString()? 5. What happens when two objects
 * overlap? Which one is drawn on top? 6. Add a red, filled-in square somewhere
 * in the lower-right of the canvas.
 */