package probne;

public class PermCheck {

	 public static int solution(int[] A) {
		 int B[]= new int[A.length];
		 try{
			 for(int i=0; i<A.length; i++) {
				 if(B[A[i]-1]==0) {
					 B[A[i]-1]=A[i];
				 }else {
					 return 0;
				 }
			 }
			 }catch (ArrayIndexOutOfBoundsException e) {
				 return 0;
			 };
		 return 1;
	    }
	
	public static void main(String[] args) {
		int []A= new int[4];
		A[0]=3;
		A[1]=1;
		A[2]=4;
		A[3]=2;
		System.out.print(solution(A));

	}

}
