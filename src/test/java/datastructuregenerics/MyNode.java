package datastructuregenerics;

public class MyNode<T extends Comparable> implements INode<T> 
{
	private T key;
	private INode next;
	
	public MyNode(T key) 
	{
		this.key = key;
		this.next = null;
	}

	public INode getNext() 
	{
		return next;
	}

	public void setNext(INode next) 
	{
		this.next = next;
	}

	public T getKey() 
	{
		return key;
	}

	public void setKey(T key) 
	{
		this.key = key;
	}
	
	
}
