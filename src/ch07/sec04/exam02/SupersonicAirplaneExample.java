package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		System.out.println();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		System.out.println();
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}

}
