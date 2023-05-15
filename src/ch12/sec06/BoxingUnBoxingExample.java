package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// 박싱 : primitive(기본)타입 = > 포장타입으로 변경
		Integer obj = 100; // Integer = 참조타입
		System.out.println(obj.intValue()); //int타입으로 변경

		// 언박싱 : 포장타입 => primitive(기본) 타입으로 변경
		int value = obj;
		System.out.println(value);
		
		//연산시에는 자동으로 기본타입으로 변경된다 ( 참조 +  기본)
		int result = obj + 100;
	}

}
