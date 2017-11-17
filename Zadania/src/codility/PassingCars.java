package codility;

public class PassingCars {

	 public static int solution(int[] A) {
	 	 int cars = 0;
		 int west = 0;
		 int east = 0;
		 for(int i=0; i<A.length; i++) {
			 if(A[i]==0) {
				 east++;
			 }else {
				 west++;
			 }
		 }
		 for(int i=0; i<A.length; i++) {
			 if(A[i]==0) {
				 cars+=west;
			 }else {
				 west-=1;
			 }
		 }
		 if(cars > 1000000000) {
			 return -1;
		 }
		 return cars;
	 }
	
	public static void main(String[] args) {
		int A[] = new int [5];
		A[0] = 0;
		A[1] = 1;
		A[2] = 0;
		A[3] = 1;
		A[4] = 1;
		System.out.println(solution(A));
	}

}
