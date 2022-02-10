import java.util.*;
import java.io.*;
public class Stack_Using_Array {
	int size;
	int arr[];
	int top;
	
	Stack_Using_Array(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int ele) {
		if(!isFull()) {
			top++;
			arr[top] = ele;
			System.out.println("Pushed element "+ ele);
		} else {
			System.out.print("Stack is full!");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnedTop= top;
			top--;
			System.out.println("Popped Element :" + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(this.isEmpty())
			return arr[top];
			else {
				System.out.println("Stack is empty!");
				return -1;
			}
			
		}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (size-1 == top);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
		
		Stack_Using_Array StackCustom = new Stack_Using_Array(10);
        StackCustom.pop();
        System.out.println("=================");
        StackCustom.push(10);
        StackCustom.push(30);
        StackCustom.push(50);
        StackCustom.push(40);
        System.out.println("=================");
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.pop();
        System.out.println("=================");
		
		

	}

}
