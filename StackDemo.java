package Java_concepts;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Stack is based on LIFO principle => Last in first out. stack extends vector
		// initialization of the stack 
		// Stack methods are synchronized in nature in terms of thread
		Stack<Integer> stackList = new Stack <>();
		
		// we can add a element into the stack by using the push method 
		stackList.push(1);
		stackList.push(2);
		stackList.push(3);
		stackList.push(4);
		
		// to check which element on the top of the stack used peek() method
		System.out.println("Top element in stack is : "+stackList.peek());
		
		// TO remove top element use pop() method
		stackList.pop();
		System.out.println("Stack after removing element remove Top one from stack then stack is : "+stackList);
		System.out.println("To check empty stack or not uses isEmpty on stack : "+ stackList.isEmpty());
		System.out.println("To check size of the stack uses size() : "+stackList.size());
		
		// index is from top to bottom and where matches element that index is returned as result 
		// if stack is from top is : 1,2,3 then is search 1 then returns 3 
		// because from top 1 is on index 3. Here index starts from the 1.
		System.out.println("To search in stack any object then we can use search() : "+ stackList.search(1)); 
		
		// we can initialize stack by using linked list also by using last method
		LinkedList<Integer> stackByUsingLinkedList = new LinkedList<>();
		stackByUsingLinkedList.addLast(11);
		stackByUsingLinkedList.addLast(12);
		stackByUsingLinkedList.addLast(13);
		stackByUsingLinkedList.addLast(14); // equivalent to push in stack
		stackByUsingLinkedList.removeLast();// equivalent to pop in stack
		stackByUsingLinkedList.getLast();   // equivalent to peek in stack
		stackByUsingLinkedList.size();      // to use get size of the stack list
		stackByUsingLinkedList.isEmpty();   // to check list is empty or not 
		

	}

}
