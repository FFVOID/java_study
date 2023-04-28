package ch06.sec08.exam01;

public class Calculator {
	// 필드: 있어도 그만 없어도 그만
	// 생성자 : 컴파일 과정에서 디폴트 생성자가 붙는다 => Calculator (){}
	
	//(코드화되기전 현실세계)객체 = 속성(필드=데이터) + 기능(메소드=동작)
	

	void powerOn() {
		System.out.println("전원을 켭니다.");

	}

	void powerOff() {
		System.out.println("전원을 끕니다.");

	}

	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴만나면 메소드끝
	}

	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
}
