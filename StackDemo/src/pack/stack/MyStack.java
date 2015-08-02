package pack.stack;

public class MyStack {
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public MyStack(int s) {
		this.maxSize = s;
		this.stackArray = new int[this.maxSize];
		this.top = -1;
	}
	
	public void push(int value) {
		stackArray[++top] = value;
	}
	
	public int pop() {
		return stackArray[top--];		
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
}
