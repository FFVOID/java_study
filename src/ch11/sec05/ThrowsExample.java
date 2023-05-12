package ch11.sec05;

public class ThrowsExample {
	
	//main에 throw를 하면 jvm에서 알아서 예외처리 해준다
	public static void main(String[] args) throws ClassNotFoundException {
		
			findClass(); //예외를 던지면 메소드가 실행되는 곳에서 처리해줘야 한다
		
	}
	
	public static void findClass() throws ClassNotFoundException { // 예외를 넘겨줌 
		
			Class.forName("java.lang.String2"); //예외가 발생하는 곳
		
	}

}
