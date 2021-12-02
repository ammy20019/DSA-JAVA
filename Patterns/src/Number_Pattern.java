/* floyd's triangle */
public class Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<5;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

}
