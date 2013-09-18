package core;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Client implements Serializable{

	private int id;
	private String name;
	private float balance;
	private ArrayList<Account> accounts;
	protected float commisionRate;
	protected float interestRate;


	public Client(int id, String name, float balance){
		this.id = id;
		this.name = name;
		this.balance = balance;

		accounts = new ArrayList<Account>();
	}


	public synchronized String getName() {
		return this.name;
	}


	public synchronized void setName(String newName) {
		this.name = newName;
	}


	public synchronized float getBalance() {
		return this.balance;
	}


	public synchronized void setBalance(float balance) {
		this.balance = balance;
	}


	public int getId() {
		return this.id;
	}


	public synchronized ArrayList<Account> getAccounts() {
		return this.accounts;
	}
	/**
	 * Adds a given account to the client 
	 * @param acc - the account to add
	 */
	public synchronized void addAccount(Account acc){

				accounts.add(acc);
				Logger.log(new Log(System.currentTimeMillis(), this.id, " an account was added", acc.getBalance()));
	}


	/**
	 * Returns an account corresponding to a given index
	 * @param index
	 * @return Account
	 */
	public synchronized Account getAccount(int index) {
		try {
		return this.accounts.get(index);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * Removes an account from the client accounts array.
	 * @param accToRemove
	 */
	public synchronized void removeAccount(Account accToRemove){

			if ( accounts.remove(accToRemove) ) {
				Logger.log(new Log(System.currentTimeMillis(), this.id, "Account removed from this client", accToRemove.getBalance()));
				this.balance+=accToRemove.getBalance();
				return;
			}
		System.out.println("No account with this id exists!!!");
	}


	/**
	 * Add funds to the balance of the client
	 * @param depo
	 */
	public synchronized void deposit(float depo){
		this.balance+= (depo - depo*this.commisionRate);
	}


	/**
	 * Withdraw funds from the clients balance
	 * @param float withdraw - the amount to withdraw
	 * @throws WithdrawException 
	 */
	public void withdraw(float withdraw) throws WithdrawException{
		if (this.balance - (withdraw + withdraw*this.commisionRate) > 0){
			this.balance-= (withdraw + withdraw*this.commisionRate);
			return;
		}
		throw new WithdrawException("No enough money to withdraw", this.id, this.balance, withdraw);
	}


	/**
	 * Goes over all the accounts associated with this client and updates their 
	 * balance using the interest rate for the given client
	 */
	public synchronized void autoUpdateAccounts() {
		float interest;
		float total = 0;
		for ( Account acc : this.accounts ){
				interest = acc.getBalance()*this.interestRate;
				total+= interest;
				acc.setBalance(acc.getBalance() + interest);
		}

		Logger.log(new Log(System.currentTimeMillis(), this.id, "All the accounts associated with this client were updated with the corresponding interest", total));

	}
	/**
	 * Used to get the total fortune of the client, a sum of his balance and and the balance of all of his accounts 
	 * @return float - the clients fortune
	 */
	public synchronized float getFortune(){
		float total = 0;
		total+=this.balance;

		for( Account acc : this.accounts ) {
			total+=acc.getBalance();
		}

		return total;
	}

	/**
	 * An override of the equals method, compares using the Id of the clients 
	 */
	@Override
	public synchronized boolean equals(Object obj) {
		if (obj instanceof Client &&
				this.id == ((Client)obj).getId()){
			return true;
		}


		return false;
	}

	
	public synchronized void printAccounts() {
		for (Account acc: accounts) {
			System.out.println(acc);
		}
	}
}
