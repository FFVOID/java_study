package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null; //참조하는건없고 null이 있따
		intArray[0] = 10;
		
		String str = null;
		System.out.println(str.length());
	}

}
