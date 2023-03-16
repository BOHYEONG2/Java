package kr.ac.kopo.day04;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력 :");
		int price = sc.nextInt();
		System.out.print("지불한 돈 입력 :");
		int money = sc.nextInt();
		int change = money - price;
		if( change < 0) {
			System.out.println((price - money) + "원이 부족합니다");
		} else {
			System.out.println("거스름 돈 " + change + "원");
		
	
		int w1000 = (change / 1000);
		change =change % 1000;
		int w500 = (change / 500);
		change = change % 500;
		int w100 = (change / 100);
		change = change % 100;
		int w50 = (change / 50);
		change = change % 50;
		int w10 = (change / 10);
		change = change % 10;
		
		System.out.printf("1000원 : %d개\n 500원 : %d개\n 50원 : %d개\n 10원: %d개\n", w1000 ,w500,w100,w50,w10);
	
		}
	}

}
