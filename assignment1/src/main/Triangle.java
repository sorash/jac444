package main;

public class Triangle implements Shape
{
	private double[] sides = new double[3];
	
	/**
	 * Returns the perimeter of the triangle.
	 * 
	 * @return sum of all sides to get the perimeter
	 */
	@Override
	public double getPerimeter()
	{
		// round to 2 decimal places
		return Math.round((sides[0] + sides[1] + sides[2]) * 100.00) / 100.00;
	}
	
	/**
	 * Gets the value of a side of the triangle.
	 * 
	 * @param side side to be modified
	 * @return the value of the side given
	 */
	public double getSide(int side)
	{
		return sides[side];
	}
	
	/**
	 * Sets values for a side of the triangle.
	 * 
	 * @param side side to be modified
	 * @param value value of side to modify
	 */
	public void setSide(int side, double value)
	{
		sides[side] = value;
	}
	
	/**
	 * Prints out the triangle's field members.
	 * 
	 * @return triangle's sides and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Rectangle-- Sides: " + sides[0] + ", " + sides[1] + ", " + sides[2] + ", Perimeter: " + getPerimeter(); 
	}
	
	/**
	 * Compare the triangle with another shape
	 * 
	 * @return false if the shape given is null
	 * @return false if the shape given is not a triangle
	 * @return true if shapes have the same side lengths
	 */
	@Override
	public boolean equals(Shape shape)
	{
		if(this == shape)
			return true;
		if(shape == null)
			return false;
		if(!(shape instanceof Triangle))
			return false;
		return sides[0] == ((Triangle)shape).getSide(0) 
				&& sides[1] == ((Triangle)shape).getSide(1)
				&& sides[2] == ((Triangle)shape).getSide(2);
	}
}
