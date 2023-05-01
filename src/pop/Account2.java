package pop;

public class Account2 {

	/*22. 은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있습니다. balance 필드는
	음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있습니다. 외부에서 balance 필드를 마음대로
	변경하지 못하도록 하고, 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Account 클래
	스를 작성해보세요.

	➊ Setter와 Getter를 이용
	➋ 0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
	➌ Setter의 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지*/
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && MAX_BALANCE >= balance) {
		this.balance = balance;
	} else {
		
	
	}
}
}
