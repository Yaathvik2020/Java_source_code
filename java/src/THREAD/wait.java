package THREAD;

 class demo {
	int amount=0;
	int flag=0;
	 public synchronized int withdraw(int amount){
		 System.out.println(Thread.currentThread().getName()+" withdrw");
		 
		// if(flag==0){
			 try{
		 
				 System.out.println("wait");
			 wait();
			 
		 }
		 catch(Exception e){
			 
		 }
		// }
	 
		 
		 this.amount-=amount;
		
		 System.out.println("withdraw completed "+amount);
		 return amount;
	 }
	public synchronized void deposite(int amount){
		System.out.println(Thread.currentThread().getName()+" deposit");
		notifyAll();
		this.amount+=amount;
		//System.out.println("deposite complet:"+amount);
		flag=1;
	}
}
	public class wait{
	public static void main(String arg[]){
		final demo w=new demo();
		Thread t1=new Thread(){
			public void run(){
				w.withdraw(100);
				
				
				System.out.println("afte with"+w.amount);
			}
			
		};
		Thread t2=new Thread(){
			public void run(){
				w.deposite(1000);
				
				System.out.println("after deposite"+w.amount);
			}
			
		};
		t1.start();
		t2.start();
	}

}
