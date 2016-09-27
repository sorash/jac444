package main;

public class Rectangle implements Shape
{
	private static double length, width;
	
	/**
	 * Returns the perimeter of the rectangle.
	 * 
	 * @return 2*length + 2*width to get the perimeter
	 */
	@Override
	public double getPerimeter()
	{
		// round to 2 decimal places
		return Math.round((2*length + 2*width) * 100.00) / 100.00;
	}
	
	/**
	 * Gets the length of a rectangle.
	 * 
	 * @return length of rectangle
	 */
	public double getLength()
	{
		return length;
	}
	
	/**
	 * Sets the length value of a rectangle.
	 * 
	 * @param length value to set for length of rectangle
	 */
	public void setLength(double length)
	{
		Rectangle.length = length;
	}
	
	/**
	 * Gets the width of a square.
	 * 
	 * @return width of rectangle
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * Sets the width value of a rectangle.
	 * 
	 * @param width value to set for width of rectangle
	 */
	public void setWidth(double width)
	{
		Rectangle.width = width;
	}
}
