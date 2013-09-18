package core;

public class Consumer implements Runnable{
	private Stack stack;
	
	public Consumer(Stack stack){
		this.stack = stack;
	}
	
	@Override
	public void run() {
		//String name = Thread.currentThread().getName();
		for (int i = 0 ; i < 20 ; i++) {
			//System.out.println(name + ": starting to retrieve a number from the stack");
			stack.pop();
			//System.out.println(name + ": number successfully retrieved (" + stack.pop() + ")");
			try {Thread.sleep((int)(Math.random()*1000)); } catch (InterruptedException e) { }
		}
	}
}
