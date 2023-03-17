package kr.ac.kopo.day05;

public class LoopTest04 {

	public static void main(String[] args) {
		
/*		int i,j;   
		for(i = 1; i <= 5; i++ ) {
			for(j = 1; j <=5  ; j++) {
			System.out.print("*");
			} System.out.println();
*/  					
/*
*****
*****
*****
*****
*****			
 */

/*		int i,j; 
		for(i = 1; i <=5; i++) {
			for(j =1; j <=5; j++) {
				System.out.print(i);
			} System.out.println();			
		}
*/
/*
11111
22222
33333
44444
55555
*/
/*		int i,j;
		for(i=1; i <=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(j);
			} System.out.println();
		}
*/
/*
12345
12345
12345
12345
12345 		
 */
/*		int i,j;
		for(i=0; i<=4; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(j+i);
			} System.out.println();
		}
*/	
/*
12345
23456
34567
45678
56789		
 */		
 /*		int i,j;
		for(i=1; i<=5; i++) {
			for(j=i; j<=i+4; j++) {
				System.out.print(j);
			} System.out.println();
		}
*/		
/*		int i,j;
		for(i=0; i<=4; i++) {
			for(j=5; j<=9; j++) {
				System.out.print(j-i);
			} System.out.println();
		}
*/	
/*
56789
45678
34567
23456
12345
 */
/*	int i,j;
		for(i=1; i<=5; i++) {
			for(j=i; j<=i+4; j++) {
				System.out.print(j);
			} System.out.println();
*/		
/*		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();	
			}
*/
/*
*
**
***
****
*****
 */
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.print("*");
			} System.out.println();
		}			
/*
*****
****
***
**
*		
 */
	}
}
