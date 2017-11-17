package codility;

import java.util.HashSet;

class Solution {
	public static int solution(int[] A) {
		int lowest = 1;
		HashSet<Integer> Sort = new HashSet<Integer>();
		for(int i = 0; i<A.length; i++) {
			Sort.add(A[i]);
			while(Sort.contains(lowest)) {
				lowest+=1;
			}
		}
		return lowest;
	}

    public static void main(String[] args) {
		int []A= new int[6];
		A[0]=1;
		A[1]=3;
		A[2]=6;
		A[3]=4;
		A[4]=1;
		A[5]=2; 
		System.out.println(solution(A));
		A[0]=1;
		A[1]=2;
		A[2]=3;
		A[3]=4;
		A[4]=5;
		A[5]=6; 
		System.out.println(solution(A));

		
	}
}
