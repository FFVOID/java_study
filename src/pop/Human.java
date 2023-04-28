package pop;

public class Human {
	int weight;
	int hp = 1000;

	void todayweight(int weight) {
		this.weight = weight;

	}

	void eat(int food) {
		this.weight += food;
		System.out.println("현재몸무게:" + this.weight + "kg");

		if (0 <= hp && hp < 1000) {

			this.hp += food * 5;

		}

		if (hp >= 1000) {
			this.hp = 1000;
			System.out.println("체력이 최대입니다");

		}
		System.out.println("현재체력:" + hp);

	}

	void runnig(int km) {
		if (km * 10 <= hp) {

			if (hp > 0) {
				this.hp = hp - km * 10;
				System.out.println("현재체력:" + hp);
				this.weight = weight - km;
				System.out.println("현재몸무게:" + weight + "kg");
			}
		} else {
			System.out.println("체력이없습니다.");
		}
	}

}
