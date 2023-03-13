package kr.ac.kopo.day05;

public class ContinueMain {

	public static void main(String[] args) {
		
		int cnt;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3 ) {
				continue; 	// continue를 만나면 루프를 돌지않고 아래 문장을 이행하지 않고 했다고 생각하고 증가값으로 넘어감 
			}
			
			System.out.println("HI");
		}
		System.out.println("cnt : " + cnt);
	}

}
