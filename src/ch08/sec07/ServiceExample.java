package ch08.sec07;

public class ServiceExample {
	public static void main(String[] args) {
		Service service = new ServiceImpl();
		service.defaultMethod1();
		service.defaultMethod2();
		
		System.out.println();
		
		//클래스명.메소드 => staitc은 객체 생성없이 사용가능
		Service.staticMethod1();
		Service.staticMethod2();
	}

}
