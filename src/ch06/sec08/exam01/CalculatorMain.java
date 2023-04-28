package ch06.sec08.exam01;

public class CalculatorMain {
	
	//리턴값이 없는 메소드
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
		//return; // 리턴값이 없으니 생략 가능
	}
	
	public static int plus(int x,int y) {
		int result = x + y;
		return result; // 리턴만나면 메소드끝 
	}
	
	
	
	public static void main(String[] args) {
		powerOn();
		int result2 = plus(10 , 20);//기본으로 int타입 실수면 double타입
		System.out.println(result2);
	}

}
