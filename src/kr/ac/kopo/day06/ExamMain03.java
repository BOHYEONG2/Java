package kr.ac.kopo.day06;

public class ExamMain03 {

	public static void main(String[] args) {
		
/*		int star = 1;
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				if(  j <= star || j >= 10-star) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			} 
		if( i < 5 ) {
			star++;
		}else {
			star--;
		}
			System.out.println();
		}
	}	
}*/
/* 17번문제
 
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
 */
/*		int star = 4;
		
			for(int i = 1; i <= 9; i++) {	
				for(int j = 1; j <= 9; j++) {
					if(  j <= star || j >= 10-star) {
						System.out.print(' ');
					} else {
						System.out.print('*');
					
					  }
			
				} System.out.println();
			if( i < 5) {
				star--;
			} else	{
				star++;
			}
		}		
	}
}*/
/* 다이아몬드
    *    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *    
 
 */	
/*		int space = 0;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= space; j++) {
				System.out.print(' ');
			}
			
			for(int j = 1; j <= 9-(space*2); j++) { 
				System.out.print('*');
			}
			
			System.out.println();
			
			if( i < 5) {
				space++;
				
			} else {
				space--;
				
			}

		}
	}
}
*/
/* 16번문제
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/
/*		for(int i = 1; i <= 5; i++) {
			
			for(int j =1; j <= 5-i; j++) {
				
				System.out.print(' ');
			} 
			for(int j = 1; j <= ( i*2)-1; j++) {
				System.out.print('*');
				
				
		}System.out.println();

	} 
	}
}

    *
   ***
  *****
 *******
*********

 */
/*		int space = 0;
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= space; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= 9-(space*2); j++) {
				System.out.print('*');
			}
				System.out.println();
			
			if( i < 5) {
				space++;
				
			} else {
				space--;
		}
	}
}
}*/
/*
*********
 *******
  *****
   ***
    *

 */

	}
}
		