package pop;

public class HumanExample {

	public static void main(String[] args) {

		Human man = new Human();

		man.todayweight(70);

		man.runnig(50);

		if (man.weight > 130) {
			System.out.println("몸무게가 높습니다");
		} else if (man.weight < 30) {
			System.out.println("몸무게가 낮습니다");
		}

	}

}
