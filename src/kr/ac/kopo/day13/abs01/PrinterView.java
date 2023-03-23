package kr.ac.kopo.day13.abs01;

import java.util.Scanner;

	public class PrinterView {

	private Scanner sc = new Scanner(System.in); // 입력받을 스캐너를 하나 만들어줌
	
	
	public void work() {
		
		System.out.println("출력할 프린터를 선택하세요(1. LG 2. SAMSUNG) : ");
		int choice = sc.nextInt();		// 입력 메시지
		sc.nextLine();			//버퍼 비워주기 위해서 써줌
		
		switch(choice) {
		case 1:
			LGPrinter lg = new LGPrinter();			//초이스할 객체를 만들어줌
			lg.lgPrint();					//객체 호출
			break;			
		case 2:
			SamsungPrinter sam = new SamsungPrinter();
//			sam.samPrint();
			break;
			
		}
		
		
	}
	
}
