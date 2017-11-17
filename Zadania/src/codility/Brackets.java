package codility;

import java.util.ArrayDeque;

public class Brackets {
	
	public static int solution(String S) {
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for(int i=0; i<S.length();i++) {
			if(S.charAt(i)=='}' || S.charAt(i)==']' || S.charAt(i)==')') {
				if(stack.isEmpty()) {
					return 0;
				}
				char top = stack.pop();
				if((top!='{' && S.charAt(i)=='}') || (top!='[' && S.charAt(i)==']') || (top!='(' && S.charAt(i)==')')) {
					return 0;	
				}
			}else {
				stack.push(S.charAt(i));
			}
		}
		if(stack.isEmpty()) {
			return 1;
		}else {
			return 0;
		}
    } 

	public static void main(String[] args) {
		String S = "{[()()]}";
		String T = "([)()]";
		String U = ")(";
		System.out.println(solution(S));
		System.out.println(solution(T));
		System.out.println(solution(U));

	}

}
