package ch06.sec11.exam02;

public class Earth {
	//상수필드
	//중요. 상수명은 대문자로 작성한다
	//단어가 2개 이상이면 "_" 이용
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//인스턴스 필드
	int personCount ;
	
	//정적블록으로 상수초기화, 이렇게 연산이 들어가면 블록을 이용해 묶어서 선언한다.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
