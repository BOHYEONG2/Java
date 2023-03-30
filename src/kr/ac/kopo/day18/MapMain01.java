package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	MAP : key, value 쌍으로 이루어진 데이터 집합
		: 순서X, key에 대한 중복X
	구현클래스
		-HashMap
		-TreeMap
	
	메소드
	- put(k,v)		: 데이터 입력
	- get(k)		: key쌍에 해당 value 반환
	- containsKey(k): 해당 key의 존재여부 판단
	- remove(k)		: key에 해당되는 value 삭제 
*/
public class MapMain01 {
	/*
	  	비밀번호 변경서비스 구현
	  	- 특정 아이디에 대한 패스워드 변경을 목적
	  	- 중복 아이디가 존재X
	  	- 아이디 : key , 패스워드 : value
	 */
	public static void main(String[] args) {
		
	Map<String, String> members = new HashMap<String, String>();
	members.put("aaa","111");
	members.put("bbb","222");
	members.put("ccc","333");
	members.put("ddd","444");
	
//	System.out.println("전체 회원수 : " + members.size());
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("*** 비밀번호 변경서비스 ***");
	System.out.print("아이디를 입력하세요 : ");
	String id = sc.nextLine();
	if(!members.containsKey(id)) {
		System.out.println("입력하신 [" + id + "]는 존재하지 않습니다");
		System.out.println("서비스를 종료합니다");
		System.exit(0);
	}
	
	System.out.print("패스워드를 입력하세요 : ");
	String password = sc.nextLine();
	
//	if(members.get(id) == password)   << 이렇게 쓰면 안됨, id는 스트링형 패스워드도 스트링형이라 문자열과 문자열을 비교할떄는 equals를 써줘야함
	if(!members.get(id).equals(password)) {
		System.out.println("입력한 패스워드가 올바르지 않습니다");
		System.out.println("서비스를 종료합니다");
		System.exit(0);		
	}
	
	System.out.println("변경할 패스워드를 입력하세요 : ");
	String newPassword = sc.nextLine();
	members.put(id, newPassword);
	System.out.println("패스워드 변경이 완료되었습니다");
	
	System.out.println("< 전체 회원 목록 > ");
	System.out.println("========================");
	System.out.println("아이디\t패스워드");
	System.out.println("========================");
	
	Set<String> keys = members.keySet();		// 키만 뽑아서 쓸 때는 키셋     전부다 뽑아내려면 entrySet   ,, value만 뽑아쓸순없음 중복될수있어서
	for(String key : keys) {
		System.out.println(key + "\t" + members.get(key));
	}
	
/*	Set<Entry<String,String>> entrySet = members.entrySet();	// 맵에 들어있는 엔트리 데이터를 Set 데이터로 변환
	for(Entry<String, String> e : entrySet) {
		System.out.println(e.getKey() + "\t" + e.getValue());
	
	}
*/	
	System.out.println("========================");
	
	}
	
	

}
