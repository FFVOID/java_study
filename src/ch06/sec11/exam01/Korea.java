package ch06.sec11.exam01;

public class Korea {
	
	//인스턴스 final 필드: 값을 변경할 수 없다.
	final String nation = "대한민국"; // 초기값을 넣어줘야함
	final String ssn;
	
	//인스턴스 필드
	String name;
	
	//생성자
	public Korea(String ssn , String name) {
		this.ssn = ssn;  // 생성자를 이용해 final에 초기값 선언 가능 방법이2가지
		this.name = name;
	}
}
