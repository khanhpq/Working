package pack.thread;

public class Producer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 10; i > 5; i--) {
			System.out.println("Hello, I'm a thread Runable: " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread Runable stopped");
	}

	public void start() {
		
	}
	
}
