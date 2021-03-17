package queueexample;

import java.util.LinkedList;

public class Store {

	public static void main(String[] args) {
		
		LinkedList<Customer> queue = new LinkedList();
		queue.add(new Customer("Sally"));
		queue.add(new Customer("Ben"));
		queue.add(new Customer("Emma"));
		queue.add(new Customer("Fred"));
		System.out.println(queue);
		serveCustomer(queue);
		System.out.println(queue);
		
	}
	
	static void serveCustomer(LinkedList<Customer> queue) {
		
		// poll: creates a customer object with first customer on queue and removes that customer from the queue
		Customer c = queue.poll();
		c.serve();
		
	}

}
