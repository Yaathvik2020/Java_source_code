package FILE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class JavaDemoExecution {
	public static void main(String a[]) {
		String str="Yaathvik chinna sabitha";
		String temp="";
		String rev="";
		 for(int i=0;i<str.length();i++) {
			
			 if(str.charAt(i)==' '|| i==str.length()-1) {
                System.out.println(i +""+rev.length());
				 if(i==str.length()-1)
					 i=i+1;
				 for(int j=i-1;j>=rev.length();j--) {
					 System.out.println(str.charAt(j));
					temp+=str.charAt(j); 
				 }
				 rev+=temp+" ";
				 temp="";
				 System.out.println(rev);
			 }
			 
		 }
		
				 rev+=" ";
		 
		 System.out.println(rev);
	}
}
