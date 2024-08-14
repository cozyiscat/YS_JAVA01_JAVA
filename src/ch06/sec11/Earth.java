package ch06.sec11;

public class Earth {
	final static double Earth_Radious = 6400;
	final static double Earth_Surface_Area;
	
	static {
		Earth_Surface_Area =4*Math.PI *Earth_Radious;
	}
}
