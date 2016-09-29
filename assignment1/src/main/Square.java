package main;

public class Square implements Shape
{
	private static double length;
	
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
		Square.length = length;
	}

	/**
	 * Prints out the square's field members.
	 * 
	 * @return Square's side length and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Square-- Side length: " + length + ", Perimeter: " + getPerimeter(); 
	}
}
