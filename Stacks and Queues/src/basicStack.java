import java.util.Stack;

public class basicStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st =new Stack<>();
		
		st.push(908);
		System.out.println(st+"->"+st.peek()+"->"+st.size());
		
		st.push(909);
		System.out.println(st+"->"+st.peek()+"->"+st.size());
		
		st.push(326);
		System.out.println(st+"->"+st.peek()+"->"+st.size());
		
		st.push(320);
		System.out.println(st+"->"+st.peek()+"->"+st.size());
		
		st.push(319);
		System.out.println(st+"->"+st.peek()+"->"+st.size());
		
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st+"->"+st.peek()+"->"+st.size());
		st.pop();
		st.pop();
		System.out.println(st+"->"+st.size());
		//System.out.println(st+"->"+st.peek());
	}

}
