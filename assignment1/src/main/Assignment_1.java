package main;

/**
 * Main class of assignmet 1
 * 
 * @author Ashrafi 030
 */
public class Assignment_1 
{
	public static void main(String[] args)
	{
		int[] values = {2,1,3,5,1,4,5,3,5,7,1,2,8,9};
		
		// initialize a list and shapes to add to it
		ShapeLinkedList sll = new ShapeLinkedList();
		Circle c1 = new Circle(values[0]);
		Circle c2 = new Circle(values[1]);
		Square sq1 = new Square(values[2]);
		Square sq2 = new Square(values[3]);
		Triangle t1 = new Triangle(values[4],values[5],values[6]);
		Triangle t2 = new Triangle(values[7],values[8],values[9]);
		Rectangle r1 = new Rectangle(values[10],values[11]);
		Rectangle r2 = new Rectangle(values[12],values[13]);
		
		// insert shapes into list
		sll.insertAtBeginning(r1);
		sll.insertAtBeginning(r2);
		sll.insertAtBeginning(c1);
		sll.insertAtBeginning(c2);
		sll.insertAtEnd(sq1);
		sll.insertAtEnd(sq2);
		sll.insertAtEnd(t1);
		sll.insertAtEnd(t2);
		
		// print list
		System.out.println(sll.toString());
		
		// task 2
		System.out.println("Deleting last element of list...");
		sll.deleteAtIndex(sll.length);
		
		// task 3
		System.out.println("Deleting sq2...");
		sll.deleteAtIndex(5);
		
		System.out.println();
		
		// print list again
		System.out.println(sll.toString());
	}
}
