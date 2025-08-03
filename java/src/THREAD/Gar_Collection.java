package THREAD;

public class Gar_Collection {
	public void finalize()
	{
		System.out.println("ger_collect by finializr");
	}
	public static void main(String arg[])
	{
		Gar_Collection g=new Gar_Collection();
		g=null;
		System.gc();
	}

}
