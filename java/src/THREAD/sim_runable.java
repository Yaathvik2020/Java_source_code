package THREAD;

public class sim_runable {
	public static void main(String arg[]){
		Runnable r1=new Runnable(){

			public void run() {
				
					for(int i=0;i<=5;i++){
						try{
							Thread.sleep(500);
							System.out.println(i);
						}
catch(Exception e){}
						
					}


				
				
								
			}
			
		};
		Runnable r2=new Runnable(){

			public void run() {
				
				for(int i=5;i>0;i--){
					try{
						Thread.sleep(5000);
						System.out.println(i);
					}
catch(Exception e){}
				}
				
			}
			
		};
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();
	}

}
