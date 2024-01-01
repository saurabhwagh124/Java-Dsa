import java.util.*;

class ReverseString{

	String revString(String str){
	
	
		char stackArr[] = new char[str.length()];
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++){
		
			st.push(str.charAt(i));
		}
		int i = 0;
		while(!st.empty()){
		
			stackArr[i] = st.pop();
			i++;
		}
		return new String(stackArr);
	}
}

class Client{


	public static void main(String [] sau){
	
		ReverseString obj = new ReverseString();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to reverse: ");
		String str = sc.next();

		System.out.println("Reversed String:");
		System.out.println(obj.revString(str));
	}
}
