package kr.ac.kopo.day05;

public class LoopMain03 {

	public static void main(String[] args) {
	
		int cnt = 1;						// 일반적으로는 while 에 break문 사용해서 많이 쓴다.
		do {								// 최소 한번은 실행하고 싶을 때 사용한다.  에러체크 할 때 사용된다
			System.out.println("Hello");
			++cnt;
		} while(cnt <= 5);  
			
		

	}

}
