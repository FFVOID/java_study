package ch07.sec10.exam01;

/*
 1.오로지 상속을 하기위해 만들어진클래스(부모클래스)
 2.완전하지 않은 클래스 -> 추상메소드를 가져서   
//abstract = 추상클래스 
 */
public abstract class Phone {
	//필드
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
	
	
}
