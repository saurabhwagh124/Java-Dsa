import java.util.*;
class StackDemo{

	public static void main(String [] sau){
	
		Stack<Integer> st = new Stack<Integer> ();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		System.out.println(st);

		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.empty());
		System.out.println(st.size());
		System.out.println(st);

	}
}
