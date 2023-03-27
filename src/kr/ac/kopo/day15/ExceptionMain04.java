package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		System.out.println("==== start =====");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		try {
			System.out.println("random : " + random);
			System.out.println(10 / random);
			
			String str = "hello";
//			if(5 > str.length()) {
			System.out.println(str.charAt(5));
			
		} catch(Exception e) {    //묵시적형변환 
			e.printStackTrace();
		}
			
			
			
/*		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!");
			System.out.println(ae.getMessage());	//ae.getMessage() : 에러가 발생한 이유를 보여줌
			ae.printStackTrace();					// 에러가 발생한 지점을 찍으라는 뜻
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBounds 예외발생!!!");
			se.printStackTrace();
		}
*/		
		System.out.println("====  end  =====");

	}

}
