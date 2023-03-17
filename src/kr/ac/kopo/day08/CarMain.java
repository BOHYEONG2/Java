package kr.ac.kopo.day08;

//실행클래스
public class CarMain {

//	void aaa() { 
//		int b = 5;   // 다른 메소드에서는 알 수 없다
//	}				// 메소드 내에서 정의된 변수는 그 메소드 안에서만 사용가능
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "소나타";
		c.price = 3000;
		
		Car c2 = new Car();
		
		c2.model = "모닝";
		c2.price = 1900;
		
		System.out.println("모델명 : " + c.model + ", 가격 : " + c.price + "만원");
		System.out.println("모델명 : " + c2.model + ", 가격 : " + c2.price + "만원");
		
	}
}
