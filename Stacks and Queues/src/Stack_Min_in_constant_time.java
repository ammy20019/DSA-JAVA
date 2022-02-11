import java.util.*;
public class Stack_Min_in_constant_time {
    private Stack<Integer> aux = new Stack<>();
    private Stack<Integer> st = new Stack<>();
    
    public void push(int element){
        st.push(element);
        if(aux.isEmpty()){
            aux.push(element);
        }
        
        if(st.peek() < aux.peek()){
            aux.push(element);
        }
    }
    
    public void pop(){
        
        if(st.peek() == aux.peek()){
            st.pop();
            aux.pop();
        }
    }
    
    public void display(){
        System.out.println("Orgiginal stack: "+st);
        System.out.println("Auxiliary stack: "+aux);
    }
    
    
    public int getMin(){
        if(!st.isEmpty())
        return aux.peek();
        else
        return -1;
        
    }

    public static void main(String args[]) {
      
      
    	Stack_Min_in_constant_time ob = new Stack_Min_in_constant_time();
      ob.push(30);
      ob.push(48);
      ob.push(14);
      ob.push(56);
      ob.push(20);
      ob.display();
      
      System.out.println("Minimum element is: "+ob.getMin());
      ob.pop();
      ob.pop();
      ob.push(5);
      ob.display();
      System.out.println("Minimum element is: "+ob.getMin());
     
    }
}
