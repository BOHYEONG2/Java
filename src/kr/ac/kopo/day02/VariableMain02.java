package kr.ac.kopo.day02;

public class VariableMain02 {

	public static void main(String[] args) {
		
		double num = 12.34;
		
		num = /*(double)*/34;		// 묵시적형변환  300cc잔을 비유로 했을 때 작은 데이터를 큰 데이터 자료로 넣어주었을 때에는 생략이 가능한다 = 묵시적형변환
									
		System.out.println("num : " + num);
		
		int num2;
		num2 = (int)45.67;				// 강제적(명시적)형변환  큰 범위에 있는 데이터를 작은 범위의 데이터에 넣을 때에는 명시해줘야 하니 명시적형변환
		
		
		// 연산자를 기준으로 왼쪽과 오른쪽의 데이터타입이 달랐을 때 형변환이 발생된다. 
										// 45.67은 실수이거 int형은 정수이기 때문에 정수로 맞춰주기 위해 (int)를 넣어준다.
		
		System.out.println("num2 : " + num2);
		
		float num3;
		num3 = (float)10.4;
		num3 = 10.4f;
		
		System.out.println("num3 : " + num3);
		
		System.out.println(12 + (int)12.34);
		System.out.println((double)12 + 12.34);   // 여기서도 double이 큰 자료형이기 때문에 형변환하지않고 생략하여도 소수점까지 연산이 됨 묵시적형변환.
		
	}
	
}
