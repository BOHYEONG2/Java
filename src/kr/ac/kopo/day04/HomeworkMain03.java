package kr.ac.kopo.day04;

import java.util.Scanner;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번 째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번 째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번 째 정수 : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			if(num2 > num3) {
			System.out.println(num2 + " " + num3 + " " + num1);
			} else { 
				System.out.println(num3 + "" + num2 + "" + num1);
			}
		} else if(num2 > num1 && num2 > num3) {
				if(num1 > num3) {
			System.out.println(num3 + " " + num1 + " " + num2);
			} else { 
				System.out.println(num1 + "" + num3 + "" + num2);
			}
		}else if(num3 > num1 && num3 > num2) {
						if(num2 > num1) {
					System.out.println(num1 + " " + num2 + " " + num3);
					} else { 
						System.out.println(num2 + "" + num1 + "" + num3);
					}
			}
			
	}

}
