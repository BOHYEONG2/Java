package kr.ac.kopo.day04;

public class OperationMain05 {

	public static void main(String[] args) {
		
		int num = 0xe855aa39;
	
		System.out.printf("%08x\n", num);  // 비트연산자    ( ~ 표시는 비트를 반전시키는거)
		
		System.out.printf("%x\n", ~num);
		
		System.out.printf("%08x\n", num & 0xffff0000);
		System.out.printf("%08x\n", num & 0x0000ffff);
	}

}
