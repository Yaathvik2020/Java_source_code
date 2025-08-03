package THREAD;

class table{
	public static void coun(int table){
		for(int i=0;i<5;i++){
			System.out.println(table*i);}
		
		try{
			Thread.sleep(500);
			
		}
		catch(Exception e)
		{}
		}
		}

class mut1 extends Thread{
	table ta;
	mut1(table ta){
		this.ta=ta;
	}
	public void run(){
		
		table.coun(1);
		
	}
}
class mut2 extends Thread{
	table ta;
	mut2(table ta){
	this.ta=ta;}
	public void run(){
		
		table.coun(10);
		
	}
}
public class sysn_moth {
	public static void  main(String arg[]){
		table ob=new table();
		mut1 t1=new mut1(ob);
		mut2 t2=new mut2(ob);
		t1.start();
		t2.start();
	}

}
