
public class first_last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 10, 10, 10, 10, 10, 42, 55};
		
		int l=0;
		int h = arr.length-1;
		int fi =-1;
		
		int data = 10;
		while(l<=h) {
			int m = (l+h)/2;
			if(data>arr[m]) {
				l=m+1;
				
			} else if(data<arr[m]) {
				h=m-1;
				
			} else {
				fi=m;
				h=m-1;
			}
		}
		System.out.println(fi);
		
		
		l=0;
		h = arr.length-1;
		int li =-1;
		
		while(l<=h) {
			int m = (l+h)/2;
			if(data>arr[m]) {
				l=m+1;
				
			} else if(data<arr[m]) {
				h=m-1;
				
			} else {
				li=m;
				l=m+1;
			}
		}
		
		System.out.println(li);
		
	}

}
