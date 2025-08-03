package java_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MAX_MIN_MX3NO_MI3NOusing_ARRAY_LIST {

	public static void main(String a[]){
		ArrayList<Integer>  ar=new ArrayList<Integer>();
		ar.add(17);
		ar.add(14);
		ar.add(13);
		ar.add(1);
		ar.add(15);
		ar.add(12);
		//MAX and Min Value find using arraylist&
		int mm=(int)ar.get(0);
		int mx=(int)ar.get(0);
		for(int i=0;i<ar.size();i++){
		int number=(int) ar.get(i);
		
			if(number<mm)
			mm=number;
			//System.out.print(mm+",");
			if(number>mx){
				mx=number;
			//System.out.print(mx+",");
			}
		}
		System.out.println(mm+" "+mx);
//------------------------------------------------------------------------------------------------
		int max=0;
		int mi=0;
		int third=0;
		
		for(int i=0;i<ar.size();i++){
			int num=(int)ar.get(i);
			if(num>max){
				mi=max;
				max=num;
			}
			else if(num>mi){//15
				third=mi;//14
				mi=num;//15
			}
				else 
					third=num;//13
				
			}		
		System.out.println("Max Two:"+third+" "+mi+" "+max);
	
	// three digits------------------------------------------------------------------------------------------
	Collections.sort(ar);

	int count= -1;
	for(int i=ar.size()-1;i>=0;i--){
		int n=(int)ar.get(i);
		count++;
		//System.out.print(n+" ");
		if(count<=2){
		System.out.print(n+" ");
		}
	}
	//----------------------------------------setusing three digit-----
	TreeSet t=new TreeSet(ar);
    Object n[]=t.toArray(new Integer[0]);
     int ct=-1;
	for(int i=t.size()-1;i>=0;i--){
		ct++;
		//System.out.print(count+" ");
		if(ct<=2){
		//System.out.print(n[i]+" ");
		}
	}
	
	}
	
	

}

