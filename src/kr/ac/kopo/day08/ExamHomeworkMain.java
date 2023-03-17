package kr.ac.kopo.day08;

import java.util.Arrays;
import java.util.Scanner;

public class ExamHomeworkMain {

	public static void main(String[] args) {
		// 정수 10개를 입력받아 약수 구하기
		int[][] numArr = new int[10][20];
		int loc = 0;		// 현재 0번지를 가리키기 떄문에 0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.최대 10개입력, 0 입력시 종료됩니다");
		
				// 정수를 입력받는다
		
/*		while(true) {					 numArr 0 ,0 번지가 0이면 브레이크
			if(numArr[loc][0] == 0) {
			break;
		}
		if(++loc == numArr.length) {	 
			break;
		}
	}
*/	
		do {
			numArr[loc][0] = sc.nextInt();	//0,0번지를 입력받아야하고
					
			//정수를 계속 입력 받아야 하니 while이나 for문 돌린다
			int j = 1;									// j = 1 은 loc 1번지부터 라는 뜻 ( 0,1번지)
			for(int i = 1; i <= numArr[loc][0]; i++) {  // 1부터 시작해서 입력받은 정수까지 출력한다 i++하면서
				if(numArr[loc][0] % i == 0) {			// 입력받은 숫자를 i로 나눈게 0이면 출력하고 j++로 0,2번지로 가서 또 출력하게됨 
					numArr[loc][j++] = i;
				}
			}
			
			numArr[loc][0] = j-1; 		 //  0번지에 출력받은 j가 나온다 입력받은게 8이면 0번지에 8 이나온다 입력받은것은 loc 0번지에 넣어라 
										// 위에 for문에서 약수가 나올떄가지 출력하면 i++ 후위증감문으로 인해 0번지 1번지 2번지 3번지 4번지가 나오는데 약수가 3번지까지 나오면 3번이후는 없애기 위해 j-1을표현
		}while(numArr[loc][0] != 0 && ++loc < 10); // 0,0번지가 0이 아니고 10보다 작을때까지 실행
		
		for(int i = 0; i < loc; i++) { 	//
			int idx = numArr[i][0];		// idx가 입력받은수의 0번지를 가리키게됨
			System.out.print(numArr[i][idx] + "의 약수 : ");  // 1,입력받은수
	//		System.out.print(numArr[i][numArr[1][0]] + "의 약수 :");
			for(int j = 1; j <= idx; j++)   // j = 1 부터  j <= 입력받은 수와 같은 수가 나올 떄 까지 j ++
				System.out.print(numArr[i][j] + " ");
			System.out.println();
		
		}
		
		}
		
}
	
