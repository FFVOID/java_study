package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator claculator = new Calculator();
		
		System.out.println("원 면적:" + claculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적:" + computer.areaCircle(r));
		//자식 메소드는 오버라이딩(재정의)하면 상속받지않고 단독 만들어  쓰여서
		//값이 다르다
	}

}
