package main;

public class Assignment_1 
{
	private static Circle c = new Circle();

	public static void main(String[] args)
	{
		// set a radius for the circle and show it and the perimeter
		c.setRadius(10.5);
		System.out.println("Circle's radius: " + c.getRadius());
		System.out.println("Circle's perimeter: " + c.getPerimeter());
	}
}
