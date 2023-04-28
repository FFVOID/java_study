package ch06.sec12.hyundai;

import ch06.sec12.hankook.*; //hankook.* (모든 하위 클래스를 가져온다)
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	
	//첫번째 방법. 패키지명.클래스를 불러온다
	//ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	
	//두번째 방법 import로 패키지를 가져온다
	Tire tire1 = new Tire();
	SnowTire snow1 = new SnowTire();
	AllSeasonTire allSeasonTire = new AllSeasonTire();
	
	
	
}
