package kr.ac.kopo.day01;

/*
	출력메소드	System.out.출력메소드()출력메소드의 목적 = 상수값을 화면에 출력시키는게 목적(상수=변하지않는값=대문자소문자정수실수문자열참거짓(논리형))
 	print()		: 개행문자x
 	println()	: 개행문자o    < 개행= 행을연다 (엔터)
 	printf()	: 1.5, 개행문자x
 */
public class PrintMain {

	public static void main(String[] args) {
		
		
		System.out.println('A' + 'B');
		
		System.out.println(10 + " " + 12.34 + " " + "홍길동"); 
		
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		
		
		
		System.out.print('홍');
		System.out.print("A\n");
		System.out.print('A');
		System.out.print('\n');
		System.out.println('A');
		System.out.println(10);
		System.out.println(12.34);
	
	}	
}
