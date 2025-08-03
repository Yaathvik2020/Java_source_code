package ALL_JAVA;

public class eachthirddigits {
	public static void main(String a[]){
		String no="123456789";// 234 567 891
		//char[]aa=no.charAt(0);
		a=no.split("");
		int count=0;
		System.out.println("Each "+a.length);
		 for(int i=0;i<a.length;i++){
			count++;
			//System.out.println("Each Third: "+a[i]);
			if(count==3){
				System.out.println("Each Third: "+a[i]);
				count=0;
			}
		 }
		 
	}

}
