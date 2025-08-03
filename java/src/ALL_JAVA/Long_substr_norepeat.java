package ALL_JAVA;

import java.util.HashSet;
import java.util.LinkedHashMap;



public class Long_substr_norepeat {
	public static void main(String a[]){
	String str="koothanchinnadurai";
	String lon="";
	String lonover="";
	HashSet<Character> st=new HashSet<Character>();
	
	for(int i=0;i<str.length();i++){
		if(st.contains(str.charAt(i))){
			lon="";
			st.clear();
		}
		lon+=str.charAt(i);
		st.add(str.charAt(i));
		if(lon.length()>lonover.length()){
			lonover=lon;
			//System.out.println(lonover+" xxx");
		}
		
	}
	System.out.println(lonover);
}    }    


