package kr.ac.kopo.day16.calendar;

import java.util.Calendar;
// 기능클래스 
public class CalendarUtil { // 달력과 관련된 유틸클래스
// set 메소드를 쓰기위해 달력의 날짜를 알수있는 객체를 만들고  
	private Calendar c;
	
	public CalendarUtil() {
		c = Calendar.getInstance();
	}
	
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year,month);
		}		
	}
	
	public void showByMonth(int year, int month) {
		
	//	System.out.println("*** " + year + "년" + month + "월 ***");
		System.out.printf("*** %4d년 %02d월 *** \n",year,month);	
		// year/month/1 날짜정보 수정
		c.set(year, month-1,1);
		//month-1의 이유는 달력에서 5를 입력하면 01234 해서 4월을 찍게됨 그래서 -1해야 내가원하는 
		// 달을 볼수 있음
		
		//요일 추출
		int week = c.get(Calendar.DAY_OF_WEEK);
		// 해당 월의 마지막 날
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println("week : " + week + ", lastday : " + lastday);
		
		showByDay(week, lastday);  // CalendarUtil에서만 쓰이는 내부에서 쓰이는 달력메뉴
	}

	private void showByDay(int week, int lastday) { //year와month만 보이게함/은닉성
		
		System.out.println("=================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=================================================");
		int cnt = 0;
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
			cnt++;
		}
		for(int day = 1; day <= lastday; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0 && day < lastday) {  // 일월화수모금토 하고 숫자가 다시 일로 가야하니 탭의개수 7개면 엔터찍게끔
				System.out.println(); // day < lastday 보다 크면 엔터를 안찍는다,
			}
		}
	//	if(cnt & 7 != 0) {
		//	System.out.println();    위에 day < lastday랑 같은 뜻임
		
		System.out.println();
		System.out.println("=================================================");
		
	}
	
	
}
