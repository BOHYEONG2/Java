package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private String name;
	private String phone;
	
	Employee(String name, String phone) {
		this.name = name;	
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		
	//	if(this.name.equals(((Employee)obj).name)) {}
		Employee e = (Employee)obj;
		if(this.name.equals(e.name) && this.phone.equals(e.phone)) {
			return true;
	}
	return false;
}
	@Override
	public int hashCode() {
		
		return 10000;
	}
}

class Car {
	String model;
	String no;
	
	Car(String model, String no) {
		this.model = model;
		this.no = no;
	}
}


public class MapMain02 {

	public static void main(String[] args) {
		
		String s = "Hello";
		String s2 = new String("Hello");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		
	
		Employee e = new Employee("홍길동","010-1111-2222");
		Employee e2 = new Employee("홍길동","010-1111-2222");
		if(e.equals(e2)) {  //객체와 객체가 같은지를 볼떄는 == 을 쓰는게 아니라 equals 메소드를 사용한다   equals 써도 결과는 다르다가 나오는데 이유가 주소값참조해서그런거 
			System.out.println("같다");			// 오브젝트를 기반으로 객체를 만들었기 떄문에 주소값만 비교할수 있어서 이럴떄는 오버라이딩 해야함
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(e.toString());
		System.out.println(e2.toString());
		
		
		Map<Employee, Car> carList = new HashMap<>();		// Key 는 Employee Value = Car
		
		carList.put(new Employee("홍길동", "010-1111-2222"), new Car("소나타","123나4567"));
		carList.put(new Employee("고길동", "010-1234-5678"), new Car("산타페","234다3452"));
		carList.put(new Employee("한길동", "010-2222-5555"), new Car("K5","252마1836"));
		carList.put(new Employee("홍길동","010-1111-2222"), new Car("벤츠", "346rn7357"));
		
		System.out.println("등록된 차량대수 : " + carList.size());
		
	}
	
}
