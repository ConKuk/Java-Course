package core;

public class RegularClient extends Client{
	
	
	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commisionRate = 0.03f;
		this.interestRate = 0.001f;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ": regular client.";
	}
	
	

}
