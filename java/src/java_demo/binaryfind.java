package java_demo;

public class binaryfind {
	public int getDecimal(int binary){
		int decimal=0;
		int power =0;
		while(binary>0){
						
		 int temp=binary%10;//0,1,1,0
	    decimal+=temp*Math.pow(2, power);
		 binary=binary/10;//1
		power++;	
			
		}
		return decimal;
	}

	public static void main(String a[]){
		binaryfind b=new binaryfind();
		System.out.println(b.getDecimal(0110));
	
		
String ba="101";
		
		int dc=Integer.parseInt(ba,8);
		
		System.out.println(dc+" ****");
	
	}

}
