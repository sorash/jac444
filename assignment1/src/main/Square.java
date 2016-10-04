package main;

/**
 * Square shape
 * 
 * @author Ashrafi 030
 */
public class Square implements Shape
{
	private double length;
	
	/**
	 * Constructs a square.
	 * 
	 * @param length side length value of the square
	 */
	public Square(double length)
	{
		this.length = length;
	}
	
	/**
	 * Returns the perimeter of the square.
	 * 
	 * @return 4*length to get the perimeter
	 */
	@Override
	public double getPerimeter()
	{
		return 4*length;
	}

	/**
	 * Gets the length of sides of a square.
	 * 
	 * @return length of sides
	 */
	public double getLength() 
	{
		return length;
	}

	/**
	 * Sets the side length value of a square.
	 * 
	 * @param length value to set for side lengths
	 */
	public void setLength(double length) 
	{
		this.length = length;
	}

	/**
	 * Returns the square's field members.
	 * 
	 * @return Square's side length and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Square-- Side length: " + length + ", Perimeter: " + getPerimeter() + ", HashCode: " + hashCode(); 
	}
	
	/**
	 * Compare the square with another shape
	 * 
	 * @return false if the shape given is null
	 * @return false if the shape given is not a square
	 * @return true if shapes have the same side length
	 */
	@Override
	public boolean equals(Shape shape)
	{
		if(this == shape)
			return true;
		if(shape == null)
			return false;
		if(!(shape instanceof Square))
			return false;
		return length == ((Square)shape).getLength();
	}
	
	/**
	 * Generates a hashcode unique per square based on it's member variables.
	 * 
	 * @return hashcode generated from side length
	 */
	@Override
	public int hashCode()
	{
		int result = 1;
		long lLength = Double.doubleToLongBits(length);
		result = 37 * result + (int)(lLength ^ (lLength >>> 32));
		return result;
	}
}
