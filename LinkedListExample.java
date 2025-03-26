package collectionByED;

import java.util.LinkedList;

class Node {
	public int value;
	public Node next;
}

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Linked List in java is as part of Collection -> framework implements List interface.
		// In ArrayList Stores elements in dynamic array, where as linked list stores element in node a doubly linked list.
		// Linked list is linear data structure where each element is separate object called node. 
		// It having two parts: -> 1. Data    : The value stored in the node
		//                      -> 2. Pointer : Two pointer one is pointing to the next node & other is pointing to the previous node.
		
		// add or insert => better complexity than arrayList because you don't need to shift element from location to right/left in case add/delete.
		//               => you have just add one node in the middle and point next and previous node reference to that node don't need to shift.
		// get element(index) => slower than arrayList because you have to traverse list until you get it from beginning 
		// Memory             => occupy more memory -> next and previous reference and value. 
		
		// classic implementation of LinkedList
		Node node1 = new Node ();
		Node node2 = new Node ();
		node1.value=1;
		node1.next=node2;
		
		node2.value=2;
		node2.next=null;
		
		// Java 
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20); // 0(1) complexity 
		
		System.out.println("Get element by index : "+ linkedList.get(0)); // slower than arrayList 0(n)

	}

}
