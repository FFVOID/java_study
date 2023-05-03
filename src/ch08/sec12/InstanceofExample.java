package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		//vehicle객체가 bus객체를 참조하는가? = 자동타입변환이 됐는가?
		if(vehicle instanceof Bus) {
			//위에 조건문이 맞으면 강제타입변환(자식객체가 부모객체를 참조하는것)
			Bus bus = (Bus) vehicle;
			bus.checkFare(); //강제타입변환해서 자식클래스에 있는 고유의메소드 사용가능,필드도
			
		}
		
		vehicle.run();
	}

}
