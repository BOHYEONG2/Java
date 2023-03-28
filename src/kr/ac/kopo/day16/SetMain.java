package kr.ac.kopo.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set : 순서X, 중복X
	구현클래스
	 -HashSet
	 -TreeSet
	메소드
	-add()		: 데이터 삽입
	-contains()	: 데이터 존재여부 판단
	- remove()	: 특정데이터 삭제
	-clear()	: 전체데이터 삭제
	-size()		:
	-isEmpty()	:	
*/
public class SetMain {
// add는 중복데이터가 있을경우 입력자체가 안된다 그래서 true false를 해주는데
// 첫번재 출력은 그대로 출력되고 true 뒤에건 two가 2개 들어가는데 add하나는 안먹히니 false를 출력.
	public static void main(String[] args) {
		
	Set<String> set = new HashSet<>(); // generic에 타입을 생략할 수 있음 앞에 있으니
	set.add("one");
	System.out.println("add(two) : " + set.add("two"));
	set.add("two");
	set.add("three");
	set.add("four");
	set.add("five");
	set.add("two");
	System.out.println("add(two) : " + set.add("two"));
	System.out.println("set : " + set);

	// two가 존재하면 삭제하고 "삭제성공", 존재하지 않으면 "존재하지 않음"출력
	System.out.println(set.remove("two") ? "삭제성공" : "존재하지 않음");
	
	
/*	if(set.contains("two")) {
		set.remove("two");
		System.out.println("\"two\"  데이터 삭제성공");
	} else {
		System.out.println("\"two\" 데이터 존재하지 않음");
	}
	*/
	/*
	 	set 전체데이터 접근방식
	 	1. 1.5버전의 for문 이용
	 	2. toArray() 메소드 이용
	 	3. Iterator객체 이용
	 */
	System.out.println("< 1.5버전의 for문 이용 > ");
	for(String data : set) {
		System.out.println(data);
	}
	
	System.out.println(" < toArray() 메소드 이용>");
	Object[] dataArr = set.toArray();
	for(int i = 0; i < dataArr.length; i++) {
		System.out.println(dataArr[i] + " length() : " + ((String)dataArr[i]).length()); 
	// length 에러나는 이유  데이터어레이가 오브젝트 메소드라서  // 그래서 String 명시적 형변환을 해줌
	}
	
	/* 
		Iterator 주요 메소드
		hasNext()	: 다음데이터 존재여부 판단
		next()		: 데이터 이동 				
	*/
	// index로 접근을 못하니 Iterator 객체를 이용하여 한칸씩옮기며 데이터 접근 
	System.out.println(" < Iterator 객체 이용");
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());		// 넥스트가 다음 데이터를 얻어온다고 생각하면 쉬움
	}
	
	
	
	}

}
