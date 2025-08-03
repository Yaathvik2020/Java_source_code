  package ALL_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class clas {
	
	     public static void main(String a[]) {
	    	int [] ad={2,9,6,5,8,4,3,1};
	    	//int k=0;
	    	ArrayList t=new ArrayList();
	    	
	    	ArrayList od=new ArrayList();
	    	
	    	for(int i=0;i<ad.length;i++){
	    		if(ad[i]%2==0){
	    			t.add(ad[i]);
	    		}
	    		else{
	    			od.add(ad[i]);
	    		}
	    	    	}
	    	
	    	Collections.sort(t);
	    	Collections.sort(od);
	    	
	    	for(int k=t.size()-1;k>=0;k--){
	    		int n=(int) t.get(k);
	    		System.out.print(n +" ");
	    		
	    	}
	    	System.out.println(" odd:");
	    	for(int k=od.size()-1;k>=0;k--){
	    		int n=(int) od.get(k);
	    		System.out.print(n +" ");
	    	}
	    	
	    	//Arrays.sort(ad);
	    	//System.out.println(str.indexOf('a',4));
	    	for(int i=0;i<ad.length;i++){
	    		for(int j=0;j<ad.length;j++){
  	    			for(int k=0;k<ad.length;k++){	    				
	    				if(ad[j]<ad[k]){
	    					int temp=ad[j];
	    					ad[j]=ad[k];
	    					ad[k]=temp;
	    					
	    				}
	    			}
	    		}
	    	}
	    	String odd="";
	    	String evn="";
	    	System.out.println("chinna...7");
	    	for(int k=0;k<ad.length;k++){
	    		if(ad[k]%2==0){
	    			odd+=String.valueOf(ad[k])+" ";
	    			//System.out.print(ad[k]);
	    		}
	    		else{
	    			evn+=String.valueOf(ad[k])+" ";
	    		
	    		}
	    	}
	    	System.out.println("ODD: "+odd);
	    	System.out.println("EVEN: "+evn);
	     }
	     }