
public class Char_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) { 
			int alphabet = 65;
			for (int j = 5; j > i; j--){
				System.out.print(" ");
				}
			for (int k = 0; k <= i; k++)
			{
				System.out.print((char) (alphabet + k) + " ");
				}
			System.out.println();
				}
		}
	}


























