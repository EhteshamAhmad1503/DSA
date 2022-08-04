package Collection_Framework;

import java.util.*;

public class LearnQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(15);
		queue.offer(20);
		queue.offer(25);
		queue.offer(30);

		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());

	}
}
