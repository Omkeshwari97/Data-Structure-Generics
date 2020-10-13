package datastructuregenerics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Objects;

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
		myLinkedList.display();
		
		boolean result = myLinkedList.head.equals(myThirdNode)&&
							myLinkedList.head.getNext().equals(mySecondNode)&&
							myLinkedList.tail.equals(myFirstNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenNumberWhenAddedToLinkedListTobeAddedToLast() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.display();
		
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
		myLinkedList.display();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
							myLinkedList.head.getNext().equals(mySecondNode)&&
							myLinkedList.tail.equals(myThirdNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenLinkedListDeleteFirstNumber() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		INode head = myLinkedList.pop();
		myLinkedList.display();
		
		boolean result = myFirstNode.equals(head); 
				
		assertTrue(result);
	}
	
	@Test
	public void givenLinkedListDeleteLastNumber() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		INode tail = myLinkedList.popLast();
		myLinkedList.display();
		
		boolean result = mySecondNode.equals(tail); 
				
		assertTrue(result);
	}
	
	@Test
	public void givenLinkedListSearchNumber() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(80);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.display();
		
		boolean result = myLinkedList.search(mySecondNode); 
		assertTrue(result);
		
		boolean result1 = myLinkedList.search(myFourthNode); 
		assertFalse(result1);;
	}
	
	@Test
	public void givenNumberWhenAddedToLinkedListTobeAddedAfterSpecificElement() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.insertAfter(mySecondNode, myThirdNode);
		myLinkedList.display();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
							myLinkedList.head.getNext().equals(mySecondNode)&&
							myLinkedList.head.getNext().getNext().equals(myThirdNode)&&
							myLinkedList.tail.equals(myFourthNode);
		
		assertTrue(result);
	}
	
	@Test
	public void givenLinkedListDeleteSpecificNumber() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		
		INode head = myLinkedList.popSpecific(myThirdNode);
		myLinkedList.display();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
						myFirstNode.getNext().equals(mySecondNode)&&
						mySecondNode.getNext().equals(myFourthNode);
				
		assertTrue(result);
		
		int size =myLinkedList.size();
		assertEquals(3, size);
	}
	
	@Test
	public void givenLinkedListDeleteSpecificNumberwhenSingleElement() 
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
				
		INode head = myLinkedList.popSpecific(myFirstNode);
		myLinkedList.display();
		
		boolean result = Objects.equals(myLinkedList.head, myLinkedList.tail);				
		assertTrue(result);
		
		int size =myLinkedList.size();
		assertEquals(0, size);
	}
}
