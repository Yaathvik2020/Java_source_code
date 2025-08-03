package ALL_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

 class demo{

	public static void  main(String[] a){
		
		//------------------- Xformt word-------------------
		String str="kooth";
		//int n=str.length();
		for (int i = 0; i < str.length(); i++) 
	    { 
	        int j = str.length() - 1 - i; //4,3,2,1,0
	        for (int k = str.length()-1; k >= 0; k--) 
	        { 
	            if (k == j || k == i) //0 4, 1,3 ,2,2,
	            	                  //3,1,4,0
	                System.out.print(" "+str.charAt(k)); 
	            else
	                System.out.print(" "); 
	        } 
	        System.out.println(""); 
	    }
		
		String s1 = "chinna"; 
		String s2 = "chin";
		
	char[]c1=s1.toCharArray();
	char c2[]=s2.toCharArray();
	//System.out.println(String.valueOf( c1));
	
	
	for(int i=0;i<c1.length;i++){
	int check =0;
		for(int j=0;j<c2.length;j++){
			
			if(String.valueOf(c1[i]).equals(String.valueOf(c2[j]))){
				check++;
				//System.out.println(c2[j]);
				break;
				
			}
		}
			//System.out.println(check);
			if(check>0){
				s1=s1.replaceAll(String.valueOf(c1[i]),"");
				s2=s2.replaceAll(String.valueOf(c1[i]),"");
				
			
		}
		
	}
	System.out.println(s1+" "+s2);
	
	//next method
	//s1=s1.replaceAll("["+s2+"]", "");
	System.out.println(s1);
	
	//given no is prime or not
	int  no=4;
	int flg=0;
	for(int i=2;i<=no/2;i++ ){//2,3
		if(no%i==0){
			flg=1;
			break;
		}
		
	}
	if(flg==0){
		System.out.println("give: "+no);
	}
	
	//n no of prim no
	System.out.print("prime:");
    for(int i=2;i<=100;i++){
		boolean flag =true;	
		for(int j=2;j<=i/2;j++){
			if(i%j==0){
				flag=false;
				break;
			}				
		}
		if(flag){
			System.out.print(i +" ");
		}
	}
    //b-->s-->i-->l-->f->d//small to high
	// fibonic serial
    System.out.println();
    ArrayList<Integer> s=new ArrayList<Integer>();
	int nn=0;
	int prev=0;
	for(int i=0;i<15;i++){
		if(s.size()<2){
			prev=nn;
			nn=i;
			 s.add(prev+nn);//0,1
			
		}
		else{
			 prev= s.get(i-2);//1,
			 nn=s.get(i-1);
			 s.add(prev+nn);
		}
	}
	System.out.println(s);
    
	//removing the space and duplicate value(Chinn a)
	String n="chinnggiyhvh a dn";
	String dup_remove="";
	n=n.replaceAll("\\s", "");
	//System.out.println(n.length());
for(int i=0;i<n.length();i++){
	boolean  b=true;
	for(int j=i+1;j<n.length();j++){
		if(String.valueOf(n.charAt(i)).equalsIgnoreCase(String.valueOf(n.charAt(j))))
		{
		   b=false;
			break;
		}
		//break;
	}
	if(!b){
		dup_remove+=n.charAt(i);
	}
}
System.out.println("Length of "+dup_remove+" "+dup_remove.length());
	
//s occurence find
String nnn="chssnsnssnsnssn";
int count=nnn.length()-nnn.replace("s","").length();

System.out.println(count);
//Anagaram of two string (keep,peek);
String n1="joy";
String n2="enjoy";

char c11[]=n1.toCharArray();
char c22[]=n2.toCharArray();
Arrays.sort(c11);
Arrays.sort(c22);

Boolean t=false;
t=Arrays.equals(c11, c22);
if(t){
	//System.out.println(n1+ " is anagram of "+n2);
}
else{
	//System.out.println(n1+"is not anagram of "+n2);
}
//each word reverse
		String nt="java ii jspsj and servlet";
		String tp="";
		 for(int i=nt.length()-1;i>=0;i--){
			 tp+=i!=0?nt.charAt(i):nt.charAt(i)+" ";
			 String rv="";
			 if(nt.charAt(i)==' ' ||i==0){
				 for(int j=tp.length()-1;j>=0;j--){
					 rv+=tp.charAt(j);
				 }
				 if(tp.trim().equals(rv.trim())){
					 System.out.println(tp+"ploy");
				 }
				 tp="";
			 }
		 }
	}
}


			
	
	
	

	

	

