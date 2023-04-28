package ch02.sec09;

public class OperationPromotinExample {

	public static void main(String[] args) {
		//byte short char 연산은 int로 따라감->int변환
		byte v1 = 10;
		byte v2 = 20;
		byte result2 = (byte) (v1 + v2);
		
		// 큰타입으로 따라감
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println(result4);
		
		String str = String.valueOf(63424245);
		System.out.println(str);
		
		
		//정수 실수 = 실수
		int v8 = 10;
		double result5 = v8 / 4.0;
		System.out.println(result5);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10/ v11; // (double) (v10/v11)가 되지않도록 조심 괄호
		System.out.println(result7);
				
	}

}
