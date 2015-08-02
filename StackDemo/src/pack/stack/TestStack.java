package pack.stack;

public class TestStack {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		int i = 0;
		int value;
		
		while(!stack.isFull()) {
			stack.push(++i);
			System.out.println("Push: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(!stack.isEmpty()) {
			value = stack.pop();
			System.out.println("Pop: " + value);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
