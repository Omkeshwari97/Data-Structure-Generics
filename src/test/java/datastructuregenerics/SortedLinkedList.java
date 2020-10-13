package datastructuregenerics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SortedLinkedList 
{
	public INode head;
	public INode tail;
	
	public SortedLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	public void create(INode myNewNode) 
	{		
		if(head == null)
		{
			head = myNewNode;
		}
		
		if(tail == null)
		{
			tail = myNewNode;
		}
		
		if(head == tail)
		{
			if(myNewNode.getKey().compareTo(head.getKey()) < 0)
			{
				INode temp = head;
				head = myNewNode;
				myNewNode.setNext(temp);
			}
			else
			{
				tail.setNext(myNewNode);
				tail = myNewNode;
			}
		}
		else 
		{
			INode temp1 = head;
			INode temp2 = head.getNext();
			
			while(!temp1.equals(tail))
			{
				if(temp1.getKey().compareTo(myNewNode.getKey()) < 0 && myNewNode.getKey().compareTo(temp2.getKey()) < 0)
				{
					temp1.setNext(myNewNode);
					myNewNode.setNext(temp2);
					return;
				}
				else 
				{
					temp1 = temp1.getNext();
					temp2 = temp2.getNext();
				}
			}
			
			tail.setNext(myNewNode);
			tail = myNewNode;
		}
		
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
