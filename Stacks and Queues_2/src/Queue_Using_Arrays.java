
public class Queue_Using_Arrays {
    private int arr[], capacity, rear, front, count; //count for current size of the queue
    
    Queue_Using_Arrays(int size){
        arr=new int[size];
        capacity=size;
        front=0;
        rear=-1;
        count=0;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return -1;
        }
        
        int x = arr[front];
        System.out.println("Removing "+x);
        front = (front+1)%capacity;
        count--;
        return x;
    }
    
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue Overflow!");
            
        } else{
            System.out.println("Inserting "+item);
            rear = (rear+1)%capacity;
            arr[rear]=item;
            count++;
        }
    }
    
     public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue Underflow!!");
            System.exit(-1);
        }
        return arr[front];
    }
 
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }
 
    public boolean isFull() {
        return (size() == capacity);
    }
    
    public static void main(String args[]) {
    	Queue_Using_Arrays q = new Queue_Using_Arrays(5);
 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
 
        System.out.println("The front element is " + q.peek());
        q.dequeue();
        System.out.println("The front element is " + q.peek());
 
        System.out.println("The queue size is " + q.size());
 
        q.dequeue();
        q.dequeue();
        q.peek();
    }
}
