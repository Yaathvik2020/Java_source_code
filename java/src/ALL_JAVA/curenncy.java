package ALL_JAVA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class curenncy {
public static void main(String a[]) {
	String st="rs123,45,6.7 8";	
	//st=st.replaceAll("[rs$,]", "");
	st=st.replaceAll("rs", "").replace(",", "").replaceAll("\\s+", "");
	System.out.println(st.replaceAll("\\s+", "")+" chinna");
	double n=Double.parseDouble(st);
	System.out.println(n);
	//--------------------------------------------
	String s = "$123,456.7   7.8dd";
	//s=s.replaceAll("\\s+","");
	int ct=0;
	  String v="";
	  for ( int i = 0; i < s.length(); i++ ) {
		  char c=s.charAt(i);
		  if(c=='.') {
				ct++;}
			
			
			if(Character.isDigit(c)||ct==1){
					//int ny=Integer.valueOf(c);			
				//t.append(c);
				v+=c;
//				if(count==1){
//					count++;
//				}
			}
		
	  }
	  System.out.println(v+" digit method");
	  	  //--------------------------------------------
	  //----------------------------------------------------------
	  String x="19.823.56 7,10 kr";
      x=x.replace(".","");
      x=x.replaceAll("\\s+","");
      x=x.replace(",", ".");
      x=x.replaceAll("[^0-9 , .]", "");
      System.out.println(x);
}
}
