//Reversing the first K elements of a Queue
import java.util.*;
public class Queue_Reverse_First_K_Elements {
 static Queue<Integer> q;
 public void reverseKelements(Queue<Integer> q,int k){
     if (q.isEmpty() == true
         || k > q.size())
         return;
     if (k <= 0)
         return;
         
         // Push the first K elements into a Stack
     Stack<Integer> st = new Stack<>();
     for(int i=0;i<k;i++){
         st.push(q.peek());
         q.remove();
     }
     
     // Enqueue the contents of stack
		// at the back of the queue
     while (!st.empty()) {
         q.add(st.peek());
         st.pop();
     }
     
     
     		// Remove the remaining elements and enqueue
		// them at the end of the Queue
     for (int i = 0; i < q.size() - k; i++) {
         q.add(q.peek());
         q.remove();
     }
     System.out.println(q);
 }
 
 public static void main(String args[]) {
   q = new LinkedList<Integer>();
   q.add(20);
   q.add(89);
   q.add(39);
   q.add(30);
   q.add(10);

   System.out.println("Original Queue");
   System.out.println(q);
   Queue_Reverse_First_K_Elements ob = new Queue_Reverse_First_K_Elements();
   int k = 3;
   System.out.println("Reversed first "+k+" elements in Queue ");
   ob.reverseKelements(q,k);
 }
}
