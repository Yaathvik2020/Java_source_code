package Collection;

import java.util.HashSet;

public class duplicat_usingHashSET {
	

	  
		public static void main(String[] args) 
		{
			String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};

			HashSet<String> set = new HashSet<String>();

			for (String arrayElement : strArray)
			{
				//System.out.println(arrayElement);
				if(set.add(arrayElement))
				{
					System.out.println("Duplicate Element is : "+arrayElement);
				}
			}
			String sd="chinnaohndddhsestyss";
			char s[]=sd.toCharArray();
			HashSet<Character> h=new HashSet<Character>();
			for(char c:s){
				if(!h.add(c)){
					System.out.println(c);
				}
			}
			
		}	
	}

