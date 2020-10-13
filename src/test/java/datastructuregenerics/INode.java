package datastructuregenerics;

public interface INode<T extends Comparable> 
{
	 void setKey(T key);
	 T getKey();
	 
	 void setNext(INode next);
	 INode getNext();
}
