package probne;

import java.util.HashSet;

public class Distinct {

	public static int solution(int[] A) {
        HashSet<Integer> Values = new HashSet<Integer>();
        for(int i=0; i<A.length; i++) {
        	Values.add(A[i]);
        }
        
		return Values.size();
    }
	
	public static void main(String[] args) {
		int A[] = new int [6];
		A[0] = 2;
		A[1] = 1;
		A[2] = 1;
		A[3] = 2;
		A[4] = 3;
		A[5] = 1;
		System.out.println(solution(A));

	}

}
