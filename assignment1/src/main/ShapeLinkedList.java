package main;

/**
 * Link list containing geometrical Shapes
 */
public class ShapeLinkedList 
{
	public Node head; // Head is first node in linked list
	public int length;

	/**
	 * Constructs an empty linked list.
	 */
	public ShapeLinkedList() 
	{ 
		head = new Node(null, null);
		length = 0;
	}

	/**
	 * Constructs a linked list with the given head node.
	 * 
	 * @param head head node to be used for the list
	 */
	public ShapeLinkedList(Node head) 
	{
		this.head = head;
		length = 1;
	}

	/**
	 * Checks if the list is empty.
	 * 
	 * @return true if the length of the list is 0
	 */
	public boolean isEmpty() 
	{
		return length() == 0;
	}

	/**
	 * Inserts a node at the end of the list.
	 * 
	 * @param data data to insert in the node
	 */
	public void insertAtEnd(Shape data) 
	{
		Node newNode = new Node(data, null);
		Node currentNode = head;

		if(currentNode != null)
		{
			for(int i = 1; i < length; i++)
				currentNode = currentNode.getNext();
		
			currentNode.setNext(newNode);
			length++;
		}
		else
			head = newNode;
	}

	/**
	 * Inserts a node at the beginning of the list.
	 * 
	 * @param data data to insert in the node
	 */
	public void insertAtBeginning(Shape data) 
	{
		Node newNode = new Node(data, null);
		Node currentNode = head;

		if(currentNode != null)
		{
			newNode.setNext(currentNode);
			head = newNode;
			length++;
		}
		else
			head = newNode;
	}

	/**
	 * Returns the last node in the list.
	 * 
	 * @return last node in the list
	 */
	public Node tail() 
	{
		Node currentNode = head;

		while(currentNode.getNext() != null)
			currentNode = currentNode.getNext();

		return currentNode;
	}

	/**
	 * Returns the length of the list.
	 * 
	 * @return number of elements in the list
	 */
	public int length() 
	{
		return length;
	}

	/**
	 * Inserts a node at a given index in the list.
	 * 
	 * @param index index of list to insert the node at
	 * @param data data to be inserted into the list
	 */
	void insertAtIndex(int index, Shape data) 
	{
		Node newNode = new Node(data, null);
		Node currentNode = head;

		// find the index
		for(int i = 1; i < index && currentNode.getNext() != null; i++)
			currentNode = currentNode.getNext();
		
		// insert the new node in between the current and it's next node
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		length++;
	}

	/**
	 * Finds a node at a given index.
	 * 
	 * @param index index in the list to find the node
	 * @return the node at the given index
	 */
	Node findAtIndex(int index) 
	{
		// check if index is too big or too small
		if(index <= length && index > 0)
		{
			Node node = head;
			
			for(int i = 1; i < index; i++)
				node = node.getNext();
			
			return node;
		}
		else
			return null;
	}

	/**
	 * Deletes a node at a given index.
	 * 
	 * @param index index in the list to delete the node from
	 */
	void deleteAtIndex(int index) 
	{
		// check if index is too big or too small
		if(index <= length || index > 0)
		{
			Node node = head;

			for(int i = 1; i < index && node.getNext() != null; i++)
				node = node.getNext();
			
			node.setNext(node.getNext().getNext());
			
			// decrement the length
			length--;
		}
	}

	/**
	 * Returns the members inside the linked list.
	 * 
	 * @return the nodes stored inside the list
	 */
	@Override
	public String toString() 
	{
		Node currentNode = head;
		String ret = "Shape Linked List:\n";
		
		while(currentNode != null)
		{
			ret += currentNode.toString() + '\n';
			currentNode = currentNode.getNext();
		}
		
		return ret;
	}

	
	void deleteData(Shape s) 
	{
		// TODO to be implemented
	}

	@Override
	public int hashCode() 
	{
		return 0;
	}

	@Override
	public boolean equals(Object obj) 
	{
		return false;
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
			return "Node data: " + (data == null ? "null" : data.toString()) + ", Next Node: " + (next == null ? "null" : (next.data == null ? "null" : next.data.toString()));
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