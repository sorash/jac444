package main;

/**
 * Parallelogram shape
 * 
 * @author Ashrafi 030
 */
public class Parallelogram implements Shape
{
	private double length, width;
	
	/**
	 * Constructs a parallelogram.
	 * 
	 * @param length length value of the parallelogram
	 * @param width width value of the parallelogram
	 */
	public Parallelogram(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Returns the perimeter of the parallelogram.
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
	 * Gets the length of a parallelogram.
	 * 
	 * @return length of parallelogram
	 */
	public double getLength()
	{
		return length;
	}
	
	/**
	 * Sets the length value of a parallelogram.
	 * 
	 * @param length value to set for length of parallelogram
	 */
	public void setLength(double length)
	{
		this.length = length;
	}
	
	/**
	 * Gets the width of a square.
	 * 
	 * @return width of parallelogram
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * Sets the width value of a parallelogram.
	 * 
	 * @param width value to set for width of parallelogram
	 */
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	/**
	 * Returns the parallelogram's field members.
	 * 
	 * @return Parallelogram's length, width, and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Parallelogram-- Length: " + length + ", Wdith: " + width + ", Perimeter: " + getPerimeter() + ", HashCode: " + hashCode(); 
	}
	
	/**
	 * Compare the parallelogram with another shape
	 * 
	 * @return false if the shape given is null
	 * @return false if the shape given is not a parallelogram
	 * @return true if shapes have the same length and width
	 */
	@Override
	public boolean equals(Shape shape)
	{
		if(this == shape)
			return true;
		if(shape == null)
			return false;
		if(!(shape instanceof Parallelogram))
			return false;
		return length == ((Parallelogram)shape).getLength() && width == ((Parallelogram)shape).getWidth();
	}
	
	/**
	 * Generates a hashcode unique per parallelogram based on it's member variables.
	 * 
	 * @return hashcode generated from length and width
	 */
	@Override
	public int hashCode()
	{
		int result = 1;
		long lLength = Double.doubleToLongBits(length);
		long lWidth = Double.doubleToLongBits(width);
		result = 37 * result + (int)(lLength ^ (lLength >>> 32));
		result = 37 * result + (int)(lWidth ^ (lWidth >>> 32));
		return result;
	}
}
