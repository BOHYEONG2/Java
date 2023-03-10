package kr.ac.kopo.day04;

import java.util.Scanner; 			// import 패키지는 내가 입력받고 싶은 프로그램을 연결해줌

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // scanner는 java.utill 패키지에 들어감 
												// Scanner 패키지는 자바에서 제공하지 않아 따로 입력해준다
		System.out.print("문자열을 입력 : ");
		char ch = sc.nextLine().charAt(0);		// 문자를 입력받는 키워드는 없어서 라인쓰고 뒤에 .charAt를쓴다
		System.out.println("ch : " + ch);		
		
//		String str = sc.next();			//sc.next();  << 문자열을 입력 받으라는 키워드
		String str = sc.nextLine();		//nextLine(); << 문자열
		
		System.out.println("이름 :" + str);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("나이 : " + num);
		
		System.out.print("실수를 입력 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("num2 :" + num2);
		
	}
}
