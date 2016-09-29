package main;

public interface Shape 
{
	/**
	 * Returns the perimeter of a given shape.
	 * 
	 * @return the calculated perimeter of the shape
	 */
	public double getPerimeter();
	
	/**
	 * Prints out the shape's values.
	 * 
	 * @return the fields in the shape
	 */
	@Override
	public String toString();
}
