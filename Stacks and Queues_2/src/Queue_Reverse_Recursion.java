
//Reversing elements in Queue using recursion
import java.util.*;
public class Queue_Reverse_Recursion {
  static Queue<Integer> q;
  public Queue<Integer> reverse(Queue<Integer> q){
      if(q.isEmpty()){
          return q;
      }
      
      int data = q.peek(); //storing the front element in data
      q.remove(); //removing the front elemnt
      //calling the recursive function again
      q=reverse(q); 
      //now adding the elements to the queue
      q.add(data);
      
      return q;
  }
  
  
  public static void main(String args[]) {
    q = new LinkedList<Integer>();
    q.add(1);
    q.add(20);
    q.add(7);
    q.add(25);
    
    System.out.println(q);
    Queue_Reverse_Recursion b = new Queue_Reverse_Recursion();
    System.out.println(b.reverse(q));
    
    
  }
}