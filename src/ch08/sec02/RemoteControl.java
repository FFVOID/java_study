package ch08.sec02;

public interface RemoteControl {
	//인터페이스는 상수 + 추상메소드 => 상속만을 위해서 쓰인다. 추상메소드를 선언했으면 반드시 자식 클래스에서 추상메소드를 구현해야함(추상클래스와동일)
	
	//인터페이스는 public static final을 안써도 상수로 인식을 한다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다");
			setVolume(MIN_VOLUME); // 추상메소드 호출
		} else {
			System.out.println("무음해제 합니다");
		}
	}
	
	//정적 메소드 = 구현부{}가있어야함
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교환합니다");
	}
}
