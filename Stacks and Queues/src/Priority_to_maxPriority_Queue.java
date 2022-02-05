import java.util.*;
public class Priority_to_maxPriority_Queue {

	 public static void main(String args[])
	    {
		 Scanner sc = new Scanner(System.in);
	       PriorityQueue<Integer> pq = new PriorityQueue<>();
	       int n  = sc.nextInt();
	        for(int i =0;i<n;i++) {
	        	int temp = sc.nextInt();
	        	pq.add(temp);
	        }
	  
	        System.out.println(pq);
	        Integer val = null;
	        while((val =pq.poll()) != null){
	        	System.out.print(val+" ");
	        } 
	        System.out.print("\n");
	    }

}
