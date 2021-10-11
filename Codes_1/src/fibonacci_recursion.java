import java.util.*;
  
  public class fibonacci_recursion{
       static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
  
        // Print the first N numbers
        for (int i = 0; i < n; i++) {
  
            System.out.println(fib(i));
        }
   }
  }