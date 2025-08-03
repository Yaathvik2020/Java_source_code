package java_demo;

public class bubblesort {
	public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = 0; m < n; m++) {//80,81,82,83,84,85,86,87,88
        	   	
            for (int i = 0; i < n - 1; i++) {
            	
                k = i+1 ;
               // System.out.println(m+","+k);
                if (array[i] < array[k]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
          
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
       // printNumbers(array);
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        //System.out.println("\n");
    }
 
    public static void main(String[] args) {
        int[] input = { 4, 2, 9,4, 6, 23, 5,12, 34, 0, 1 };
        bubble_srt(input);
    	// Descending order the element
    		int [] ad={2,9,6,6,8,3,4,5,8,4,3,1};
    		 
    		 for(int j=0;j<ad.length;j++) 
    		 {			
    		 for(int i=0;i<ad.length-1;i++) {
    			int k=i+1;
    			 
    			if(ad[i]<ad[k]) {
    				int temp;
    				temp=ad[i];
    				ad[i]=ad[k];
    				ad[k]=temp;
    				
    			}
    		 }
    		}
    		 int k=0;
    		 for(int i=0;i<ad.length-1;i++) {
    			 if(ad[i]!=ad[i+1]) {
    				ad[k++] =ad[i];
    			 }	 
    		 }
    		 ad[k++]=ad[ad.length-1];
    		 //2,9,6,3,4,5,8,4,3,1
    		 for(int i=0;i<k;i++) {
    			 System.out.print(ad[i]);
    		 }
    	} 
    }
