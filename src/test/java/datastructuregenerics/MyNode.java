package datastructuregenerics;

public class MyNode<T> 
{
	private T key;
	private MyNode next;
	
	public MyNode(T key) 
	{
		this.key = key;
		this.setNext(null);
	}

	public MyNode getNext() 
	{
		return next;
	}

	public void setNext(MyNode next) 
	{
		this.next = next;
	}
	
	
}
