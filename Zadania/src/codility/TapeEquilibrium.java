package codility;

public class TapeEquilibrium {

	public static int solution(int[] A) {
       int min = 100000;
       int left = 0;
       int right = 0;
       int sum = 0;
       int absolute = 0;
       for (int i=0; i<A.length; i++) {
    	   sum+=A[i];
       }
       for(int p=1; p<A.length; p++) {
    	   left += A[p-1];
    	   right=sum-left;
    	   absolute = Math.abs(left - right);
    	   if(absolute<=min) {
    		   min=absolute;
    	   }
    	   
       }
		return min;
    }
	
	public static void main(String[] args) {
		int []A= new int[5];
		A[0]=3;
		A[1]=1;
		A[2]=2;
		A[3]=4;
		A[4]=3;
		System.out.print(solution(A));

	}

}
