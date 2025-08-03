package java_demo;

public class recusionfunction {
	
	public static void main(String args[]){
	    String str = "He is ";
	   // System.out.println(str.substring(0,0));
	    String temp = "";
	
	    String finalString = "";
	        for(int i =str.length()-1;i>=0;i--){//
	        	//s,ssi,ssii,e,eeh,eehhi
	        	//System.out.println(temp+=i!=0?str.charAt(i):str.charAt(i)+" " );
	          temp+=i!=0?str.charAt(i):str.charAt(i)+" "; //ss,ssii,ee,eeh
	        //System.out.println(temp);
	            if(str.charAt(i) == ' '||i==0){
	                for(int j=temp.length()-1;j>=0;j--){
	                	
	                    finalString += temp.charAt(j); // is
	                }
	                temp = "";
	            }
	        }
	           //System.out.println(str);
	           System.out.println(finalString);
	           
	           /**********************************revrse each words*******************************/
	           String na="he is coming to chennai";
	   		String rev="";
	   		for(int i=0;i<na.length();i++){
	   			String tem="";
	   			if(na.charAt(i)==' '||i==na.length()-1 ){

	   				if(i==na.length()-1 )
	   					i=i+1;
	   				for(int j=i-1;j>=rev.length();j--){
	   					
	   					tem+=na.charAt(j);
	   				}
	   				rev+=tem+" ";
	   				   				
	   			}
	   			
	   			
	   		}
	   		
	   		System.out.println(rev);
	   	 }
	           
	           
	    }
	
