package probne;



public class PermMissingElem {
	
	public static int solution(int[] A) {
		int number = 0;
		int Num[]= new int [A.length+1];
		for(int i=0; i<A.length; i++) {
			Num[A[i]-1]=A[i];
		}
		for(int i=0; i<Num.length; i++) {
			if(Num[i]==0) {
				number= i+1;
			}
		}
		
		return number;
    }

	public static void main(String[] args) {
		int []A= new int[4];
		A[0]=2;
		A[1]=3;
		A[2]=1;
		A[3]=5;
		System.out.print(solution(A));
	}
}
