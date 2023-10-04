package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledCircle(0.5, 0.5, 0.075);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledEllipse(0.5, 0.5, 0.1, 0.01);
	}
}