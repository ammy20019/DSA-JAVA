
public class Stack_arr_min_max_element {
    int size;
    int top;
    int arr[];
    Stack_arr_min_max_element(int size){
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
    
    public void min(){
        if(!isEmpty()){
            int min = arr[0];
        for(int i=0;i<=top;i++){
                if(min>arr[i]){
                    min = arr[i];
                };
        }
        System.out.println("Minimum element is "+min);
        } else{
            System.out.println("Stack is empty! Can't find minimum element! :(");
        }
    }
    
    public void max(){
        if(!isEmpty()){
            int max = arr[0];
        for(int i=0;i<=top;i++){
                if(max<arr[i]){
                    max = arr[i];
                };
        }
        System.out.println("Maximum element is "+max);
        } else{
            System.out.println("Stack is empty! Can't find maximum element! :(");
        }
    }
    
    public static void main(String args[]) {
    	Stack_arr_min_max_element ob = new Stack_arr_min_max_element(3);
        ob.push(10);
        ob.push(90);
        ob.push(20);
        ob.display();
        ob.min();
        ob.max();
        ob.pop();ob.pop();ob.pop();
        ob.display();
        ob.min();ob.max();
      
    }
}
