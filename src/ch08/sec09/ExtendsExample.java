package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		//InterfaceC가 A,B를 상속하고 있으므로 아래와 같이 사용가능
		InterfaceA ia = new  InterfaceCImpl();
		//쓸수있는 메소드는 다르다 각 인터페이스에 있는 메소드만 사용가능
		ia.methodA();
		
		InterfaceB ib = new  InterfaceCImpl();
		ib.methodB();
		
		InterfaceC ic = new  InterfaceCImpl();
		ic.methodC();
		ia.methodA();
		ib.methodB();
		
		
	}

}
