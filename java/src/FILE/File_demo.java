package FILE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class File_demo {
	public static void main(String a[]) throws IOException{
	File  f=new File("E:\\SELIUM_WITH_JAVA\\Chinna_WorkSpace\\workspace\\java\\Common\\in.txt");
	File fo=new File("E:\\SELIUM_WITH_JAVA\\Chinna_WorkSpace\\workspace\\java\\Common\\in2.txt");
	File f3=new File("E:\\SELIUM_WITH_JAVA\\Chinna_WorkSpace\\workspace\\java\\Common\\in3.txt");
	/********************************************************************************************/
	FileInputStream fin=new FileInputStream(f);
	FileInputStream fi=new FileInputStream(fo);
	
	FileOutputStream fou=new FileOutputStream(fo);
	FileOutputStream fou3=new FileOutputStream(f3);
	FileOutputStream fou1=new FileOutputStream(f);
	/*---------------------------------------------------*/
	//BufferedInputStream bf=new BufferedInputStream(fin);  //When a BufferedInputStream is created, an internal buffer array is created.
	//BufferedOutputStream bfo=new BufferedOutputStream(fou); //It internally uses buffer to store data	
	/*---------------------------------------------------*/
	SequenceInputStream si=new SequenceInputStream(fin,fi); // not available outputstream . read the stream from multiple  data.
	/*------------------------------------------------------*/
	byte[] byf = { 35, 36, 37, 38 }; 
	ByteArrayInputStream bin=new ByteArrayInputStream(byf);  //which is used to read byte array as stream. 
	//In this stream, the data is read from a byte array.
	  int k = 0;  
	    while ((k = bin.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }  
	    /*------------------------------------------------------*/
	ByteArrayOutputStream bout=new ByteArrayOutputStream(); 
	bout.write(97);//Java ByteArrayOutputStream class is used to write common data into multiple files
	bout.writeTo(fou);
	/*------------------------------------------------------------*/
	DataOutputStream data = new DataOutputStream(fou); //write primitive Java data types to the output stream 
    data.writeInt(65); 
    data.writeChar('c');
    
	/*-------------------------------------------------------------*/
	int c=0;
	while((c=si.read())!=-1) { //It read the next byte of data from the input stream.
		System.out.print((char)c);
		fou3.write(c);
		fou3.flush();
		//System.out.print(" success");
	}
	/********************************************************************************************/
	
}
}
