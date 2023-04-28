package ch07.sec07.exam01;

public class Child extends Parent {
	public int childField;

	@Override
	public void method2() {
		System.out.println("child-method2()");
	}

	public void method3() {
		System.out.println("child-method3()");
	}

}
