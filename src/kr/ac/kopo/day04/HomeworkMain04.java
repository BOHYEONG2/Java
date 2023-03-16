package kr.ac.kopo.day04;

import java.util.Scanner;

public class HomeworkMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번 째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번 째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번 째 정수 : ");
		int num3 = sc.nextInt();
		System.out.print("네번 째 정수 : ");
		int num4 = sc.nextInt();
		
/*		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("가장 큰 수는 " + num1);
		} else if(num2 > num3 && num2> num4 && num2 > num1) {
			System.out.println("가장 큰 수는 " + num2);
			
		} else if(num3 > num1 && num3> num2 && num3 > num4) {
			System.out.println("가장 큰 수는 " + num3);
		} else {
			System.out.println("가장 큰 수는 " + num4);
		}
	}

}

		int max01 = num1 > num2  ? num1 : num2;
		int max02 = num3;
		if(num3 < num4) {
			max02 = num4;
		}
		
		System.out.println("가장 큰수 :" + (max01 > max02 ? max01 : max02 ));
		}
}
*/
		int max = num1 > num2 ? num1 : num2;
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		System.out.println("가장 큰수 : " + max);
		}
}