package ch05.sec06;

public class AraayCreateByVaueListExample {

	public static void main(String[] args) {
		
		//1.배열타입, 초기데이터랑 같이 선언
		String[] season = {"봄","여름","가을","겨울"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "summer";
		System.out.println(season[1]);
		
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		
		System.out.println("==========================");
		
		int[] scores = {83,90,87};
		int sum = 0;
		
		//총합과 평균 구하기
		for(int i = 0; i<scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i]; // sum = sum + i;
		}
		
		System.out.println("총합:" + sum);
		
		double avg = (double)sum /3;
		
		System.out.println("평균 : "+ avg);
		
		
		//2.배열타입, 배열의 크기만 선언
		//String[] season2 = new String[4];
		
		//3.배열타입, 초기데이터랑 같이 선언
		//String[] season3 = new String[] {"봄","여름","가을","겨울"};
		
		//주의 사항
		//String[] season4;
		//season4 = {"봄","여름","가을","겨울"}; 불가능
		//season4 = new String[4]; 가능
		//season4 = new String[] {"봄","여름","가을","겨울"}; 가능
		
	}

}
