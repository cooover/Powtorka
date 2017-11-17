package powtorka;

import java.util.*;
public class Queues {

	public static void main(String[] args) {
		Queue<String> theQueue = new ArrayDeque<String>();
		theQueue.add("first");
		theQueue.add("second");
		theQueue.add("third");
		System.out.println(theQueue.remove());
	}

}
