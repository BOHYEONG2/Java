package kr.ac.kopo.day07;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
/*		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for(int i  = 0; i < score.length; i++) {
			System.out.printf("%d\'s score : ", i+1);
			score[i] = sc.nextInt();
		}
	
		int errCnt = 0;
		int sum = 0;
		
		System.out.println("NO\tSCORE\tGRADE");
		for(int i = 0; i < score.length; i++) {
			
			if(score[i] >= 0 && score[i] <= 100) {
				sum = sum + score[i];
				
				char grade;
				switch(score[i] / 10) {
				case 10 :
				case 9 :
					grade = 'A'; break;
				case 8 :
					grade = 'B'; break;
				case 7 :
					grade = 'C'; break;
				case 6 :
					grade = 'D'; break;
				default :
					grade = 'F';
				}
				
				
				System.out.println(i+1 + "\t" + score[i]  + "\t" + grade);
			} else {
				System.out.println(i+1 + "\tERROR!!!");
				++errCnt;
				
			}
		}
		
		System.out.printf("5회 입력 중 [%d]회 에러발생!!", errCnt);
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + ((double)sum /score.length) + "점");
	}
}
	*/

		Scanner sc = new Scanner(System.in);
		

		int ar[] = new int[5];
		for(int i = 0; i < ar.length; i++) {
			System.out.print((i+1) + "'s 성적 :");
			ar[i] = sc.nextInt();
		}
		
		int error = 0;
		int total = 0;
		
		System.out.println("< PRINT > ");
		System.out.println("번호\t성적\t학점");
		
		for(int i = 0; i < ar.length; i++) {
			
			if( ar[i] >= 90 &&  ar[i] <= 100) {  
				System.out.println((i+1) + "\t" + ar[i] + "\t" + 'A');
			} else if ( ar[i] >= 80 &&  ar[i] < 90  ) {
				System.out.println((i+1) + "\t" + ar[i] + "\t" + 'B');
			} else if (  ar[i] >= 70 &&  ar[i] < 80) {
				System.out.println((i+1) + "\t" + ar[i] + "\t" + 'C');
			} else if (  ar[i] >= 60 &&  ar[i] < 70 ) {
				System.out.println((i+1) + "\t" + ar[i] + "\t" + 'D');
			} else if (ar[i] < 60 ) {
				System.out.println((i+1) + "\t" + ar[i] + "\t" + 'F');
			} else {
				System.out.println((i+1) + "\t" + "ERROR!!");
				++error;
			}
			total = total + ar[i];
			
		}
		
		System.out.println("\n5명 입력중 [" + error + "]회 에러발생");
		System.out.println("총점 : " +  total + "점");
		System.out.printf("평균 : %.1f점", (double)total / 5);
		
		}
		}
