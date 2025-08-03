package java_demo;

import java.util.StringTokenizer;

public class reversestring {
	///rever no using recusion
	public static void test(int n){
		 if(n<10){
			 System.out.print(n);
			 return;
		 }
		  System.out.print(n%10);
		   test(n/10);
	 }

	public static void main(String a[]){
		String st="i am going to change my life";
		test(12345);
		System.out.println();
		StringTokenizer s=new StringTokenizer(st," ");
		a=new String[s.countTokens()];
		int count=-1;
		while(s.hasMoreElements()){
			++count;
			a[count]=(String) s.nextElement();
		}
		int i=0;
		for(i=a.length-1;i>=0;i--){
			
			System.out.print(a[i] +" ");
		}
	}
	
	

}
