package datastructuregenerics;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackQueueTest {

	private MyLinkedList myQueue;

	@Test
	public void givenNumberWhenPushedToStackCreateStack() 
	{
		INode top;
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myStack = new MyLinkedList();
		
		myStack.add(myFirstNode);
		top = myStack.head;
		assertEquals(top, myFirstNode);
		myStack.display();
		
		myStack.add(mySecondNode);
		top = myStack.head;
		assertEquals(top, mySecondNode);
		myStack.display();
		
		myStack.add(myThirdNode);
		top = myStack.head;
		assertEquals(top, myThirdNode);
		myStack.display();
		
		boolean result = myStack.head.equals(myThirdNode)&&
							myStack.head.getNext().equals(mySecondNode)&&
							myStack.tail.equals(myFirstNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenStackWhenPoppedToDeleteTopElement() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myStack = new MyLinkedList();
		myStack.add(myFirstNode);
		myStack.add(mySecondNode);
		myStack.add(myThirdNode);
		
		myStack.display();
		assertEquals(3, myStack.size());
		assertEquals(myThirdNode, myStack.pop());
		
		myStack.display();
		assertEquals(2, myStack.size());
		assertEquals(mySecondNode, myStack.pop());
		
		myStack.display();
		assertEquals(1, myStack.size());
		assertEquals(myFirstNode, myStack.pop());
		
		myStack.display();
		assertEquals(0, myStack.size());
		assertEquals(null, myStack.pop());
	}
	
}
