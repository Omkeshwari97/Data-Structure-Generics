package datastructuregenerics;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest 
{
	@Test
	public void givenNumberWhenAddedToLinkedListTobeAddedToTop() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		boolean result = myLinkedList.head.equals(myThirdNode)&&
							myLinkedList.head.getNext().equals(mySecondNode)&&
							myLinkedList.tail.equals(myFirstNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenNumberWhenAddedToLinkedListTobeAddedToToLast() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
							myLinkedList.head.getNext().equals(mySecondNode)&&
							myLinkedList.tail.equals(myThirdNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenNumberWhenAddedToLinkedListTobeAddedToMiddle() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
							myLinkedList.head.getNext().equals(mySecondNode)&&
							myLinkedList.tail.equals(myThirdNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenNumberWhenDeletedFromLinkedList() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		INode head = myLinkedList.pop();
		
		boolean result = myFirstNode.equals(head); 
				
		assertTrue(result);
	}
}
