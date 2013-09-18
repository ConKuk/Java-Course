package core;

public class Test {	

	public static void main(String[] args) {
		
		
		
		/*Bank instBank = Bank.getInstance();
		
		Account acc1 = new Account(12, 100.0f);
		Account acc2 = new Account(13, 100.0f);
		Account acc3 = new Account(14, 100.0f);
		Account acc4 = new Account(15, 100.0f);

		Client cl1 = new RegularClient   (1, "Yossi", 1000.0f);
		Client cl2 = new GoldClient      (2, "Moty", 1000.0f);
		Client cl3 = new PlatinumClient  (3, "Nir", 1000.0f);
		
		System.out.println();
		System.out.println("Printing the client fortunes for the first time:");
		System.out.println("Regular clients fortune:  " + cl1.getFortune());
		System.out.println("Gold clients fortune:     " + cl2.getFortune());
		System.out.println("Platinum clients fortune: " + cl3.getFortune());
		System.out.println();
		
		System.out.println("Setting balances to all 4 accounts: (logs expected) ");
		acc1.setBalance(200.0f); // All these should print logs to the screen
		acc2.setBalance(200.0f); // All these should print logs to the screen
		acc3.setBalance(200.0f); // All these should print logs to the screen
		acc4.setBalance(300.0f); // All these should print logs to the screen
		
		System.out.println();
		System.out.println("Adding the accounts to respective clients: (logs expected) ");
		cl1.addAccount(acc1); // All these should print logs to the screen
		cl2.addAccount(acc2); // All these should print logs to the screen
		cl3.addAccount(acc3); // All these should print logs to the screen
		cl3.addAccount(acc4); // All these should print logs to the screen
		
		System.out.println();
		System.out.println("Printing clients fortune after adding the accounts: ");
		System.out.println("Regular clients fortune:  " + cl1.getFortune());
		System.out.println("Gold clients fortune:     " + cl2.getFortune());
		System.out.println("Platinum clients fortune: " + cl3.getFortune());
		
		System.out.println();
		System.out.println("Trying to print out the first 2 accounts of the first/regular client using getAccount(index) method: ");
		System.out.println("Should give an address: " + cl1.getAccount(0)); // Should print the address of the object in memory
		//System.out.println("Should print \"null\":    " + cl1.getAccount(1)); // Should print "null"
		cl1.printAccounts();
		
		
		System.out.println();
		System.out.println("Trying to print out the first 2 accounts of the third/platinum client using getAccount(index) method: ");
		System.out.println("Should give an address: " + cl3.getAccount(0)); // Should print the address of the object in memory
		System.out.println("Should give an address: " + cl3.getAccount(1)); // Should also print the address because the third client has 2 accounts
		cl3.printAccounts();
		cl3.removeAccount(acc3);
		cl3.printAccounts();
		
		cl1.deposit(100);
		cl2.deposit(100);
		cl3.deposit(100);
		
		System.out.println();
		System.out.println("Printing clients fortune after depositing 100: ");
		System.out.println("Regular clients fortune:  " + cl1.getFortune());
		System.out.println("Gold clients fortune:     " + cl2.getFortune());
		System.out.println("Platinum clients fortune: " + cl3.getFortune());
		
		
		try {
			cl1.withdraw(100);
		} catch (WithdrawException e) {
			e.printStackTrace();
		}
		try {
			cl2.withdraw(100);
		} catch (WithdrawException e) {
			e.printStackTrace();
		}
		try {
			cl3.withdraw(100);
		} catch (WithdrawException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Printing clients fortune after withdrawing 100: ");
		System.out.println("Regular clients fortune:  " + cl1.getFortune());
		System.out.println("Gold clients fortune:     " + cl2.getFortune());
		System.out.println("Platinum clients fortune: " + cl3.getFortune());
		
		System.out.println();
		System.out.println("Auto updating accounts: (logs expected)");
		cl1.autoUpdateAccounts();
		cl2.autoUpdateAccounts();
		cl3.autoUpdateAccounts();
		
		
		System.out.println();
		System.out.println("Printing clients fortune after autoUpdateAccounts(): ");
		System.out.println("Regular clients fortune:  " + cl1.getFortune());
		System.out.println("Gold clients fortune:     " + cl2.getFortune());
		System.out.println("Platinum clients fortune: " + cl3.getFortune());
		
		
		System.out.println();
		System.out.println("Adding the clients to the bank: (logs expected)");
		instBank.addClient(cl1);
		instBank.addClient(cl2);
		instBank.addClient(cl3);
		
		System.out.println();
		System.out.println("Printing the total banks balance:");
		System.out.printf("The total balance of the bank is: %.2f\n", instBank.getBalance());
		
		System.out.println();
		System.out.println("Printing the client list:");
		instBank.printClientList();
		
		
		System.out.println();
		System.out.println("Removing clients from the bank: (logs expected)");
		instBank.removeClient(cl1);
		instBank.removeClient(cl2);
		instBank.removeClient(cl3);
		
		System.out.println();
		System.out.println("Trying to remove and account that was already removed: (can print an error as it does in my program):");
		instBank.removeClient(cl1);
		
		System.out.println();
		System.out.println("Printing the total banks balance after removing all the clients:");
		System.out.printf("The total balance of the bank is: %.2f\n", instBank.getBalance());
		
		System.out.println();
		System.out.println("Trying to remove an account that shouldn't belong to the client: ( may print an error to the console )");
		cl1.removeAccount(acc3);
		
		System.out.println();
		System.out.println("Starting to remove accounts from clients: (logs expected)");
		cl1.removeAccount(acc1);
		cl2.removeAccount(acc2);
		cl3.removeAccount(acc3);
		cl3.removeAccount(acc4);
		
		System.out.println();
		System.out.println("Trying to remove an account that was already removed from this client: ( may print an error to the console )");
		cl1.removeAccount(acc1);
		*/

	}

}

		