package ALL_JAVA;



class b{
	int no=100;
	
	int foo(){//funtion overriding  passible but we not get the super class function .
		return 75;
	}
	void fo(){
		System.out.print("wel ");
	}
}
public class functin_java extends b {
	int no=250;
	int foo(){
		super.foo();
		//System.out.print("not override function: ");
		return 20;	
	}
	void fo(){//methode
		super.fo();
		System.out.print("chinna");
	}
		//all functionality can br drived in the sub class. so it will execute only subclass function
	
	public static void main(String a[]) {
		b v=new functin_java();
		//b n=new b();
		//v.fo();
		System.out.println("\n");
		System.out.println(v.foo()+"perent");
		System.out.println(v.no+" not overide variable");//veriable not override
		System.out.println(v.foo());
		
	}
}
