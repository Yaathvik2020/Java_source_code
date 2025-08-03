package ALL_JAVA;

public class sumofprimeno {
	

	public static boolean prime( int n){
		for(int i=2;i<=n/2;i++){
		if(n%i==0){
			return false;
		}
		}
	return true;
	}
	
			
	public static void main(String[] args) {
		int n=2;
		int count=0;
		int sum=0;
 while(n<10){
	  if(prime(n)){//2,3,5,7
		  sum+=n;
		  
	  }
	  n++;
 }
	  System.out.println(sum);
  
		
	}
}
