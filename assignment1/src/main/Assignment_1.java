package main;

public class Assignment_1 
{
	// create the shapes
	private static Circle c, c2, c3;
	private static Square s, s2, s3;
	private static Rectangle r, r2, r3;
	private static Parallelogram p, p2, p3;
	private static Triangle t, t2, t3;

	public static void main(String[] args)
	{
		// set a radius for the circles and print them
		c = new Circle();
		c.setRadius(10.5);
		System.out.println(c.toString());
		c2 = new Circle();
		c2.setRadius(15.2);
		System.out.println(c2.toString());
		c3 = new Circle();
		c3.setRadius(10.5);
		System.out.println(c3.toString());
		System.out.println("c.equals(c2): " + c.equals(c2) + ", c.equals(c3): " + c.equals(c3));
		
		// set a radius for the squares and print them
		s = new Square();
		s.setLength(25.4);
		System.out.println(s.toString());
		s2 = new Square();
		s2.setLength(25.1);
		System.out.println(s2.toString());
		s3 = new Square();
		s3.setLength(25.4);
		System.out.println(s3.toString());
		System.out.println("s.equals(s2): " + s.equals(s2) + ", s.equals(s3): " + s.equals(s3));
		
		// set a radius for the rectangles and print them
		r = new Rectangle();
		r.setLength(40.74);
		r.setWidth(20.54);
		System.out.println(r.toString());
		r2 = new Rectangle();
		r2.setLength(45.74);
		r2.setWidth(20.51);
		System.out.println(r2.toString());
		r3 = new Rectangle();
		r3.setLength(40.74);
		r3.setWidth(20.54);
		System.out.println(r3.toString());
		System.out.println("r.equals(r2): " + r.equals(r2) + ", r.equals(r3): " + r.equals(r3));
		
		// set a radius for the parallelograms and print them
		p = new Parallelogram();
		p.setLength(64.35);
		p.setWidth(32.74);
		System.out.println(p.toString());
		p2 = new Parallelogram();
		p2.setLength(64.35);
		p2.setWidth(42.74);
		System.out.println(p2.toString());
		p3 = new Parallelogram();
		p3.setLength(64.35);
		p3.setWidth(32.74);
		System.out.println(p3.toString());
		System.out.println("p.equals(p2): " + p.equals(p2) + ", p.equals(p3): " + p.equals(p3));
		
		// set a radius for the triangles and print them
		t = new Triangle();
		t.setSide(0, 23.34);
		t.setSide(1, 64.53);
		t.setSide(2, 17.87);
		System.out.println(t.toString());
		t2 = new Triangle();
		t2.setSide(0, 21.34);
		t2.setSide(1, 64.53);
		t2.setSide(2, 14.87);
		System.out.println(t2.toString());
		t3 = new Triangle();
		t3.setSide(0, 23.34);
		t3.setSide(1, 64.53);
		t3.setSide(2, 17.87);
		System.out.println(t3.toString());
		System.out.println("t.equals(t2): " + t.equals(t2) + ", t.equals(t3): " + t.equals(t3));
		
		// compare some different shapes
		System.out.println("p.equals(r2): " + p.equals(r2));
		System.out.println("r.equals(t2): " + r.equals(t2));
		System.out.println("c.equals(s2): " + c.equals(s2));
	}
}
