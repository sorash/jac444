package main;

public class Circle implements Shape
{
	private static double radius;
	
	/**
	 * Returns the perimeter of the circle.
	 * 
	 * @return 2PI*r to get the perimiter
	 */
	@Override
	public double getPerimeter() 
	{
		return 2 * Math.PI * radius;
	}

	/**
	 * Gets the radius value of a circle.
	 * 
	 * @return radius of circle
	 */
	public double getRadius() 
	{
		return radius;
	}

	/**
	 * Sets the radius value of a circle.
	 * 
	 * @param radius value to be assigned for radius of circle
	 */
	public void setRadius(double radius) 
	{
		Circle.radius = radius;
	}
}
