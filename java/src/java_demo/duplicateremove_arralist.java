package java_demo;

import java.util.ArrayList;
import java.util.Collections;

public class duplicateremove_arralist {
public static void main(String a[]){
	int d[]={1,3,3,5,7,9,7,6,5,3,4,1,2};
	
	 ArrayList ar=new  ArrayList();
	 for(int i=0;i<d.length;i++){
		 ar.add(d[i]);
	 }
	//System.out.print(ar);
	 for(int i=0;i<ar.size();i++){
		for(int j=i+1;j<ar.size();j++){
			if(ar.get(i).equals(ar.get(j))){
				ar.remove(j);
				
			}
		}
	 		 }
	 Collections.sort(ar);
	 System.out.println(ar);

}
}
