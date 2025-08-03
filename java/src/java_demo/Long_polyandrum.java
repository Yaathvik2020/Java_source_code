package java_demo;

public class Long_polyandrum {
	public static String getLongestPalindrome( String in) {
		 String ln="";
		 for(int i=0;i<in.length();i++){
			String n=interPalindrome(in,i,i);//
			 if(n.length()>ln.length()){
				 ln=n;
				 //System.out.println(ln+"chinna"+i);
			 }

			
			   n=interPalindrome(in,i,i+1);//12
			 if(n.length()>ln.length()){
				 ln=n;//
				 //System.out.println(ln+"chinna");
			}
		 }
		 return ln;//
	}
	public static String interPalindrome(String in, int l,int r) {// 1,2// 4545445
		 while (l>=0&& r<in.length()&&in.charAt(l)==in.charAt(r)){
			  
			  l--;//0
			  r++;//3
		 }
		//System.out.print(in.substring(l+1,r)+" ");
		 return in.substring(l+1,r);
	}
   public static void main(String ... args) {
       String str = "121212556777789945333";//00,11,22,33,3,5,2,6,1,7,0,8,-1,9
       System.out.println(str.substring(0, 8));
       String longestPali = getLongestPalindrome(str);
       System.out.println("String: " + str);
       System.out.println("Longest Palindrome: " + longestPali);
   }

}
