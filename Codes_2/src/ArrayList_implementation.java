/* In array list we can increase or decrease the size  */


import java.util.*;
public class ArrayList_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list+" -> "+list.size());
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list+" -> "+list.size());
		
		list.add(1,1000);
		System.out.println(list+" -> "+list.size());
		
		int val = list.get(1);  //not list[1]
		System.out.println(val);
		
		list.set(1, 2000); //not list[1] =2000
		System.out.println(list+" -> " +list.size());
		
		list.remove(1);
		System.out.println(list+" -> " +list.size());
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("hello");
		l2.add("yello");
		System.out.println(l2+" -> " +l2.size());
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		for(int val1: list) {
			System.out.println(val1);
		}
		
		System.out.println(list);
	}
}
