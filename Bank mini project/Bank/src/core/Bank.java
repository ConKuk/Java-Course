package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {

	private float balance;
	private ArrayList<Client> clients;
	private Logger logService;
	
	private static Bank instance;


	private Bank(){
		
		logService = new Logger("com.mysql.jdbc.Driver");
		
		if ( !load() ){
			System.out.println("Creating an empty clients list since the data could not be loaded.");
			clients = new ArrayList<Client>(); 
		}
		startAccountUpdater();
	}

	/**
	 *  @return - An instance of the bank class.
	 */
	public static Bank getInstance(){
		if (instance == null) {
			instance = new Bank();
		}
		return instance;
	}

	/**
	 *  @return - The total money in the bank.
	 */
	public float getBalance(){
		return this.balance;
	}


	// Inner function to set the balance of the bank.
	private synchronized void setBalance( float newBalance ){
		this.balance = newBalance;
	}

	// Inner function called to update the bank balance.
	private synchronized void updateBalance(){
		float total = 0.0f;

		for (Client c : clients){
			total+= c.getFortune();
		}

		setBalance(total);
	}

	/**
	 * The function scans the client array of the bank for a free slot to insert the client passed to it. 
	 * @param nClient - New client to be added to the bank.
	 */
	public synchronized void addClient( Client nClient ){

		clients.add(nClient);
		Logger.log( new Log(System.currentTimeMillis(), nClient.getId(), "A client was added to the bank", nClient.getFortune() ) );
		updateBalance();
	}

	/**
	 *  Removes a given client from the bank array if one exists.
	 * @param clientToRemove - The client to be removed
	 */
	public synchronized void removeClient(Client clientToRemove) {

		if (clients.remove(clientToRemove)){
			Logger.log(new Log(System.currentTimeMillis(), clientToRemove.getId() , "The client was removed from the bank", clientToRemove.getFortune()));
			updateBalance();
			return;
		}
		System.out.println("No client with such id exists in the bank!!!");
	}


	/**
	 * 
	 * @return - The client array stored within the bank.
	 */
	public synchronized ArrayList<Client> getClients(){
		return this.clients;
	}

	public void viewLogs(){
		// TODO	
	}

	private synchronized void startAccountUpdater(){
		Thread t = new Thread( new AutoUpdater(clients) ) ;
		t.setDaemon(true);
		t.start();
		}

	/**
	 * Prints out a list of the clients through they're toString
	 */
	public synchronized void printClientList(){
		for(Client c : clients){
			System.out.println(c);
		}
	}

	
	public synchronized void store(){
		
		try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("bank.data")) ) {
			oStream.writeObject(clients);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println( e.getMessage() + ": Couldn't store the data in bank.data!" );
		} 
	}
	
	@SuppressWarnings("unchecked")
	public synchronized boolean load() {
		
		try ( ObjectInputStream oStream = new ObjectInputStream(new FileInputStream("bank.data")) ) {
			List<Client> tempList = Collections.checkedList( (List<Client>)oStream.readObject() , Client.class );
			this.clients = new ArrayList<Client>(tempList);
			return true;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println( e.getMessage() + ": Couldn't load data from bank.data" );
			return false;
		}
	}
}
