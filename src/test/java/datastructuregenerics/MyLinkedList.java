package datastructuregenerics;

public class MyLinkedList 
{
	public INode head;
	public INode tail;
	
	public MyLinkedList() 
	{
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) 
	{
		if(head == null)
		{
			head = newNode;
		}
		
		if(tail == null)
		{
			tail = newNode;
		}
		else 
		{
			INode myNode = head;
			head = newNode;
			head.setNext(myNode);
		}
	}
	
	public void append(INode myNode)
	{
		if(head == null)
		{
			head = myNode;
		}
		
		if(tail == null)
		{
			tail =myNode;
		}
		else 
		{
			tail.setNext(myNode);
			tail = myNode;
		}
		
	}

	public void insert(INode myNode, INode newNode) 
	{
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() 
	{
		INode tempNode = head;
		head = head.getNext();
		return tempNode;
	}

	public INode popLast() 
	{
		INode tempNode = head;
		
		while(!tempNode.getNext().equals(tail))
		{
			tempNode = tempNode.getNext();
		}
		
		tail = tempNode;
		return tempNode.getNext();
	}

	public boolean search(INode myNode) 
	{
		INode tempNode = head;
		boolean  result = true;
		
		while(!tempNode.equals(tail))
		{
			if(tempNode.getKey().equals(myNode.getKey()))
			{
				return true;
			}
			else 
			{
				tempNode = tempNode.getNext();
			}
		}
		
		return false;
	}
}
