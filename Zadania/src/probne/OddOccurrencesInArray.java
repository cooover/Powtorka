package probne;

import java.util.ArrayList;

public class OddOccurrencesInArray {
	public static int solution(int[] A) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(A[0]);
		for(int i=1; i<A.length; i++) {
			if(Numbers.contains(A[i])) {
				Numbers.remove(new Integer(A[i]));
			}else {
				Numbers.add(A[i]);
			}
		}
		return Numbers.get(0);
    }

	public static void main(String[] args) {
		int []A= new int[7];
		A[0]=9;
		A[1]=3;
		A[2]=9;
		A[3]=3;
		A[4]=9;
		A[5]=7;
		A[6]=9;
		System.out.println(solution(A));

	}

}
