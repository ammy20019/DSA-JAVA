import java.util.*;
public class Palindrome_DequeInterface {

	public static String isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

 
        for (Character c: input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();

            if (front != rear) return "NO";
        }

        return "YES";
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
        System.out.println(isPalindrome(s));

    }

}
