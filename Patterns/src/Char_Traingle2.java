
public class Char_Traingle2 {
 public static void main(String args[]) {
	 int n=5;
	 int alphabet =65;
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print((char) alphabet + " ");
		 }
		 alphabet++;
		 System.out.println();
	 }
 }
}
