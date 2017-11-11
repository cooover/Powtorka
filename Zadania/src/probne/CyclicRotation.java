package probne;

public class CyclicRotation {
	public static int[] solution(int[] A, int K) {
		try {
		for(int i=0; i<K; i++) {
			int last=A[A.length-1];
			for(int j=A.length-1; j>1-1;j--) {
				A[j]=A[j-1];
			}
			A[0]= last;
			
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Empty Array");
		}
		return A;
    }

	public static void main(String[] args) {
		int []A= new int[5];
		A[0]=3;
		A[1]=8;
		A[2]=9;
		A[3]=7;
		A[4]=6;
		solution(A,3);
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}

}
