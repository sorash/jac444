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
}
