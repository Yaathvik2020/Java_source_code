package ALL_JAVA;

public class sum_of_pairs {
	//for loop set
	private static void  sum(int[] number,int n){
	//for loop pair
//		for(int i=0;i<number.length-1;i++){
//			for(int j=i+1;j<number.length;j++){
//				if(number[i]+number[j]==n){
//					System.out.println("Pairs of equal Value: "+number[i]+"+"+number[j]+"=="+n);
//				}
//			}
//		}
		//while loop pair
		System.out.println("While Looop Pair");
		int i=0;
		int j=number.length-1;
		 while(i<j){
			
			 if(number[i]+number[j]==n){
				 System.out.println("pair sum of"+number[i]+number[j]+"value: "+number[i]+"+"+number[j]+"=="+n);
			 i++;//2
			 j--;//2
			 }
			 else if(number[i]+number[j]<n){
				 i++;//1
				 j--;
			 }
			 else if(number[i]+number[j]>n){
				 i++;//1
				 j--;//3
			 }
			 
		 }
		
		
	}
	public static void main(String a[]){
		sum(new int[]{5,6,8,7},11);
		//sum(new int[]{7,13,4,8,12},20);
	}

}
