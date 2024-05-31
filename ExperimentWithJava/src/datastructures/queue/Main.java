package datastructures.queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue(7);
		queue.enqueue(0);
		queue.dequeue();
		queue.print();

	}

}
