import java.util.*;
public class basicQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q
		= new PriorityQueue<Integer>();

	// Add numbers to end of Queue
	Q.offer(20);
	Q.offer(8);
	Q.offer(18);
	Q.offer(31);
	Q.add(42);
	Q.add(46);
	Q.add(30);

	// print queue
	System.out.println("Queue: " + Q);

	// print head
	System.out.println("Queue's head: " + Q.peek());
	}

}
