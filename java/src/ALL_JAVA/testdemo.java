package ALL_JAVA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class testdemo {
public static void main(String a[]) throws FileNotFoundException{
	int n[][]= {
		      {1,2,3}, 
		      {4,5,8}, 
		      {9,6,7}, 
		};
	
	
 //int ln[][]=new int[n.length][n[0].length];
 
for(int i=0;i<n.length;i++){
	for(int j=0;j<n[0].length;j++){
			int temp=n[i][j];	
			n[i][j]=n[i][(n.length-1)-j];
			n[(n.length-1)-i][j]=temp;	
			
		
		
	}
	
}
for(int m=0;m<n.length;m++){
	for(int k=0;k<n[0].length;k++){
		System.out.print(n[m][k]+"\t");
	}
	System.out.println();
}
}
}
