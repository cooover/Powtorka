package probne;

import java.util.HashSet;

public class FrogRiverOne {
	
	public static int solution(int X, int[] A) {
		 HashSet<Integer> Positions = new HashSet<Integer>();
			 for(int i=0; i<A.length; i++) {
				 if(X==1) {
					 return 0;
				 }
				 if(Positions.size()<=X){
					 Positions.add(A[i]);
				 }else {
					 return i-1;
				 }
		 }
		 return -1;
    }

	public static void main(String[] args) {
		int A[]= new int[8];
		A[0] = 1;
		A[1] = 3;
		A[2] = 1;
		A[3] = 4;
		A[4] = 2;
		A[5] = 3;
		A[6] = 5;
		A[7] = 4;
		System.out.println(solution(5,A));
	}

}
