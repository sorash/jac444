package main;

/**
 * Triangle shape
 * 
 * @author Ashrafi 030
 */
public class Triangle implements Shape
{
	private double[] sides = new double[3];
	
	/**
	 * Constructs a triangle.
	 * 
	 * @param side1 value to be used for side 1 of triangle
	 * @param side2 value to be used for side 2 of triangle
	 * @param side3 value to be used for side 3 of triangle
	 */
	public Triangle(double side1, double side2, double side3)
	{
		this.sides[0] = side1;
		this.sides[1] = side2;
		this.sides[2] = side3;
	}
	
	/**
	 * Constructs a triangle.
	 * 
	 * @param sides array of side values to be used for triangle
	 */
	public Triangle(double sides[])
	{
		this.sides[0] = sides[0];
		this.sides[1] = sides[1];
		this.sides[2] = sides[2];
	}
	
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
	 * Returns the triangle's field members.
	 * 
	 * @return triangle's sides and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Triangle-- Sides: " + sides[0] + ", " + sides[1] + ", " + sides[2] + ", Perimeter: " + getPerimeter() + ", HashCode: " + hashCode(); 
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
	
	/**
	 * Generates a hashcode unique per triangle based on it's member variables.
	 * 
	 * @return hashcode generated from side lengths
	 */
	@Override
	public int hashCode()
	{
		int result = 1;
		long lSide0 = Double.doubleToLongBits(sides[0]);
		long lSide1 = Double.doubleToLongBits(sides[1]);
		long lSide2 = Double.doubleToLongBits(sides[2]);
		result = 37 * result + (int)(lSide0 ^ (lSide0 >>> 32));
		result = 37 * result + (int)(lSide1 ^ (lSide1 >>> 32));
		result = 37 * result + (int)(lSide2 ^ (lSide2 >>> 32));
		return result;
	}
}
