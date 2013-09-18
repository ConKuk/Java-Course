package core;

public class Main {

	public static void main(String[] args){
		Stack s = new Stack();

		Producer p1 = new Producer(s);
		Producer p2 = new Producer(s);
		Producer p3 = new Producer(s);
		Producer p4 = new Producer(s);

		Consumer c1 = new Consumer(s);
		Consumer c2 = new Consumer(s);
		Consumer c3 = new Consumer(s);
		Consumer c4 = new Consumer(s);

		Thread t[] = new Thread[8];
		
		 t[0] = new Thread(p1,"p1");
		 t[1] = new Thread(p2,"p2");
		 t[2] = new Thread(p3,"p3");
		 t[3] = new Thread(p4,"p4");

		 t[4] = new Thread(c1,"c1");
		 t[5] = new Thread(c2,"c2");
		 t[6] = new Thread(c3,"c3");
		 t[7] = new Thread(c4,"c4");

		for (int i = 0 ; i < t.length ; i++){
			t[i].start();
		}

		try{
			for (int i = 0 ; i < t.length ; i++){
				t[i].join();
			}			
		} catch (InterruptedException e) {}
		
		System.out.println("All done!");
		System.out.println("Check if the stack is empty, just in case: " + s.isEmpty());

	}

}
