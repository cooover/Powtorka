package codility;

import java.util.Arrays;

public class MaxProductOfThree {

	public static int solution(int[] A) {
		Arrays.sort(A);
		if(A[A.length-3]<=0 && A[A.length-2]<=0 && A[A.length-1]<=0) {
			return A[A.length-3]*A[A.length-2]*A[A.length-1];
		}else {
			if((A[0]<0 && A[1]<0) && Math.abs(A[0]*A[1])>=A[A.length-3]*A[A.length-2]) {
				return A[0]*A[1]*A[A.length-1];
			}else {
				return A[A.length-3]*A[A.length-2]*A[A.length-1];
			}
		}
    }
	
	public static void main(String[] args) {
		int A[] = {-3,1,2,-2,5,6};
		int B[] = {-5, 5, -5, 4};
		int C[] = {-10, -2, -4};
		int D[] = {-4,-6,3,4,5};
		int E[] = {4,7,3,2,1,-3,-5};
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
		System.out.println(solution(D));
		System.out.println(solution(E));
	}
}
