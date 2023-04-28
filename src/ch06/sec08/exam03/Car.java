package ch06.sec08.exam03;

public class Car {
	//필드
	int gas; // 휘발유의 양
	
	//생성자 Car(){} 인스턴스가 생성될때 한번만 실행
	/*Car(int gas){
		System.out.println("생성자 실행!");
		this.gas = gas;
	}*/
	
	
	//메소드 - 여러번 실행가능
	void setGas(int gas) {//휘발유를 채워 넣는다.
		this.gas = gas;
	}
	
	boolean isLeftGas() {//차에 휘발유가 있는지 확인
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false; //메소드
		}
		
		System.out.println("gas가 있습니다");
		return true; //메소드
	}
	
	void run() {//자동차가 달린다(휘발유 소모)
		while(true) {
			if(gas > 0) {//가스가있음
				System.out.println("달립니다 gas잔량:" + gas );
				gas -= 1;//1씩 가스 소모
			} else {//가스가없음
				System.out.println("멈춥니다 gas잔량:" + gas);
				return; //메소드 종료
			}
		}
	}
}
