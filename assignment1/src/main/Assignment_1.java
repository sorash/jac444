package main;

public class Assignment_1 
{
	// create the shapes
	private static Circle c;
	private static Square s;
	private static Rectangle r;

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
		
		System.out.println();
		
		// set a length for the rectangle and show it and the perimeter
		r = new Rectangle();
		r.setLength(40.74);
		r.setWidth(20.54);
		System.out.println("Rectangle's length and width: " + r.getLength() + ", " + r.getWidth());
		System.out.println("Rectangle's perimeter: " + r.getPerimeter());
	}
}
