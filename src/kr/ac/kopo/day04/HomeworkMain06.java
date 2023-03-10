package kr.ac.kopo.day04;

import java.util.Scanner;

public class HomeworkMain06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		switch(book) {
		case 0:
			System.out.println("보유하고 있는 책 없음");
			break;
		case 1:
			System.out.println("1 book");
			break;
			
		default:
			System.out.println(book > 1 ? book + "books" : "잘못입력했습니다");
		}
	}

}
