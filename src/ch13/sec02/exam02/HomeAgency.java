package ch13.sec02.exam02;

public class HomeAgency implements Rentalable<Home> {// Home클래스를 타입으로 사용

	@Override
	public Home rent() { // 리턴타입이 Home 이여야함
		return new Home();
	}

}
