package kr.ac.kopo.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		List<Member> members = new ArrayList<Member>();
		members.add(new Member("aaa", "1111"));
		members.add(new Member("bbb", "2222"));
		members.add(new Member("ccc", "3333"));
		members.add(new Member("ddd", "4444"));
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("아이디를 입력 : ");
//		String id = sc.nextLine();
		

		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			System.out.println("아이디를 입력 : ");
			String id = sc.nextLine(); 
			if(!member.getId().equals(id)) {		
					System.out.println("입력하신 [" + id + "]는 존재하지 않습니다");
					System.out.println("서비스를 종료합니다");
					System.exit(0);
			}
		
		System.out.print("패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!member.getPassword().equals(password)) {
		System.out.println("입력한 패스워드가 올바르지 않습니다");
		System.out.println("서비스를 종료합니다");
		System.exit(0);
	
		}
		System.out.println("변경할 패스워드를 입력하세요 : ");
		member.setPassword(sc.nextLine());
//		String newPassword = sc.nextLine();	
		System.out.println("패스워드 변경이 완료되었습니다");
		break; 
		}	
		System.out.println("< 전체 회원 목록 > ");
		System.out.println("========================");
		System.out.println("아이디\t패스워드");
		System.out.println("========================");
		
		for(int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getId() + "\t" +  members.get(i).getPassword());
			
			
		}
		}	
}
