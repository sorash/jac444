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
	
	/**
	 * Compares two shapes.
	 * 
	 * @return true if shapes have the same attributes
	 */
	public boolean equals(Shape shape);
	
	/**
	 * Generates a hashcode unique per shape based on it's member variables.
	 * 
	 * @return hashcode generated from member fields
	 */
	@Override
	public int hashCode();
}
