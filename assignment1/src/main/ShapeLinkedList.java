package main;

/**
 * Link list containing geometrical Shapes
 */
public class ShapeLinkedList 
{
	public Node head; // Head is first node in linked list
	
	public ShapeLinkedList() 
	{ 
		
	}
	
	public ShapeLinkedList(Node head) 
	{
		
	}
	
	public boolean isEmpty() 
	{
		return length() == 0;
	}
	
	public void insertAtEnd(Shape data) 
	{
		// TODO to be implemented
	}
	
	public void insertAtBeginning(Shape data) 
	{
		// TODO to be implemented
	}
	
	public Node tail() 
	{
		// TODO to be implemented
		// returns the last node
	}
	
	public int length() 
	{
		// TODO to be implemented
	}
	
	void insertAtIndex(int idx, Shape data) 
	{
		// TODO to be implemented
	}
	
	Node findAtIndex(int idx) 
	{
		// TODO to be implemented
	}
	
	void deleteAtIndex(int idx) 
	{
		// TODO to be implemented
	}
	
	@Override
	public String toString() 
	{
		
	}
	
	void deleteData(Shape s) 
	{
		// TODO to be implemented
	}
	
	@Override
	public int hashCode() 
	{
		// TODO to be implemented
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		// TODO to be implemented
	}
	
	// Node is nested class because it only exists along with linked list
	public static class Node 
	{
		private Shape data;
		private Node next;
		
		/**
		 * Constructs a node.
		 * 
		 * @param data data to be saved in the node
		 * @param next next node in the list
		 */
		public Node(Shape data, Node next)
		{
			this.data = data;
			this.next = next;
		}
		
		/**
		 * Gets the data in the node.
		 * 
		 * @return shape data inside node
		 */
		public Shape getData()
		{
			return data;
		}
		
		/**
		 * Sets the data in the node.
		 * 
		 * @param shape shape to store as data in the node
		 */
		public void setData(Shape shape)
		{
			this.data = shape;
		}
		
		/**
		 * Gets the next node in the list.
		 * 
		 * @return next node in the list
		 */
		public Node getNext()
		{
			return next;
		}
		
		/**
		 * Sets the next node in the list.
		 * 
		 * @param next next node in the list
		 */
		public void setNext(Node next)
		{
			this.next = next;
		}
		
		/**
		 * Returns the node's member variables.
		 * 
		 * @return node's data and next node
		 */
		@Override
		public String toString()
		{
			return "Node data: " + data.toString() + ", Next Node: " + next.toString();
		}
		
		/**
		 * Compares two nodes.
		 * 
		 * @return false if node given is null
		 * @return true if the nodes have the same member fields
		 */
		public boolean equals(Node other)
		{
			if(this == other)
				return true;
			if(other == null)
				return false;
			return data == other.getData() && next == other.getNext();
		}
		
		/**
		 * Generates a unique hashcode for a node.
		 * 
		 * @return hashcode generated from data and next node
		 */
		@Override
		public int hashCode()
		{
			int result = (data == null ? 0 : data.hashCode());
			result += next.hashCode();
			return result;
		}
	}
}