package powtorka;


import java.util.Stack;

public class Stacks {
	
	public static void main(String[] args) {
		Stack<String> theStack = new Stack<String>();
		theStack.push("10");
		theStack.push("15");
		theStack.pop();
		System.out.println(theStack.peek());
		
	}

}
