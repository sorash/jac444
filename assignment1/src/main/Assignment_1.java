package main;

public class Assignment_1 
{
	// create the shapes
	private static Circle c;
	private static Square s;

	public static void main(String[] args)
	{
		// set a radius for the circle and show it and the perimeter
		c = new Circle();
		c.setRadius(10.5);
		System.out.println("Circle's radius: " + c.getRadius());
		System.out.println("Circle's perimeter: " + c.getPerimeter());
		
		System.out.println();
		
		// set a length for the square and show it and the perimeter
		s = new Square();
		s.setLength(25.4);
		System.out.println("Square's side length: " + s.getLength());
		System.out.println("Square's perimeter: " + s.getPerimeter());
	}
}
