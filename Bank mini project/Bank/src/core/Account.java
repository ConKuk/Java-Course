package core;

import java.io.Serializable;

public class Account implements Serializable{

	private int id;
	private float balance;

	public Account(int id, float balance){
		this.id = id;
		this.balance = balance;
	}

	/**
	 *  Returns the id of the current account.
	 */
	public int getId(){
		return this.id;
	}

	/**
	 *  Returns the balance in the current account.
	 */
	public float getBalance(){
		return this.balance;
	}

	/**
	 *  Used to set the balance of the current account
	 * @param newBalance - the new balance to be set.
	 */
	public void setBalance(float newBalance){
		this.balance = newBalance;

		Logger.log(new Log(System.currentTimeMillis(), this.id, " a new balance was set for this account", newBalance));
	}


	@Override
	public boolean equals(Object obj) {
		if ( obj != null &&
				obj instanceof Account && 
				this.id == ((Account)obj).getId()){
			return true;
		}

		return false;
	}
}
