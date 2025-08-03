package FILE;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class demo_test {
	static String[]st=new String [40];
static int count=0;
	public static void main(String args[]) {
	    permuteString("", "ABC");
	    TreeSet<String> r=new TreeSet<String>();
	    for(int i=0;i<count;i++){
	    	r.add(st[i]);
	    }
	   System.out.println(r);
	  }

	  public static void permuteString(String beginningString, String endingString) {// 

		  if (endingString.length() <= 1)
	    {  
			  st[count++]=(beginningString + endingString);
			  //System.out.println(count);
	    //System.out.println(beginningString + endingString);
	    	
	    }
		  
	    
	    else{
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);//a,
//System.out.println(endingString.length());

//System.out.println(beginningString + endingString.charAt(i)+"," +newString); //
	          permuteString(beginningString + endingString.charAt(i), newString);
	          //F(3)0-->p(a,bc),F(2)0-->P(ab,c)+"abc"+F(2)1-->P(ac,b)+"acb"
	          //F(3)1-->p(b,ac),F(2)0-->p(ba,c)+"bac"+F(2)1-->p(bc,a)+"bca"
	          //F(3)2-->p(c,ab),F(2)0-->P(ca,b)+"cab"+F(2)1-->p(cb,a)+"cba"
	          
	          
	        }
	        
	        catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	      
	    }
	  }
	}
