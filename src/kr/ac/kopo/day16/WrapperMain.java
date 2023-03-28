package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.List;



/*
		기본자료형				참조자료형
		boolean				Boolean
		char				Character
		byte				Byte
		short				Short
		int					Integer
		long				Long
		float				Float
		double				Double
 */

// new ArrayList<Integer>();
// 기본자료형의 데이터를 Wrapper클래스에 넣는것을 auto boxing 이라고 한다
// Wrapper class 는 기본자료형도 참조자료형으로 만들어서 사용할 수 있다.
public class WrapperMain {

	public static void main(String[] args) {
		
		int i = 12;
		System.out.println("i2 : " + i);
		
		Integer i2 = new Integer(12);
		System.out.println("i2 : " + i2);
		
		int i3 = i2;	// auto unboxing
		
		Integer i4 = i;  // 기본자료형의 데이터를 Wrapper클래스에 넣는것을 auto boxing 이라고 한다

		List<Integer>list = new ArrayList<Integer>();
		
		list.add(new Integer(100));
		list.add(20);
		
	}

}
