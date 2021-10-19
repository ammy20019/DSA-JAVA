import java.util.Scanner;
public class Numbers_increasing {

    public static void printIncreasing(int n){
        //Base case if 0 then no need to print
        if (n == 0)
          return;

       

        //Recursive call 
        printIncreasing(n - 1);
        //printing elemnt
        System.out.println(n);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreasing(n); 
	}

}
