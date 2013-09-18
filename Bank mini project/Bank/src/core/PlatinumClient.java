package core;

public class PlatinumClient extends Client {
	
	
	public PlatinumClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commisionRate = 0.01f;
		this.interestRate = 0.005f;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ": platinum client.";
	}
	
}
