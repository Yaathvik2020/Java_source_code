package ALL_JAVA;

public class demotest {
	public static void main(String[] g){
		String str="koog78th";
		int n=str.length();
		
		for(int i=0,j=n-1;i<n &&j>=0;i++,j--){
			
			if(i<j){
				for(int k=0;k<i;k++){
					System.out.print(" ");
				}
				System.out.print(str.charAt(i));
				for(int k=0;k<j-i-1;k++){
					System.out.print(" ");
				}
				System.out.print(str.charAt(i));
			}
			if(i==j){//2
				for(int k=0;k<i;k++){
					System.out.print(" ");
				}
				System.out.print(str.charAt(i));
			}
			if(i>j){ //3,1
				for(int k=j-1;k>=0;k--){
					System.out.print(" ");
				}
				System.out.print(str.charAt(i));
				for(int k=0;k<i-j-1;k++){
					System.out.print(" ");
				}
				System.out.print(str.charAt(i));
			}
			System.out.println();
			
		}
		}
		
	 }			
	

