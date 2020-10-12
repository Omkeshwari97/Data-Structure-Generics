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
}