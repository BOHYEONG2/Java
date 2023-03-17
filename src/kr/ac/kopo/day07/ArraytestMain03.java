package kr.ac.kopo.day07;

import java.util.Scanner;

public class ArraytestMain03 {

	public static void main(String[] args) {

		System.out.println("0-99사이의 정수를 5개 입력받아 다음과 같이 출력");

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
/*
		for(int i = 0; i < arr.length; i++) {	   // arr[i]가 0 < 99 사이가 아닐때는 다시 입력받아야 하니 for문의 증감문을 안쓰고
			System.out.printf("num %d : ", i+1);
			arr[i] = sc.nextInt();
			if(arr[i] >= 0 && arr[i] <= 99) {		// if문 제어로 0 ~ 99 의 숫자가 들어오면 i++ 1씩 증가하게 해주는 표현도 있다.
				i++;
			
//			if(arr[i] < 0 || arr[i] > 99) {			// arr[i]가  0~99 사이가 아니라면 다시 입력받을수 있게 i--; 0~99사이라면 for문의 증감문대로 i++해준다
//				i--;
			}
		}	
		System.out.println("<PRINT>");
		for(int num : arr) {
			System.out.print(num + "\t");	
		}
		System.out.println();
	*/	
	
		
		int i = 0;
		while (i < arr.length) {
			System.out.print("num" + (i + 1) + " : ");
			int j = sc.nextInt();

			if (j >= 0 && j <= 99) {
				arr[i] = j;
				++i;
			}
		}
		System.out.println("<PRINT>");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("<REVERSE>");
		for (i = arr.length - 1; 0 <= i; i--) {
			System.out.print((arr[i] % 10) * 10 + (arr[i] / 10) + "  ");

		}
		
	}
}
