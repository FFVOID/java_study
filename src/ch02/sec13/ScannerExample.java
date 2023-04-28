package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x값 입력:");
		String strX = scanner.nextLine(); // 문자형으로 입력받음
		int x = Integer.parseInt(strX); // 문자형 -> 숫자형 변환

		System.out.print("y값 입력:");
		String strY = scanner.nextLine(); // 문자형으로 입력받음
		int y = Integer.parseInt(strY); // 문자형 -> 숫자형 변환
		
		int result = x + y;
		System.out.println("x + y:" + result);
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			
			if(data.equals("q")) {
				break;
			}
			
			System.out.println("출력 문자열: " + data);
		}
		System.out.println("종료");
		
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f",10,area);
		
		/
		
	}

}
