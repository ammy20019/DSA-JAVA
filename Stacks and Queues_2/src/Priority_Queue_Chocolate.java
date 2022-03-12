import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Priority_Queue_Chocolate
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> piles = new PriorityQueue<Integer>(Collections.reverseOrder());
        piles.add(4);
        piles.add(16);
        piles.add(9);
        piles.add(100);
        piles.add(49);
        System.out.println(piles);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nth day : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n ;i++)
        {
            int max = piles.poll();
            piles.add((int) Math.sqrt(max));
            System.out.println(piles);
        }

        int sum = 0;
        for(int i : piles)
        {
            sum = sum + i;
        }
        System.out.println("Max chocolate at the end of "+n+" days is "+sum);
    }
}