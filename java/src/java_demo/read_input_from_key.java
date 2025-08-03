package java_demo;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class read_input_from_key {
	public  static void main(String a[]) throws IOException{
		//I/pSteam +BufferReader
				InputStreamReader st=new InputStreamReader(System.in);
				BufferedReader b=new BufferedReader(st);
				String s="";
				while(!s.equals("stop")) {
				 System.out.println("enter1");
				  s=b.readLine();
				}
				 System.out.println("NO1");
				  int i= Integer.parseInt(b.readLine());
				  
				  //Scanner
				  Scanner  sc=new Scanner(System.in);
				  System.out.println("enter2");
					 String ss=sc.nextLine();
					 System.out.println("NO2");
					 sc.nextInt();
					 //int ii=Integer.parseInt(sc.nextLine());
			 //console fff
		Console c=System.console();   
		System.out.println("Enter Value: ");  
		String bv=c.readLine();
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);    
		 
	}

}
