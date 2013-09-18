package core;

public class Player {

	private String name;
	private int luckNum;
	
	public Player(String name){
		this.name = name;
	}
	
	public int getNum(){
		return (int)(Math.random()*101);
	}
	
	public void setLuckNum(){
		this.luckNum = getNum();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLuckNum() {
		return this.luckNum;
	}
}
