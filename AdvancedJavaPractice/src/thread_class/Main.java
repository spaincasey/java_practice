package thread_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.activeCount());
		
		ThreadExample thread1 = new ThreadExample();
		thread1.setName("My first thread");
		thread1.start();
		System.out.println(Thread.activeCount());
		
		ThreadExample thread2 = new ThreadExample();
		thread2.setName("My second thread");
		thread2.start();
		System.out.println(Thread.activeCount());


	}

}
