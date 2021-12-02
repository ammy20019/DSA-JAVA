
public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int spaces = n;
		for (int i = 0; i < n; i++) {
			for(int s=1;s<=spaces;s++) {
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);
			}
			spaces--;
			System.out.println();
			
		}
	}

	}


