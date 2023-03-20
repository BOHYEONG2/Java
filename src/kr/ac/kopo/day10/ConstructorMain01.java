package kr.ac.kopo.day10;

/*
 	생성자 특징
 	1. 클래스명과 동일
 	2. 반환값 존재 안함
 	3. default 생성자 지원 : 클래스내에 생성자가 하나도 정의되어 있지 않은 경우
 						 JVM에서 자동으로 생성
 	4. 생성자 오버로딩 지원
 	5. 멤버변수값을 초기화 
 */
class Dog {
	// 생성자는 void를 붙이지 않는다 ;; 반환값이 존재하지 않기 떄문에
	Dog() { 
		System.out.println("디폴트 생성자 Dog() 호출.....");
		
	}
//	디폴트 생성자는 매게변수가 없는 생성자만 사용
	
	
	Dog(int i) {
		System.out.println("Dog(int) 생성자 호출...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {

		new Dog();
		new Dog(10);             // new Dog를 만들면 생성자를 호출
	}

}
