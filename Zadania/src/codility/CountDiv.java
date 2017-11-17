package codility;

public class CountDiv {

	 public static int solution(int A, int B, int K) {
	     /*   int number = 0;
	        for(int i=A; i<=B; i++) {
	        	if(i%K==0) {
	        		number+=1;
	        	}
	        }
	        return number;
	        */
		 if(A%K==0) {
	        	return 1+ (B-A)/K;
	        }else if(K>(B-A)){
	        	return 0;
	        }else{
	        	A+=1;
	        	while(A%K!=0) {
	        		A++;
	        	}
	        	return 1+ (B-A)/K;
	        }
	    }
	
	public static void main(String[] args) {
		System.out.println(solution(6,11,2));

	}

}
