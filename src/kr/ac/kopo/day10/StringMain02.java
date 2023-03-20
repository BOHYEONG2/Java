package kr.ac.kopo.day10;

public class StringMain02 {

	public static void main(String[] args) {
		
		String str01 = "Hello world";
		String str02 = "Hello world";
		
		System.out.println("star01 : [" + str01 + "]");
		System.out.println("star02 : [" + str02 + "]");
		
		// str01 str02는 참조변수  = 주소를 가리킴  
		//주소비교
		if(str01 == str02) {
			System.out.println("[주소비교]str01 == str02");
		} else {
			System.out.println("[주소비교]str01 != str02");
		}
		
		//값비교(대소문자 구분o)
		boolean bool = str01.equals(str02);        // str01과 str02가 같니 라고 물어보는거
		if(bool) {
			System.out.println("[값비교]str01 == str02");
		} else {
			System.out.println("[값비교]str01 != str02");
		}
		
		// 값비교(대소문자 구분x)
		bool = str01.equalsIgnoreCase(str02);
		if(bool) {
			System.out.println("[값비교]str01 == str02");
		} else {
			System.out.println("[값비교]str01 != str02");
		}
		
		String[] names = {"홍길동", "강길동", "홍길순", "홍길동", "김길순", "김길남", "길동홍"};
		
		System.out.println("< 홍길동인 사람을 검색 >");   // equals
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 홍씨성인 사람을 검색 >");  // 문자열이 처음이면 startsWith
		for(String name : names) { 
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 길동인 사람을 검색 >");
		for(String name : names) {
			if(name.endsWith("길동")) { 			// 문자열이 끝나면 endsWith
				System.out.println(name);
			}
		}
		
		System.out.println("< \"길동\"이 포함된 사람을 검색 >");
		for(String name : names) {
			if(name.contains("길동")) {				//포함되어있는건 contains
				System.out.println(name);
			}
		}
		
		str01 = "banana";
		str02 = "boat";
		
		int cmp = str01.compareTo(str02);
		if(cmp == 0) {
			System.out.println(str01 + " == " + str02);
		} else if ( cmp > 0) {
			System.out.println(str02 + " <" + str01);
		} else {
			System.out.println(str01 + " < " + str02);
			
		}
		
	}	
}


