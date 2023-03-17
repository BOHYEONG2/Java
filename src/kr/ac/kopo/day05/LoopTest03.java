package kr.ac.kopo.day05;

public class LoopTest03 {

	public static void main(String[] args) {
		
//10번문제		
		int i,j,k;
		for(i=1; i<=9; i++) {
			if (i <= 5) {
				for(j=1; j<=i; j++) 
					System.out.print("*");
				}else {
					for(k=4; k>=i-5; k--) 
						System.out.print("*");
				} System.out.println();
		} 

/*
*
**
***
****
*****
****
***
**
*
*/		
/*11번	int i,j,k;
		for(i=1; i<=9; i++) {
			if ( i <= 5) {
				for(j = 5; j >= i; j--) 
					System.out.print("*");
				} else {
					for(k = 1; k <= i-4; k++)
						System.out.print("*");
				}
			System.out.println();			
			}
*/			
/*
*****
****
***
**
*
**
***
****
*****			
 */
		
/* 12번		int i,j,k;
		for(i=1; i<=9; i++) {
			
			if(i <=5) {
				for(j=1	; j<=i-1; j++) {
					System.out.print(" ");
				} 
				for(k = 5; k >= i; k--) {
					System.out.print("*");
				}
			} else { 
				for(j=4; j >= i - 4; j--) {
					System.out.print(" ");
				} 
				for(k=1; k<=i-4; k++) {
					System.out.print("*");					
				}			
			} 
			System.out.println();
		}
*/

/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****	 
 */
// 13번문제		
/*		int i,j,k;	
		for(i=1; i<=9; i++) {
			
			if( i<=5) {
				for(j=4; j >=i; j--) {
					System.out.print(" ");
				}
				for(k=1; k <= i; k++) {
					System.out.print("*");
				}
			} else {
				for(j=1; j <= i-5; j++) {
					System.out.print(" ");
				}
				for(k=4; k >= i-5; k-- ) {
					System.out.print("*");
				}
			} 
			System.out.println();
		}*/
/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */
	}
}