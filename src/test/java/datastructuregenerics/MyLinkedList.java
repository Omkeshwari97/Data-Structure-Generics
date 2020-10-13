package datastructuregenerics;

public class MyLinkedList 
{
	public INode head;
	public INode tail;
	public Integer max = 0;
	
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
		return tempNode;
	}

	public boolean search(INode myNode) 
	{
		INode tempNode = head;
		boolean  result = true;
		int index = 1;
		
		while(!tempNode.equals(tail))
		{
			if(tempNode.getKey().equals(myNode.getKey()))
			{
				System.out.println(myNode.getKey() + " is present at " + index + " position");
				return true;
			}
			else 
			{
				tempNode = tempNode.getNext();
			}
			index++;
		}
		
		System.out.println(myNode.getKey() + " is not present in list");
		return false;
	}

	public void insertAfter(INode myNode, INode myNewNode) 
	{
		INode tempNode1 = head;
		
		if(head == tail)
		{
			append(myNewNode);
		}
		else
		{
			INode tempNode2 = head.getNext();
			
			while(!tempNode1.getKey().equals(myNode.getKey()) && !tempNode2.equals(tail))
			{
				tempNode1 = tempNode1.getNext();
				tempNode2 = tempNode2.getNext();
			}
			
			tempNode1.setNext(myNewNode);
			myNewNode.setNext(tempNode2);		
		}
	}

	public INode popSpecific(INode myNode) 
	{
		INode tempNode1 = head;
		INode tempNode2 = head;
		
		if(head == tail)
		{
			head = null;
			tail = null;
		}
		else 
		{
			while(!tempNode1.getKey().equals(myNode.getKey()) && !tempNode2.equals(tail))
			{
				tempNode2 = tempNode1;
				tempNode1 = tempNode1.getNext();
			}
			
			tempNode2.setNext(tempNode1.getNext());
		}
		
		return head;
	}

	public int size() 
	{
		INode tempNode = head;
		int count = 0;
		
		if(head == null)
		{
			return 0;
		}	
		else if(head == tail)
		{
			return 1;
		}
		else 
		{	
			while(!tempNode.equals(tail))
			{
				count++;
				tempNode = tempNode.getNext();
			}
		}
		
		return count+1;
	}

	public void display() 
	{
		INode temp = head;
		
		if(head == null && tail == null)
		{
			System.out.println("Empty List");
		}
		else 
		{
			while(!temp.equals(tail))
			{
				System.out.print(temp.getKey() + " -> ");
				temp = temp.getNext();
			}
			
			System.out.print(temp.getKey() + "\n");
		}
	}
	
}
