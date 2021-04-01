package lambdaexample;

import functionalinterfaceexample.GreetingMessage;

public class Main {

	public static void main(String[] args) {
		
		// WITHOUT LAMBDAS
		GreetingMessage gm = new GreetingMessage() {

			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
				
			}
			
		};
		gm.greet("Casey");
		
		
		// WITH LAMBDAS 
		GreetingMessage gm2 = (String name) -> {
			System.out.println("Hello " + name);
		};
		gm2.greet("Casey");
		
		MessagePrinter mp = () -> {
			System.out.println("This is a message");
		};
		mp.printMessage();
	}

}
