package java_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class anotherway_sorthigh {
public static void main(String a[]){
	int[] ran = { 8, 5, 4, 2, 8, 1, 1, 6, 7, 1, 9 };
	
	Arrays.sort(ran);
	for(int i=0;i<ran.length;i++){
		boolean b=false;
		for(int j=i+1;j<ran.length;j++){
			if(ran[i]==ran[j]){
				b=true;
				break;
			}
		}
		if(!b){
			System.out.print(ran[i]+" ");
		}
	}
	for(int i=0;i<ran.length;i++){
		//System.out.print(ran[i]+" ");
	}
	SortedSet<Integer> set = new TreeSet<Integer>();
	//set.remove(set.last());
	for (int i: ran) {
	    set.add(i);
	}
	// Remove the maximum value; print 
	//the largest remaining item
	set.remove(set.last());
	//System.out.println(set.remove(set.last()));
	//set.remove(set.first());
	
//	System.out.println(set.last());
//	ArrayList<Integer>al=new ArrayList<Integer>();
//	for(int i:ran)
//	al.add(i);
//Object ob=Collections.max(set);
//	
//System.out.println(set.last());


}
}
