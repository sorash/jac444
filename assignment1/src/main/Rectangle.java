package main;

public class Rectangle implements Shape
{
	private double length, width;
	
	/**
	 * Constructs a rectangle.
	 * 
	 * @param length length value of the rectangle
	 * @param width width value of the rectangle
	 */
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
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
		this.length = length;
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
		this.width = width;
	}
	
	/**
	 * Returns the rectangle's field members.
	 * 
	 * @return Rectangle's length, width, and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Rectangle-- Length: " + length + ", Wdith: " + width + ", Perimeter: " + getPerimeter() + ", HashCode: " + hashCode();
	}
	
	/**
	 * Compare the rectangle with another shape
	 * 
	 * @return false if the shape given is null
	 * @return false if the shape given is not a rectangle
	 * @return true if shapes have the same length and width
	 */
	@Override
	public boolean equals(Shape shape)
	{
		if(this == shape)
			return true;
		if(shape == null)
			return false;
		if(!(shape instanceof Rectangle))
			return false;
		return (length == ((Rectangle)shape).getLength() && width == ((Rectangle)shape).getWidth());
	}
	
	/**
	 * Generates a hashcode unique per rectangle based on it's member variables.
	 * 
	 * @return hashcode generated from length and width
	 */
	@Override
	public int hashCode()
	{
		long lLength = Double.doubleToLongBits(length);
		long lWidth = Double.doubleToLongBits(width);
		int result = (int)(lLength ^ (lLength >>> 32));
		result += (int)(lWidth ^ (lWidth >>> 32));
		result = (int) (37 * result + length + width);
		return result;
	}
}
