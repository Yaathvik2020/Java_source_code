package java_demo;

public class primid_while {
	public static void main(String[] args){
		int n=5;
		int row=0;
		int space=0;
		int k=0;
		while(n>0) {
			 row=n;
			 space=k;
			 while(row>0) {
				 System.out.print(" ");
				 row--;
			 }
			 while(space>=0) {
				 System.out.print(" *");
				 space--;
			 }
			 k++;
			 
			 System.out.println();
			 n--;
		}

	}
}
