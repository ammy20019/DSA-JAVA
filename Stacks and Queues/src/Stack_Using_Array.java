import java.util.*;
import java.io.*;
public class Stack_Using_Array {
    int size;
    int top;
    int arr[];
    Stack_Using_Array(int size){
        this.size = size;
        this.arr = new int[size];
        this.top=-1;
    }
    
    public void push(int element){
        if(!isFull()){
            top++;
            arr[top]=element;
            System.out.println("Element pushed "+ element);
        } else{
            System.out.println("Stack is Full!");
        }
    }
    
    public int pop(){
        if(!isEmpty()){
            int returnedTOP =top;
            System.out.println("Element popped "+arr[top]);
            top--;
            return arr[returnedTOP];
        } else{
            System.out.println("Stack underflow!");
            return -1;
        }
    }
    
    public int peek(){
        if(!isEmpty()){
            System.out.println("Element u r seeing right now "+arr[top]);
            return arr[top];
        } else{
            System.out.println("No element in Stack!");
            return -1;
        }
    }
    
    public void display(){
        System.out.print("Elements from bottom -> top : ");
        for(int i=0;i<=top;i++){
            if(!isEmpty()){
                System.out.print(arr[i]+" ");
            }
            
        }
        System.out.println();
    }
    
    public boolean isEmpty(){
        return (top==-1);
    }
    
    public boolean isFull(){
        return (size-1 == top);
    }
    
    public static void main(String args[]) {
        Stack_Using_Array ob = new Stack_Using_Array(3);
        ob.push(10);
        ob.push(90);
        ob.push(20);
        ob.pop();
        ob.peek();
        ob.push(50);
        ob.display();
        ob.push(293);
        ob.pop();
        ob.pop();
        ob.display();
        ob.pop();
        ob.pop();
      
    }

}
