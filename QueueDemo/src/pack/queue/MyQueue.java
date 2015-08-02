package pack.queue;

public class MyQueue {
	private int maxSize, currentSize;
	private int[] queueArray;
	private int front, tail;
	
	public MyQueue(int maxSize){
		this.maxSize = maxSize;
		this.queueArray = new int[this.maxSize];
		makeEmpty();
	}
	
	private int increment(int x) {
		if(++x == queueArray.length) {
			x = 0;
		}
		return x;
	}
	
	public void makeEmpty() {
		this.currentSize = 0;
		this.front = 0;
		this.tail = -1;
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean isFull() {
		return currentSize == queueArray.length;
	}	
	
	public int getFront() {
		if(isEmpty()) {
			return (Integer) null;
		}
		return queueArray[front];
	}
	
	// return item add to queue
	public int dequeue() {
		if(isEmpty()) {
			return (Integer) null;
		}
		currentSize--;
		int frontItem = queueArray[front];
		queueArray[front] = (Integer) null;
		front = increment(front);
		return frontItem;
	}
	
	// return size of queue
	public int enqueue(int x) {
		if(isFull()) return maxSize;
		tail = increment(tail);
		queueArray[tail] = x;
		return currentSize;
	}
	
}
