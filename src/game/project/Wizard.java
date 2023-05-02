package game.project;

public class Wizard extends Human {
	
	public Wizard(String humanName, int humanID , String typeName) {
		super(humanName,humanID,typeName);
		
		super.type = "Wizard";
		super.power = 30;
		super.weapon = 30;
	}

	@Override
	public int powerUp(int num) {
		overpower = (num * power) + weapon;
		return overpower;
	}
}
