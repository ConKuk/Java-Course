package core;

import java.util.ArrayList;

public class AutoUpdater implements Runnable {

	private ArrayList<Client> clients;

	public AutoUpdater(ArrayList<Client> clients){
		this.clients = clients;
	}

	@Override
	public void run() {
		while (true) {
			for ( Client c : clients ){
				c.autoUpdateAccounts();
			}
			try {
				Thread.sleep(1000*60*60*24);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
