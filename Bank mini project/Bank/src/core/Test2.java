package core;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		
		Bank bank = Bank.getInstance();
		
/*		Account acc1 = new Account(12, 100.0f);
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
		
		System.out.println("Adding the clients to the bank: (logs expected)");
		bank.addClient(cl1);
		bank.addClient(cl2);
		bank.addClient(cl3);
		*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Log> testLog = Logger.getLogs();
		System.out.println(testLog);
		
		System.out.println("Done!");
		bank.store();
	}

}
