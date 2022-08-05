package Stack;

import java.io.*;
import java.util.*;
import java.util.Stack;  

public class SimplePushPop {
	public static void simplePushPop(){
    
	 Stack<Integer> STACK = new Stack<Integer>();
	 
     // Use add() method to add elements
     STACK.push(10);
     STACK.push(15);
     STACK.push(30);
     STACK.push(20);
     STACK.push(5);

     // Displaying the Stack
     System.out.println("Initial Stack: " + STACK);
//topped element
     System.out.println("Initial top element"+ " stack is: " + STACK.peek());
     // Removing elements using pop() method
     System.out.println("Popped element: " +STACK.pop());
     System.out.println("Popped element: " + STACK.pop());

     // Displaying the Stack after pop operation
     System.out.println("Stack after pop operation "+ STACK);
     
     System.out.println("Top element after pop out"+ " stack is: " + STACK.peek());
}
}