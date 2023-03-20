package kr.ac.kopo.day10;

public class Member {

	/** 이름 */
	String name;	
	/** 나이 */
	int age;	
	/** 혈액형 */
	String bloodType; 
	
	// 생성자도 문장들을 모아놓은 집합이다
	// new를 할때에만 호출되는 건데
	// 
	// 멤버변수 생성자를 만들 때에는 기본적으로 기본생성자도 같이 만들어줘라
	Member() {
	
		this("알수없음");
//		this("알수없음", -1, "알수없음");
		// 오버로딩된 생성자를 다시 호출할때 this를 쓴다
		// new는 
		// this는 생성자 내에만 있어야 한다. 무조건 실행하는 첫 줄에 있어야 한다
/*		this.name = "알수없음";
		this.age = -1;
		this.bloodType = "알수없음";
*/	
	}
	Member(String name) {
	
		this(name, -1);
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알수없음";
//	
}
	Member(String name, int age) {
		this(name, age, "알수없음");
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
		
	}
// 클래스내에 같은 변수명이(name age같은) 2개가 있으면 우선적인건 아래에 있는 지역변수가 우선적으로 쓰인다
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
		
	}
}
