package game.project;

import java.util.ArrayList;

public class HumanExample {

	private static ArrayList<Human> humanList = new ArrayList<Human>();

	public static void main(String[] args) {
		Human Human1 = new Warrior("홍길동", 1000, "전사");
		Human Human2 = new Archer("이길동", 1001, "궁수");
		Human Human3 = new Archer("김길동", 1002, "궁수");
		Human Human4 = new Thief("박길동", 1003, "도적");

		humanList.add(Human1);
		humanList.add(Human2);
		humanList.add(Human3);
		humanList.add(Human4);

		//Human human = findHuman(1000);
		Human human = findHuman(1003);

		if (human == null) {
			System.out.println("====== 경고 =======");
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			status(human, 20);
			System.out.println();
			typeUpgrade(human);
		} 
		
		System.out.println();
		
		if (human == null) {
			System.out.println("존재하지 않는 회원");
		} else {
			upgrade(human, 20);
			System.out.println();
			hunt(human);
		} 
		
		
	}

	public static Human findHuman(int humanID) {
		Human resultHuman = null;
		for (Human human : humanList) {

			if (human.getHumanID() == humanID) {
				resultHuman = human;
				break;
			}
		}

		return resultHuman;
	}

	public static void status(Human human, int num) {
		System.out.println("현재 유저아이디:" + human.getHumanID());
		int str = human.powerUp(num);
		System.out.println("타입:" + human.getTypeName() +"\t"+"공격력:" + str);

	}
	
	public static void upgrade(Human human, int num){
		System.out.println("강화");
		int str2 = human.powerUp(num * 2);
		System.out.println("성공!"+" "+ "강화된 공격력:" + str2);
		
	}
	
	public static void typeUpgrade(Human human) {
		
			int str3 = human.overpower;
			
					if(str3 > 300) {
						System.out.println("전직이 가능합니다");
					} else {
						System.out.println("전직을 위한 공격력이 부족합니다");
					}
			
		
	}
	
	public static void hunt (Human human) {
		int str4 = human.overpower;
		int dragon = 800;
		
			if(str4 > dragon) {
				System.out.println("드래곤 사냥이 가능합니다.");
			} else {
				System.out.println("드래곤 사냥이 불가능합니다.");
			}
			
	}
	
}
