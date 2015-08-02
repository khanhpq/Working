package pack.thread;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Main: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Consumer con = new Consumer();
		con.start();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Main: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Thread pro = new Thread(new Producer());
		pro.start();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Main: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main stopped");
		
	}

}