package gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDemo3_FontsAndLines extends Canvas {
	public void paint(Graphics g) {
		// lines
		g.setColor(Color.green);
		g.drawLine(10, 100, 400, 100);
		// x1(10) locatia de unde incepe linia
		// y1(100) inclinatia spre stanga
		// x2(400) dimensiunea , de la x1 location la x2
		// y2(100) inclinatia spre dreapta

		// Exercise2
		g.setColor(Color.red);
		g.drawLine(52, 150, 52, 20);
		// end of Exercise3

		g.setColor(Color.blue);
		g.drawLine(50, 150, 100, 180);

		// Exercise3
		g.setColor(Color.red);
		g.drawLine(110, 350, 310, 230);
		// end of Exercise3

		g.setColor(Color.magenta);
		g.drawLine(100, 350, 300, 230);

		g.setColor(Color.black);

		// fonts
		g.drawString("Graphics are pretty neat.", 500, 100);

		g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
		g.drawString("Yes, they are.", 400, 200);

		g.setColor(Color.white);
		g.setFont(new Font("Calibri", Font.BOLD + Font.ITALIC, 60)); // 60-pt
																// italic
																// bold
		g.drawString("Leander Lions", 300, 350);

		g.setColor(Color.blue);
		g.setFont(Font.decode("Calibri-BOLDITALIC-60")); // a different way to
															// specify the same
															// font
		g.drawString("Leander Lions", 290, 360);

		g.setColor(Color.black);
		g.setFont(new Font(null)); // restore default font

		int x = 400, y = 490;
		g.drawRect(x, y, 150, 20);
		g.drawString("Where is the starting point?", x, y);
		g.setColor(Color.red);
		g.drawLine(x, y, x, y); // drawing a line from a point to itself makes a
								// 1px-by-1px dot

	}

	public static void main(String[] args) {
		JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3_FontsAndLines canvas = new GraphicsDemo3_FontsAndLines();
		win.add(canvas);
		win.setVisible(true);
	}
}
