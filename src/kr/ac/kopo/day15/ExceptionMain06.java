package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void a() {
		
		System.out.println("a() 시작");
		try {
		// 컴파일시점 예외처리, checked Exception
		FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println("a() 종료");
	}
	
	public static void b() throws NullPointerException {		//b메시지에서 null이 나오면 익셉션에 떠넘겨라는뜻
		
		System.out.println("b() 시작....");
		String str = null;
		System.out.println("length : "  + str.length());
		System.out.println("b() 종료....");
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			b();
		} catch(NullPointerException e) {
			System.out.println("main 예외처리...");
			e.printStackTrace();
		}
		
		a();
		

	}

}
