package main;

/**
 * Circle shape
 * 
 * @author Ashrafi 030
 */
public class Circle implements Shape
{
	private double radius;
	
	/**
	 * Constructs a circle.
	 * 
	 * @param radius radius value of the circle
	 */
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	/**
	 * Returns the perimeter of the circle.
	 * 
	 * @return 2PI*r to get the perimeter
	 */
	@Override
	public double getPerimeter() 
	{
		// round to 2 decimal places
		return Math.round((2 * Math.PI * radius) * 100.00) / 100.00;
	}

	/**
	 * Gets the radius value of a circle.
	 * 
	 * @return radius of circle
	 */
	public double getRadius() 
	{
		return radius;
	}

	/**
	 * Sets the radius value of a circle.
	 * 
	 * @param radius value to be assigned for radius of circle
	 */
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	/**
	 * Returns the circle's field members.
	 * 
	 * @return Circle's radius and perimeter.
	 */
	@Override
	public String toString()
	{
		return "Circle-- Radius: " + radius + ", Perimeter: " + getPerimeter() + ", HashCode: " + hashCode();
	}
	
	/**
	 * Compare the circle with another shape
	 * 
	 * @return false if the shape given is null
	 * @return false if the shape given is not a circle
	 * @return true if shapes have the same radius
	 */
	@Override
	public boolean equals(Shape shape)
	{
		if(this == shape)
			return true;
		if(shape == null)
			return false;
		if(!(shape instanceof Circle))
			return false;
		return radius == ((Circle)shape).getRadius();
	}
	
	/**
	 * Generates a hashcode unique per circle based on it's member variables.
	 * 
	 * @return hashcode generated from radius
	 */
	@Override
	public int hashCode()
	{
		int result = 1;
		long lRadius = Double.doubleToLongBits(radius);
		result = 37 * result + (int)(lRadius ^ (lRadius >>> 32));
		return result;
	}
}