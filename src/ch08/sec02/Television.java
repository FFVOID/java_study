package ch08.sec02;

public class Television implements RemoteControl {
	//필드
	private int volume;
	
	//자식클래스는 부모의 추상메소드를 반드시 오버라이드해서 구현 해야한다. 그래야 인스턴스생성및 등등 기능을 사용가능
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//볼륨의 크기를 0~10사이를 유지시킴
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				
				System.out.println("현재 tv볼륨:" + this.volume);
	}
	
}
