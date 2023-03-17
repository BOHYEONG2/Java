package kr.ac.kopo.day09;

public class MethodMain02 {

	public static void main(String[] args) {
		Method m = new Method();	// new키워드 이용하여 객체생성
		m.call();   	// 참조변수를 이용하여 ~ .call (메소드변수에 call을 호출할거니 참조변수.call(); 
		m.call(10);
		m.call("aaa", 12);
		m.call('a');
		m.call(12.34);
	
	}
	

}
