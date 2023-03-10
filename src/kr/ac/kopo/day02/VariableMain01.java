package kr.ac.kopo.day02;

public class VariableMain01 {

	public static void main(String[] args) {
		
		char ch; 
		
		ch = 'A';
		
		{
			int a = 10;
			System.out.println("a : " + a);
		}
//		a = 20;l // 문법오류가 발생되는 이유를 알아보자 ( 부괄호마다 사이클이 돌아서)		
		
		ch = '!';
		ch = 80;
		ch = '\u0061';
		
		System.out.println("ch : " + ch);
		
	}
	
	
	
	
}
