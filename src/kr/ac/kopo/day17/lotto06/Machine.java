package kr.ac.kopo.day17.lotto06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
	
	private List<Ball> balls;
	
	public Machine() {
		balls = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			Ball ball = new Ball(i); //숫자를 가지고 있는 Ball을 하나 가지고 있어야함
			balls.add(ball);
		}		
	}
	public void start() {	 // 로또추첨기계 돌아가면 공이 돌아가야하니 shuffle써서 돌려준다
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {
		return balls.remove(0);   // 리턴으로 0번지 뽑아내면 6개가 나옴 
								// 왜냐면 remove(0)하면 0번지를 가져오고 삭제하면 다음 번호도 0번지니 또 0번지를 가져옴 그게 <6 전까지
	}
	
}
