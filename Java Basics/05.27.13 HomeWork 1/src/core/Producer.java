package core;

public class Producer implements Runnable {

	private Stack stack;
	
	public Producer(Stack stack){
		this.stack = stack;
	}
	
	@Override
	public void run() {
		//String name = Thread.currentThread().getName();
		for (int i = 0 ; i < 20 ; i++) {
			int a = (int)(Math.random()*1000);
			//System.out.println(name + ": starting to add a new number to the stack (" + a + ")");
			stack.push(a);
			//System.out.println(name + ": number successfully added (" + a + ")");
			try {Thread.sleep((int)(Math.random()*1000)); } catch (InterruptedException e) { }
		}
	}

}
