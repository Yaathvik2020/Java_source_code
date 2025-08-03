package THREAD;

class demo1{
  synchronized static void printNo(int number)
	{
		for(int i=1;i<10;i++){
			System.out.println(number*i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				
			}
			
		}
	}
}

public class Static_synchronized {
	public static void main(String arg[]){
		//final demo1 d=new demo1(); //synchronied method
		Thread t1=new Thread(){
			public void run(){
				
	       //d.printNo(10);
				demo1.printNo(1);
				//System.out.println(Thread.currentThread().getName()+" Start:");
				
			}
		};
		Thread t2=new Thread(){
			public void run(){
				
				demo1.printNo(10);
				//System.out.println(Thread.currentThread().getName()+" Start:");
			}
		};
		Thread t3=new Thread(){
			public void run(){
				
				demo1.printNo(100);
				//System.out.println(Thread.currentThread().getName()+" Start:");
			}
		};
		Thread t4=new Thread(){
			public void run(){
				
				demo1.printNo(1000);
				//System.out.println(Thread.currentThread().getName()+" Start:");
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
