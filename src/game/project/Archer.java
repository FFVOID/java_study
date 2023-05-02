package game.project;

public class Archer extends Human {
	
	public Archer(String humanName, int humanID ,String typeName) {
		super(humanName,humanID,typeName);
		
		super.type = "Archer";
		super.power = 15;
		super.defense = 10;
	}

	@Override
	public int powerUp(int num) {
		overpower = (num * power) + defense;
		return overpower;
	}
}
