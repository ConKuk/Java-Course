package core;

public class WithdrawException extends Exception {

	private int id;
	private float currentBalance;
	private float withdrawAmount;
	
	public WithdrawException(String arg0, int id, float currentBalance, float withdrawAmount) {
		super(arg0);
		this.id = id;
		this.currentBalance = currentBalance;
		this.withdrawAmount = withdrawAmount;
	}

	public int getId() {
		return this.id;
	}

	public float getCurrentBalance() {
		return this.currentBalance;
	}

	public float getWithdrawAmount() {
		return this.withdrawAmount;
	}
	
	
	
	
}
