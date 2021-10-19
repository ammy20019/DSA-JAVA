import java.util.*;
public class Numbers_decreasing {

    public static void printDecreasing(int n){
        //Base case if 0 then no need to print
        if (n == 0)
          return;

        //printing elemnt
        System.out.println(n);

        //Recursive call 
        printDecreasing(n - 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDecreasing(n); 
	}

}
