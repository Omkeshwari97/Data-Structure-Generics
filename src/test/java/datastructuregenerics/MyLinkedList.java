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

	public void insertAfter(INode myNode, INode myNewNode) 
	{
		INode tempNode1 = head;
		INode tempNode2 = head.getNext();
		
		while(!tempNode1.getKey().equals(myNode.getKey()) && !tempNode2.equals(tail))
		{
			tempNode1 = tempNode1.getNext();
			tempNode2 = tempNode2.getNext();
		}
		
		tempNode1.setNext(myNewNode);
		myNewNode.setNext(tempNode2);		
	}

	public INode popSpecific(INode myNode) 
	{
		INode tempNode1 = head;
		INode tempNode2 = head;
		
		while(!tempNode1.getKey().equals(myNode.getKey()) && !tempNode2.equals(tail))
		{
			tempNode2 = tempNode1;
			tempNode1 = tempNode1.getNext();
		}
		
		tempNode2.setNext(tempNode1.getNext());
		
		return head;
	}

	public int size() 
	{
		INode tempNode = head;
		int count = 0;
		
		while(!tempNode.equals(tail))
		{
			count++;
			tempNode = tempNode.getNext();
		}
		
		return count+1;
	}
}
