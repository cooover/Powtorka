package codility;

import java.util.Arrays;

public class Triangle {

	public static int solution(int[] A) {
		int triangular = 0;
	    Arrays.sort(A);
	    for(int i=0; i<A.length-2; i++) {
	    	if(A[i]+A[i+1]>A[i+2]) {
	    		triangular++;
	    	}
	    }
	    if(triangular==0) {
	    	return 0;
	    }else{
	    	return 1;
	    	}
	    }
	
	public static void main(String[] args) {
		int A[]= {10,2,5,1,8,20};
		int B[]= {10,50,5,1};
		System.out.println(solution(A));
		System.out.println(solution(B));
	}

}
