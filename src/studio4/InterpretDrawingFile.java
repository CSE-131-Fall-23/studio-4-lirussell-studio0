package studio4;
import java.awt.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;



/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

	
		
		
		Color colors = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(colors);
		
		if(shapeType.equals("triangle"))
		{
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] arrayX = {x1, x2, x3};
			double[] arrayY = {y1, y2, y3};
			if(isFilled == true)
			{
				StdDraw.filledPolygon(arrayX, arrayY);
			}
			else
			{
				StdDraw.polygon(arrayX, arrayY);
			}
		}
		else if(shapeType.equals("rectangle"))
		{
			if(isFilled == true)
			{
				StdDraw.filledRectangle(x1, y1, x2, y2);
			}
			else
			{
				StdDraw.rectangle(x1, y1, x2, y2);
			}
		}
		else if(shapeType.equals("ellipse"))
			{
			if(isFilled == true)
			{
				StdDraw.filledEllipse(x1, y1, x2, y2);
			}
			else
			{
				StdDraw.ellipse(x1, y1, x2, y2);
			}
			}
		
	


	}
}
