package kr.ac.kopo.day04;


import java.util.Scanner;

/*
	1 ~ 3 사이의 정수를 입력받는 코드
	1일때 one 2일때two 3일때 three
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3사이의 정수 : ");
		int no = sc.nextInt();
	
		switch(no) {						// case 뒤에 들어올 수 있는건 문자 정수 실수만 가능    (논리값 불리언 안됨)
		case 1 :
			System.out.println("ONE");			//case는 책갈피 처럼 2를 찾으면 2부터 뒤에를 다 찾아서 입력함 
											//2입력하면 23디폴트  1입력하면 123디폴트  3입력>3디폴트 
												//그걸 제어해주는게 break;
		case 2 :
			System.out.println("TWO");
		case 3 :
			System.out.println("THREE");
			break;
		default : 							// default => else의 역할과 동일하다  + 디폴트 위치는 맨 밑에 써주는게 좋지만 case 1이랑 2 사이에 써도 결과는 똑같이 나온다.
			System.out.println("ERROR");
		}
	}	
}
		
		
/*		if(no == 1) {
			System.out.println("ONE");
		} else if(no == 2) {
			System.out.println("TWO");
		} else if(no == 3) {
			System.out.println("THREE");
		} else
			System.out.println("ERROR");

	if(no ==1 ) {							// 이 방법을 안쓰고 else if를 쓰는 이유는  else if는 참이 나오면 뒤에건 물어보지 않는데
		System.out.println("ONE");			// if 문은 독립적이기 떄문에 참이 나와서 결과를 출력해도 밑에 지문도 다 물어보게 된다.
	}
	if(no ==2 ) {
		System.out.println("TWO");
		}
	}
}
*/

