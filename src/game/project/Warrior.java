package game.project;

public class Warrior extends Human{
	
	public Warrior(String humanName, int humanID ,String typeName) {
		super(humanName,humanID,typeName);
		
		super.type = "Warrior";
		super.power = 10;
		super.defense = 50;
		
	}

	@Override
	public int powerUp(int num) {
		overpower = (num * power) + defense;
		return overpower;
	}
	
	
}
