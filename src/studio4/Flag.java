package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	int redComponent = 255;
	int greenComponent = 0;
	int blueComponent = 0;
	
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		
		StdDraw.filledRectangle(.5,.95,0.5,0.05);
		StdDraw.show();
		
		StdDraw.setPenColor(254,135,0);
		StdDraw.filledRectangle(.5,.85,0.5,0.05);
		StdDraw.show();
		StdDraw.setPenColor(255,255,96);
		StdDraw.filledRectangle(.5,.75,0.5,0.05);
		StdDraw.show();
		StdDraw.setPenColor(0,196,0);
		StdDraw.filledRectangle(.5,.65,0.5,0.05);
		StdDraw.show();
		StdDraw.setPenColor(0,0,187);
		StdDraw.filledRectangle(0.5, 0.55, 0.5, 0.05);
		StdDraw.show();
		StdDraw.setPenColor(145,0,187);
		StdDraw.filledRectangle(0.5, 0.45, 0.5, 0.05);
		StdDraw.show();
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledEllipse(.5,.7,.2,.1);
		StdDraw.filledEllipse(0.35, 0.8, .1, .05);
		StdDraw.filledEllipse(0.65, 0.8, .1, .05);
		StdDraw.show();
	}
}