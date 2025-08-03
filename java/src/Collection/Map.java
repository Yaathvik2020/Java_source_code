package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {
	
		    static void duplicateWords(String in)
		    {
		    	in=in.replaceAll("\\s+", "");
		    	System.out.println(in);
		        char[]c=in.toCharArray();
		 HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		        
		 for(char cc:c){
			 if(h.containsKey(cc)){
				h.put(cc, h.get(cc)+1); 
			 }
			 else{
				 h.put(cc, 1);
			 }
			 
		 }
		 Set<Character> s=h.keySet();
		 for(char v:s){
			 if(h.get(v)==2){
				System.out.println(v +":"+h.get(v));
			 }
			 
		 }
		 //System.out.println(h);
		 
		 
		    }
		 
		    public static void main(String[] args)
		    {
		        duplicateWords("Breeeead come eee");
		 
		        duplicateWords("Java");
		 
		        duplicateWords("Super sdf rr ghh");
		    }
				
	}


