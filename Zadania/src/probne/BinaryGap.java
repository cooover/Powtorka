package probne;

import java.util.ArrayList;

public class BinaryGap {
	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
		int length = 0;	
		ArrayList<Integer> A= new ArrayList<Integer>();
		for(int i = 1; i<binary.length(); i++) {
			if(binary.charAt(i) == '0') {
				length=length+1;
			}else {
				A.add(length);
				length = 0;
			}
		}
		int longest = 0;
		for(int i = 0; i<A.size(); i++) {
			if(A.get(i)>longest) {
				longest=A.get(i);
			}
		}
		return longest;
	
	}

	public static void main(String[] args) {
		System.out.println(solution(1041));

	}

}
