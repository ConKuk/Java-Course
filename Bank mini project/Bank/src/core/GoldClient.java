package core;

public class GoldClient extends Client {
	
	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commisionRate = 0.02f;
		this.interestRate = 0.003f;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ": gold client.";
	}
	
}
