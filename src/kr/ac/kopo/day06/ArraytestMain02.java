package kr.ac.kopo.day06;

import java.util.Scanner;

public class ArraytestMain02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("10개의 정수를 입력받아 다음과 같이 출력하시오");
		
		int [] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("num" + (i+1) + " : ");
			 arr [i] = sc.nextInt();
		} 
		 	System.out.println();
		
		System.out.println(" < 짝수 >");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0 ) {
				System.out.print(arr[i] + " ");
			}
		} 		System.out.println();
		
		System.out.println(" < 홀수 > ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1 ) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
	
