package core;

import java.util.Calendar;
import java.util.Date;

public class Log {


	private Date timestamp;
	private int clientId;
	private String description;
	private float amount;




	public Log(long timestamp, int clientId, String description, float amount) {

		this.timestamp = new Date(timestamp);
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;

	}



	public String getData(){
		Calendar c = Calendar.getInstance();
		c.setTime(this.timestamp);
		//return this.timestamp + ": id: " + this.clientId + ", " + this.description + ", amount: " + this.amount;
		return String.format("'%d-%d-%d', %3d, \"%s\", %7.2f", c.get(1), c.get(4), c.get(5), this.clientId,this.description,this.amount);
	}


	@Override
	public String toString() {
		Calendar c = Calendar.getInstance();
		c.setTime(this.timestamp);
		//return this.timestamp + ": id: " + this.clientId + ", " + this.description + ", amount: " + this.amount;
		return String.format("'%d-%d-%d', %3d, \"%s\", %7.2f", c.get(1), c.get(4), c.get(5), this.clientId,this.description,this.amount);
	}



}
