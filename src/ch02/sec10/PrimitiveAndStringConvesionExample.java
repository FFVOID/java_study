package ch02.sec10;

public class PrimitiveAndStringConvesionExample {

	public static void main(String[] args) {
		String a = "10";
		int value1 = Integer.parseInt(a); //String-> ing 문자 를 숫자로
		double value2 = Double.parseDouble(a);
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(3.34114);
		System.out.println(str1);
		
		int Value = 123;
		System.out.printf("상품의 가격:%d원\n" , Value);
		System.out.printf("상품의 가격:%6d원\n" , Value);
		System.out.printf("상품의 가격:%-6d원\n" , Value);
		
		System.out.printf("이름 : %s","김자바");
		
		
		int v1 = 15;
		
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + 5;
		System.out.println(v3);
	}	
	
	

}
