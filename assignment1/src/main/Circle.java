package main;

public class Circle implements Shape
{
	private static double radius;
	
	/**
	 * Returns the perimeter of the circle.
	 * 
	 * @return 2PI*r to get the perimeter
	 */
	@Override
	public double getPerimeter() 
	{
		// round to 2 decimal places
		return Math.round((2 * Math.PI * radius) * 100.00) / 100.00;
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
