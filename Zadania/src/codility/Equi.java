package codility;

	class Equi {
		public static int solution(int A[], int N) {
			int sum = 0;
			int leftSum = 0;
			int rightSum = 0;
			for(int i = 0;i<A.length;i++) {
				sum+=A[i];
			}
			for(int i = 0; i<A.length; i++) {
				rightSum = sum - (leftSum + A[i]); 
				if(rightSum == leftSum) {
					return i;
				}
				leftSum += A[i];
			}
			return -1;
		   
		}
		public static void main(String[] args) {
			int n = 8;
			int []A= new int[n];
			A[0]=-1;
			A[1]=3;
			A[2]=-4;
			A[3]=5;
			A[4]=1;
			A[5]=-6;
			A[6]=2;
			A[7]=1; 
			System.out.println(solution(A,8));
		}
		
	}

