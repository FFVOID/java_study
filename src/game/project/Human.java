package game.project;

public class Human {
	
	protected String humanName;
	protected int humanID;
	protected String type;
	protected String typeName;
	int power;
	int overpower;
	int weapon;
	
	//생성자
	public Human() {
		initHuman();
	}
	
	public Human(String humanName, int humanID , String typeName) {
		this.humanName = humanName;
		this.humanID = humanID;
		this.typeName = typeName;
		
		initHuman();
	}
	
	
	private void initHuman() {
		type = "human";
		power = 1;
		weapon = 1;
	}
	
	public int powerUp(int num) {
		overpower = num + power + weapon;
		return overpower;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanID() {
		return humanID;
	}

	public void setHumanID(int humanID) {
		this.humanID = humanID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
	
	
}
