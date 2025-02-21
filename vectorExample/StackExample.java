package vectorExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10); //add() can also be used 
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		System.out.println("--------------------");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	
		System.out.println("---------------");
		s.peek();
		System.out.println(s);
		

	}

}
