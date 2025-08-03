package ALL_JAVA;

public class find_total_armstrong {
	
	//rverse string using recusion
	public static String rev(String str){
		String rev="";
		if(str.length()==1){
			return str;
		}else
		 rev+=str.charAt(str.length()-1)+rev(str.substring(0,str.length()-1));
		 // a+rev(chinn),a+n+rev(chin),a+n+n+rev(chi),a+n+n+i+rev(ch),a+n+n+i+rev(ch),
		 //a+n+n+i+h+rev(c)
		 //annihc--final
		 return rev;
	}
	public static void main(String[] args) {
		System.out.println("Recruim rev: "+rev("chinna"));
		
		int n=0;
		int num=0;
		for(int k=1;k<500;k++){
			n=k;
		
		while(n>0){
			 int d=n%10;
			 int temp=1;
			  for(int i=0;i<3;i++){
				  temp=temp*d;
			  }
			 
			   num+=temp;//9
			    n=n/10;
		}
		if(k==num){
		System.out.print(k+" ");
		}
	   num=0;
	
		}
	}
}

