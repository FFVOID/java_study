package game.project;

public class Archer extends Human {
	
	public Archer(String humanName, int humanID ,String typeName) {
		super(humanName,humanID,typeName);
		
		super.type = "Archer";
		super.power = 10;
		super.weapon = 10;
	}

	@Override
	public int powerUp(int num) {
		overpower = (num * power) + weapon * 2 ;
		return overpower;
	}
}
