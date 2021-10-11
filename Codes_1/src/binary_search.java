
public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,70,80,90,100,110,120};
		
		int l=0;
		int h = arr.length-1;
		int data = 100;
		while(l<=h) {
			int m = (l+h)/2;
			if(data>arr[m]) {
				l=m+1;
			} else if(data<arr[m]) {
				h=m-1;
			} else {
				System.out.println(m);
				return;
			}
		}
		System.out.println(-1); //not found
	}

}
