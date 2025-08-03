package java_demo;

import java.util.StringTokenizer;

public class demo4 {
	
	public void binary(int n){
		int bin[]=new int[40];
		int index=0;
		while(n>0){
			bin[index++]=n%2;//101
			n=n/2;//1
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(bin[i]);
		}
		System.out.println();
	}
	public static void main(String a[]){
	 
		demo4 d=new demo4();
		d.binary(5);
		//Integer.toHexString(6);
	
		//System.out.println(Integer.toBinaryString(10));
		//System.out.println(Integer.toOctalString(8));
		
		
}
}
