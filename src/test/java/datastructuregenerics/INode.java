package datastructuregenerics;

public interface INode<T> 
{
	 void setKey(T key);
	 T getKey();
	 
	 void setNext(INode next);
	 INode getNext();
}
