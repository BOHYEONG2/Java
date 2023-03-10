package kr.ac.kopo.day04;

import java.util.Scanner;

public class HomeworkMain05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 입력 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책없다");
		} else if (book == 1) {
			System.out.println(book + "book"); 
		} else if (book > 1) {
			System.out.println(book + "books");
		} else {
			System.out.println("잘못입력했습니다.");
			
		}
	}

}
