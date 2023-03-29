package kr.ac.kopo.day16.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoView {
	Random r = new Random();
	public void start() {
		
//		System.out.println("게임수를 입력 : );
		int gameCnt = 10;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임  " + i + " : " + Arrays.toString(getLotto()));	
		}
	}
		private int[] getLotto() {			
			int[] lottoNums = new int[6];
			
			List<Integer> nums = new ArrayList<>();
			for(int i = 1; i <= 45; i++) {
				nums.add(i);
			}
			Collections.shuffle(nums);   // Collections.shuffle 섞는다는뜻
			for(int i = 0; i < lottoNums.length; i++) {
				lottoNums[i] = nums.get(i);
			}
			
			
			
			return lottoNums;
		}
}	
/*			int[] lottoNums = new int[6];
			
			Set<Integer> lottos = new HashSet<>();
			while(lottos.size() < 6 ) {
				lottos.add(r.nextInt(45)+1);
			}
			int i = 0;
			for(int num : lottos) {
				lottoNums[i++] = num;
			}		
				return lottoNums;
			}
		}
*/
/*			int[] lottoNums = new int[6];
			int[] nums = new int[45];
			for(int i = 0; i < nums.length; i++) {
				nums[i] = i + 1;
			}
	//		System.out.println(Arrays.toString(nums));
			for(int i = 0; i < 6; i++) {
				int randIdx = r.nextInt(45-i);  // 0~44인데 하나씩 줄어드니 45-i
				
				int temp = nums[randIdx];
				nums[randIdx] = nums[45-1-i];    // 번호 서로 맞교환 시키기 위해서
				// num 랜덤번지랑 뒤에 45번지랑 바꿔라 라는뜻 
				nums[45-1-i] = temp;
				
				System.arraycopy(nums, nums.length-lottoNums.length , lottoNums, 0, lottoNums.length);
//				System.out.println(Arrays.toString(nums));
			}
			return lottoNums;
	*/		
			/*
			int a = 10;
			int b = 20;
			
			int temp = a;
			a = b;
			b = temp;
			*/

			
/*			int[] lottoNums = new int[6];
			boolean[] flags = new boolean[45]; // 0~44
			
			for(int i = 0; i < lottoNums.length;) {
				int random = r.nextInt(45);  // 여기다 +1 안한이유는 new boolean[45];여기랑 연결하려고
				if(!flags[random]) {
					lottoNums[i++] = random+1;
					flags[random] = true;
				} else 
					System.out.print('!');
			}  
			
			return lottoNums;
	
		}		
	}
	*/
/*			int[] lottoNums = new int[6];
		loop:for(int i = 0; i < lottoNums.length; ) {
				lottoNums[i] = r.nextInt(45) + 1;			
				for(int j = 0; j < i; j++) {
					if(lottoNums[i] == lottoNums[j]) {
						System.out.println("!");
						continue loop;
					}
				}
				i++;
			}		
			return lottoNums;
			
		}
*/
/*		private int[] getLotto() {
			int[] lottoNums = new int[6];
			for(int i = 0; i < lottoNums.length; ) {
				lottoNums[i] = r.nextInt(45) + 1;
				boolean bool = true; 
				for(int j = 0; j < i; j++) {
					if(lottoNums[i] == lottoNums[j]) {
						System.out.println("!");
						bool = false;
						break;
					}
				}
			}
			if(bool) {
				i++;
			}
			return lottoNums;
			
		}
*/		
	


