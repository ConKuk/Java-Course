package core;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<Integer> stack;
	
	
	public Stack(){
		this.stack = new ArrayList<Integer>();
	}
	
	
	public synchronized void push(int num){
		stack.add(num);
		System.out.println("Stack: a numer was added (" + num + "), by: " + Thread.currentThread().getName() );
		notify();
	}
	
	public synchronized int pop(){
		while (stack.isEmpty()){
			try { System.out.println(Thread.currentThread().getName() + ": is waiting!");wait(); } catch (InterruptedException e) { }
		}
		int a = stack.remove(stack.size()-1);
		System.out.println("Stack: a number was removed (" + a + "), by: " + Thread.currentThread().getName() );
		return a;
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
}
