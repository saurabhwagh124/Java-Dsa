import java.util.*;

class ParenthesisChecker{

	boolean validParen(String str){
	
		Stack s = new Stack();
		for(int i=0;i<str.length();i++){
		
			char ch = str.charAt(i);

			if(ch == '{' || ch == '[' || ch == '('){
			
				s.push(ch);
			}else{
			
				if(!s.empty()){
				
					char x = (char)s.peek();

					if((x == '[' && ch == ']')|| (x == '{' && ch == '}') || (x == '(' && ch == ')')){
					
						s.pop();
					}else{
					
						return false;
					}
				}
			}
		}
				if(s.empty()){
				
					return true;
				}else{
				
					return false;
				}	
	}
}


class Client{

	public static void main(String [] sau){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression");
		String str = sc.next();
		ParenthesisChecker obj = new ParenthesisChecker();
		boolean ret = obj.validParen(str);
		if(ret)
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}
}
