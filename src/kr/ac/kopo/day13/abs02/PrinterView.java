package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

	public class PrinterView {

	private Scanner sc = new Scanner(System.in); // 입력받을 스캐너를 하나 만들어줌
	
	
	public void work() {
		
		System.out.println("출력할 프린터를 선택하세요(1. LG 2. SAMSUNG  3.HP) : ");
		int choice = sc.nextInt();		// 입력 메시지
		sc.nextLine();			//버퍼 비워주기 위해서 써줌
		
		
		Printer p = null;  
		switch(choice) {
		case 1: 
			p = new LGPrinter();					
			break;			
		case 2:
			p = new SamsungPrinter();		
			break;
		case 3:
			p = new HPPrinter();
			break;
		default : 
			System.out.println("잘못입력하셨습니다");
		}
		if(p != null) {
			p.print();
		}

		
/*		switch(choice) {
		case 1: 
			p = new LGPrinter();
	//		Printer lg = new LGPrinter();			// 자식의 인스턴스 객체의 주소값은 부모의 참조변수가 받을수 있음 그래서 아래것도 가능 위에것도 가능
	//		LGPrinter lg = new LGPrinter();			//초이스할 객체를 만들어줌   
			lg.print();					//객체 호출  // lg.print(); 였지만 lg프린터에서 프린터에 있는 추상메소드를 상속받고 재정의했음 그러니 lg.lgPrint가 아닌 lg.print만써도 lg가나옴
			break;			
		case 2:
			P = new SamsungPrinter();
//			Printer sam = new SamsungPrinter();
			sam.print();
			break;
			
		}
*/		
		
	}
	
}
