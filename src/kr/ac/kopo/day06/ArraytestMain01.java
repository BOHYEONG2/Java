package kr.ac.kopo.day06;

import java.util.Scanner;

public class ArraytestMain01 {

	public static void main(String[] args) {
		
		
// 1~3번문제	

		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		for(int i = 1; i < 100; i += 2) {
			System.out.print(i + " ");
		}

		for(int i = 100; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}

	
//4번 달팽이가 100m 올라가는데 걸리는 시간구하기  1시간에 5m 가는데 50m 미만엔 1m씩 떨어지고 50m 이상에선 2m씩 떨어진다
		
		int snail = 0;
		int meter = 0;
		
		for(snail = 0; snail <= 100; snail += 5) {
			System.out.println( + meter +"시간후" + " " + "달팽이가 올라간 높이 : " + snail + "m"); 
			 if(snail < 50) {
				snail -= 1; 
			}else { 
				snail -= 2;
			}	  
			 	meter++;
		}
	
//5번 구구단 단 출력받아서 나타내기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2-9사이의 단을 입력 :");
		int n = sc.nextInt();
		
		System.out.println("***" + n +"단"+ "***");
		for(int i = 1 ; i < 10; i++) {
			 System.out.println(n + "*" + i + "=" + (n*i));
		}

		
//6번문제	 구구단 2단부터 9단까지	

		for(int i =2; i <= 9; i++) {
			System.out.println("***" + i + "단" + "***");
		for(int j = 1; j <= 9; j++) { 
			System.out.println(i + "*" + j + "=" + (i*j) );
			}
		}

	
//7번문제 시작단과 종료단을 입력받아 구구단
		
	//	Scanner sc = new Scanner(System.in);

		System.out.println("시작단을 입력 : ");
		int a = sc.nextInt();
		System.out.println("종료단을 입력 : ");
		int b = sc.nextInt();
	
		int start = 0;
		int end = 0;
		
		if(a <= b) {
			start = a;
			end = b;
		} else {
			start = b;
			end = a;
		}
		
		for (int i = start; i <= end; i++) {
			System.out.println("***" + i + "단" + "***");
		
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + " = " + (i * j));
		
			}
			System.out.println();
		}


	
//8번문제 구구단 가로로 3개단 후 그 밑으로 나오게
		
		for (int i = 2; i <= 9; i=i+3) {
			for (int j = 1; j <= 9; j++) {			// 구구단 하는데 i+3으로 2단 5단 8단 나오게 출력
				for (int k = i; k < i+3; k++) {		// 옆으로 2개 단이 더 나와야 하니 i + 2개더 나와야하니 i < i+3  하나씩증가 
					if(k < 10) {
						System.out.print(k + "*" + j + "=" + (k * j));
						System.out.print("\t");	
				}
			} 
				System.out.println();
			}
		}
	}
}
	
	
	
	
	