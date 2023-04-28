package ch07.sec06.package2;

import ch07.sec06.package1.*;

//패키지가 달라도 임포트하면 상속은 가능하다.
public class D extends A{
	
	//생성자 
	public D() {
		//부모클래스의 생성자를 호출한다
		super();
	}
	
	public void method1() {
		//부모클래스의 필드를 바꾼다.
		this.field = "value";
		
		//부모클래스의 메소드를 호출한다
		this.method();
		
		//protected로 인해 상속관계일때 접근 가능하기 때문
	}
	
	public void method2() {
		//protected를 생성자에 사용하면 직접 객체를 생성해서 사용하는것은 불가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
