package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Array_list {
	
	public static void main(String arg[]){
	LinkedList a=new LinkedList();
		
		a.add("chinna");
		a.add("sabitha");
		a.add(2,"chinnra");
		a.add(1,10);
		a.add(4,140);
		Iterator it=a.iterator();
//		while(it.hasNext()){
		System.out.println(a.get(3));
//		}
	
		for(Object ob:a){
			//System.out.println(ob);
		}
	}

}
