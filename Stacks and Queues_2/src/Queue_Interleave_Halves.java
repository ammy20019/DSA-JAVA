// Interleave first half and second half of queue
import java.util.*;
public class Queue_Interleave_Halves {
    static Queue<Integer> q;
    
    public void QtoS(Queue<Integer> q){
        int size = q.size();
        Stack<Integer> st = new Stack<>();
        System.out.println("First half to stack || 2nd half in queue only");
        for(int i=0;i<=q.size()/2;i++){
            int ele = q.peek();
            st.push(ele);
            q.remove();
        }
        System.out.println("Stack "+ st);
        System.out.println("Queue " +q);
        
        System.out.println("Queue to Stack");
        for(int i=st.size();i>0;i--){
            int ele=st.peek();
            q.add(ele);
            st.pop();
        }
        System.out.println("Stack "+ st);
        System.out.println("Queue " +q);
        
        System.out.println("Enqueue & Dequeue first half of the queue :");
        for(int i=0;i<q.size()/2;i++){
            int ele = q.peek();
            q.remove();
            q.add(ele);
        }
        System.out.println("Queue " +q);
        
        System.out.println("Half of the elements to the stack and half to queue");
        for(int i=0;i<=q.size()/2;i++){
            int ele = q.peek();
            q.remove();
            st.push(ele);
        }
        System.out.println("Stack "+ st);
        System.out.println("Queue " +q);
        
        System.out.println("Finally the output is now :");
        for(int i=0;i<size/2;i++){
            System.out.print(st.peek());
            st.pop();
            System.out.print(q.peek());
            q.remove();
        }
    }
    
    public static void main(String args[]) {
      q = new LinkedList<Integer>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
    //   q.add(7);
    //   q.add(10);

      Queue_Interleave_Halves ob = new Queue_Interleave_Halves();
      System.out.println("Original Queue");
      System.out.println(q);
      ob.QtoS(q);
    }
}