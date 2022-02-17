
import java.util.*;
public class Queue_Reverse_using_Stack  {
    static Queue<Integer> q;
    public void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        System.out.println("Inserting in Stack transferring from Queue.........");
        while(!q.isEmpty()){
            int ele = q.peek();
            st.push(ele);
            q.remove();
        }
        System.out.println(st);
        
        System.out.println("Inserting elements from Stacks to Queues..........");
        while(!st.isEmpty()){
            int ele = st.peek();
            q.add(ele);
            st.pop();
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
      q.add(20);
      q.add(19);
      q.add(12);
      System.out.println(q);
      q.remove();
      System.out.println(q);
      q.remove();
      System.out.println("Original Queue ");
      System.out.println(q);
      Queue_Reverse_using_Stack ob = new Queue_Reverse_using_Stack ();
      System.out.println("Reversing Queue..................... ");
      ob.reverse(q);
    }
}