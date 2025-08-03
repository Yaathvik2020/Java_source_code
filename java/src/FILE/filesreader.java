package FILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class filesreader {

	public static void main(String a[]) throws IOException {
		File  f=new File("E:\\SELIUM_WITH_JAVA\\Chinna_WorkSpace\\workspace\\java\\Common\\in.txt");
		File  f2=new File("E:\\SELIUM_WITH_JAVA\\Chinna_WorkSpace\\workspace\\java\\Common\\in2.txt");
		
		FileReader fr=new FileReader(f);
		FileWriter fw=new FileWriter(f2,true);
		 BufferedReader fo = new BufferedReader(fr);
		 BufferedWriter bw=new BufferedWriter(fw);
		 char c=0;

		 String na="";
		 while((na=fo.readLine())!=null) {
			 bw.append(' ');
			 bw.write(na);		 
			 bw.flush();
			 
		 }
	}
	 
}
