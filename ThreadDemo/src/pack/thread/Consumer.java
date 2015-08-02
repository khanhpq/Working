package pack.thread;

public class Consumer extends Thread {
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello, I'm a thread Thread: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Consumer thread stopped.");
		
	}
	
}