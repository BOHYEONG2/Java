package kr.ac.kopo.day09;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		
		// 임의의 정수를 추출 
		Random r = new Random();
		
		int random = r.nextInt(10); // 안에 들어간 숫자까지만 나옴 0부터 10까지
		System.out.println(random);

		for(int i = 1; i < 6; i++) {
			
		}
	}
}
