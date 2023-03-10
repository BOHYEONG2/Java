package kr.ac.kopo.day04;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 :");
		int radius = sc.nextInt();
	
		double area = radius * radius * 3.141592;
		
		double around = radius * 2 * 3.141592;
		
		System.out.printf("원 넓이 : %.4f, 원 둘레 : %.4f\n", area, around);
	
	}	
}