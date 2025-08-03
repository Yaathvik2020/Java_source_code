package ALL_JAVA;

public class pymid2 {
	public static void main(String a[]){
		
		// == Equal differen
		String s1="hello";
		String s4="hello";
		String s2=new String("hello");
		String s3=s2;
		System.out.println(s1.equals(s2));
		System.out.println(" s3: "+s3.equals(s2));
		System.out.println(" ");
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		//System.out.println(s3==s1);
		
		
		int n=5;
		 for(int i=0;i<n;i++){
			 	
			 for(int j=i;j<n;j++){
				 System.out.print(" ");
			 }
for(int k=0;k<=i;k++){
				 
				 System.out.print("5 ");
			 }
			 System.out.println();
		 }
				
	}

}
