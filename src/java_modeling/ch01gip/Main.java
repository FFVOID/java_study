package java_modeling.ch01gip;

public class Main {

	public static void main(String[] args) {
		//합성관계
		//컴퓨터만 생성해도 컴퓨터 부품들이 다 생성된다.
		
		//컴퓨터가 사라지면 컴퓨터 부품들도 다 사라진다.
		Computer c = new Computer();
		c = null;
		
		//2.집약관계 부품을 따로 생산한다
		MainBoard mb = new MainBoard();
		CPU cpu = new CPU();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
		
		//컴퓨터가 사라져도 부품은 살아있다.
		Computer2 c2 = new Computer2(mb,cpu,m,ps);
		c2 = null;
	}

}
