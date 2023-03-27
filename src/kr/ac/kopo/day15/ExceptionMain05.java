package kr.ac.kopo.day15;

public class ExceptionMain05 {

	public static void main(String[] args) {
		
		System.out.println("=======start=========");
		try {
	//		String str = null;
			String str = "hello";
			System.out.println("length : " + str.length());
			
			return;				// return을 만나면 프로그램 종료
	} 	catch(Exception e ) {
			System.out.println("예외발생");
			e.printStackTrace();
	} 	finally { 
			System.out.println("무조건 실행됩니다");
		}
		System.out.println("=======end=========");
		
	}

}
