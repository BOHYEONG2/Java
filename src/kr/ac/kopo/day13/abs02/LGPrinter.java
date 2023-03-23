package kr.ac.kopo.day13.abs02;

public class LGPrinter extends Printer {

	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void lgPrint() { 	
		System.out.println(model + "에서 출력중");
	}
	
	public void print() {			// 추상클래스를 상속받는 하위클래스는 상위클래스의 추상메소드를 반드시 오버라이딩(재정의해야한다)
//			System.out.println("LG프린터에서 출력중...");
			lgPrint();
			
	}
	
	
	
}
