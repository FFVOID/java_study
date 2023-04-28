package ch06.sec13.exam01.package2;

import ch06.sec13.exam01.package1.*;

public class C {
	A a = new A(); // default상태라 같은패키지 안에서만 접근가능(C랑다른패키지)
	B b = new B(); // public상태라 패키지랑 상관없이 어디든 접근가능
}
