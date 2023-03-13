package kr.ac.kopo.day05;

public class LoopTest02 {

	public static void main(String[] args) {
	
		int i,j;
		for(i=1; i<=5; i++) {
			
			for( j =1; j<= 5; j++) {
				if(j < i) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			} System.out.println();
		
		
		
		
/*		int i,j;
		for(i= 1; i <=5;i++) {
			
			for(j =1; j <=i-1; j++) {
				System.out.print("-");
			}
			for(j=1; j<=6-i; j++) {
			System.out.print("*");
		} System.out.println();
*/		
		
/*		int i,j,k;
		for(i=0; i<=4; i++) {
			for(j=0; j >=i-1; j++) {
				System.out.print("");
			}
		 for(k=0; k >=4; k++) {
			System.out.print(" ");
		 }	System.out.println();
		}
*/		
		
/*		int i,j,k;
		for(i =0; i <=4; i++) {
			for(j=i; j<4; j++) {
				System.out.print(" ");
			} 
			for(k=5; k >=5-i; k--) {
				System.out.print("*");
			} System.out.println();	
			}
*/		
	}
	}
}