package game.project;

public class Thief extends Human {	
	public Thief(String humanName, int humanID , String typeName) {
		super(humanName,humanID,typeName);
		
		super.type = "Thief";
		super.power = 20;
		super.weapon = 10;
	}

	@Override
	public int powerUp(int num) {
		overpower = (num * power) + weapon * 5;
		return overpower;
	}

}
