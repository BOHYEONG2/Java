package kr.ac.kopo.day05;

public class BreakMain01 {

	public static void main(String[] args) {
		
		int cnt = 1;
		for( cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3 ) {
				break;							// 3에서 break가 true가 되어 3은 찍지않고 멈춤 (3전에 2까지만 출력)
			}
			
			System.out.println("HI");
		}	
		System.out.println("cnt : " + cnt);
	}

}
