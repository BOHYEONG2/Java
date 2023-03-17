package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		
		
		int loc = 0;
		
	//	String[] strArr = {"하이테크", "자바", "교육");		// alt shift a누르면 세로열에 한번에 글자 바꿀수있음 3~4줄 쓰려면 드래그해야함
		String[] strArr = new String[5];
		strArr[loc++] = "하이테크";
//		strArr[loc++] = "인공지능소프트웨어과";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		
		System.out.println("< index 이용 출력 >" );
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("< 1.5버전 for 출력 > ");	// alt 키 누른상태에서 방향키 누르면  이동가능
		for(String str:strArr) {
			System.out.println(str);
		}
		
		System.out.println("< Arrays.toString() 이용 출력 >");         // [ + ] 하나의 문자열의 형태로 만들어 주겠다.
		System.out.println(Arrays.toString(strArr));
	

	}

}
