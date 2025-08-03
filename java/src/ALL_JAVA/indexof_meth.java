package ALL_JAVA;

public class indexof_meth {
	public static void countLetters(String string, char character) {
        int count = 0;
        int index = 0;
        while(true) {
            index = string.indexOf(character,index)+1 ; // +1 is to continue search 
            
           // System.out.println(index+" ");
           // System.out.println(index);
            if (index == 0)                               //from next character after match
                break;
            count++;
        }
        System.out.println("The character of "+character+" count is: "+count);
    }

	
public static void main(String a[]){
countLetters("ianhagaida",'a');
String na="rs100.73";
//String nam="chinnadrhg";
//System.out.println(nam.indexOf(nam.charAt(1),0));

System.out.println();
na=na.substring(na.indexOf('s')+1,na.length());
System.out.println(na+" chcinn");
}
//countLetters("chinna",'i')

}