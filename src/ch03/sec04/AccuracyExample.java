package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		//정확한 계산은 정수 연산으로 해야한다. 정수 정수 = 정수
		
		int apple = 1; //사과1조각
		int totalpieces = apple * 10;
		int number = 7;
		
		int result = totalpieces - number; // 1-0.7 =0.3
		
		System.out.println(result / 10.0);
		
	}

}
