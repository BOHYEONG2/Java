package kr.ac.kopo.day09;

public class MethodMain01 {

	static int prnStar(int num, String data) { 
		
		System.out.println("*****");
		System.out.println("호출자가 넘겨준 정수 : " + num);	
	  			// return 써주면 바로 호출자로 복귀해서 그 아래 문장은 안찍힌다.
		System.out.println("호출자가 넘겨준 값 : " + data);
		int sum = num%10 + num/10;		//	int sum값은 prnStar 메소드에만 있으니 그것을 호출자에게 넘겨주려면 리턴을 해야함
										// int 형의 자료를 return으로 보내주는거니  호출자도 int형으로 받아야 한다
		return sum;						// 호출자의 return을 받을곳 앞에 =을 붙여주면 return값을 받겠다는 것이고 자료형은 같아야한다.				
	//	return;
		
	}
		
		
	public static void main(String[] args) {
		
		int cnt = 17;
		int s = prnStar(cnt,"abc");			// 호출자가 넘길때 하나의 값이 아닌 여러개 보낼수 있음 ( , 상태로 보내면됨)
		System.out.println("자릿수 합 : " + s);
		System.out.println("Hello");
		prnStar(5, "hi");				// 에러가 나는 이유 : 호출자에게 정수를 받아서 입력해야 하는데 왜 안넘기냐(괄호안에 숫자를 안써주면 에러가난다)
		System.out.println("HI");
		prnStar(9, "good");
		System.out.println("Good-bye");
		prnStar(7, "bye");
		System.out.println("자릿수 합 : " + s);
	}

}
