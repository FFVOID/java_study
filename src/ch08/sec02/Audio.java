package ch08.sec02;

public class Audio implements RemoteControl {
	
	private int volume;
	private int memoryVolum;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
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
		
		System.out.println("현재 audio볼륨:" + this.volume);
	}
	
	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolum = this.volume; //원래 볼륨크기 저장
			System.out.println("무음 처리합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다");
			setVolume(this.memoryVolum);//원래 볼륨크기로 돌려줌
		}
	}
	
	
	
	
}
