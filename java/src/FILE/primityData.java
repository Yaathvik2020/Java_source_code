package FILE;

import java.text.NumberFormat;
import java.text.ParseException;

public class primityData {

	 byte n= -128;//  -127 to 128 it will accept  8- bit;
	 short s=32767;  //-32768 to 322767 it will accept 16 -bit;
	 int i= 3333;//32 bit;
	 float f=456.67f; //32 bit
	 long ln=55555555; //64 bit
	 double d= 67.89; //64 bit
	 char no= 0233; // 16 bit /0 to 2 pow 16 -1
	 char c='3';
	 boolean bo= true; // 1 bit
	 
	 public static  void main(String[] a) throws ParseException {
		// System.out.println(Math.pow(2, 31));
		 char c='3';
		 System.out.println(String.valueOf(c));
		int no= Integer.valueOf(String.valueOf(c));
		//System.out.println(no+no);
		 NumberFormat f=NumberFormat.getNumberInstance();		 
		 Number n=f.parse(String.valueOf(c));
		 //n+=n;
		 //c+=c;;
		 int nos=Integer.valueOf(n.toString());
		 System.out.println(nos);
	 }
	 
	 //int no= -
}
