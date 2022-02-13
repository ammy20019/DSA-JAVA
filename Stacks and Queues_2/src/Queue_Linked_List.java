import java.util.LinkedList;
import java.util.Queue;
 
class Queue_Linked_List
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();
 
        queue.add("A");    
        queue.add("M");     
        queue.add("I");
        queue.add("T");

        System.out.println("The front element is " + queue.peek());
 
        queue.remove();    
        queue.remove(); 
        queue.remove();

        System.out.println("The front element is " + queue.peek());
 

        System.out.println("The queue size is " + queue.size());
        queue.remove();

        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}