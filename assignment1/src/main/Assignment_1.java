package main;

public class Assignment_1 
{
	// create the shapes
	private static Circle c;
	private static Square s;
	private static Rectangle r;
	private static Parallelogram p;
	private static Triangle t;

	public static void main(String[] args)
	{
		// set a radius for the circle and show it and the perimeter
		c = new Circle();
		c.setRadius(10.5);
		System.out.println(c.toString());
		
		// set a length for the square and show it and the perimeter
		s = new Square();
		s.setLength(25.4);
		System.out.println(s.toString());
		
		// set a length for the rectangle and show it and the perimeter
		r = new Rectangle();
		r.setLength(40.74);
		r.setWidth(20.54);
		System.out.println(r.toString());
		
		// set a length for the parallelogram and show it and the perimeter
		p = new Parallelogram();
		p.setLength(64.35);
		p.setWidth(32.74);
		System.out.println(p.toString());
		
		// set a length for the triangle and show it and the perimeter
		t = new Triangle();
		t.setSide(0, 23.34);
		t.setSide(1, 64.53);
		t.setSide(2, 17.87);
		System.out.println(t.toString());
	}
}
