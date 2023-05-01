package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//다형성은 자동타입변환 + 메소드 오버라이딩
		myCar.tire = new HankookTire();
		myCar.run();
	}

}
