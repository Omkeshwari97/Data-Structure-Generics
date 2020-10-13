package datastructuregenerics;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackQueueTest {

	@Test
	public void givenNumberWhenPushedToStackCreateStack() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myStack = new MyLinkedList();
		myStack.add(myFirstNode);
		myStack.add(mySecondNode);
		myStack.add(myThirdNode);
		myStack.display();
		
		boolean result = myStack.head.equals(myThirdNode)&&
							myStack.head.getNext().equals(mySecondNode)&&
							myStack.tail.equals(myFirstNode);
		
		assertTrue(result);
	}
	
}
