package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동타입 변환
		vehicle.run();
		//vehicle.checkFare(); //자식 클래스 고유의 메소드,필드 사용불가
		
		//강제타입변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
