package exception;

import java.io.IOException;

public class exception {
	public static void main(String a[]) throws RuntimeException  {
		int age=16;
		try{
			if(age<18)
		throw new RuntimeException("not Valid");
			else 
				System.out.println("welcome");
		
	}
	
	
	catch(RuntimeException e){
		System.err.println(e);
	}

}
}