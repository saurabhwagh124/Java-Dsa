import java.util.*;

class Stack{

	int maxSize;
	int size;
	int stackArr[];
	int top = -1;

	Stack(int size){
	
		stackArr = new int[size];
		this.maxSize = size;

	}
	
	void push(int data){

		if(top==maxSize-1){
		
			System.out.println("Stack is empty");
			return;
		}else{
		
			top++;
			stackArr[top]=data;

		}
	}

	boolean empty(){
	
		if(top==-1){
		
			return true;
		}else{
		
			return false;
		}
	}

	int pop(){
	
		if(empty()){
		
			return -1;
		}else{
		
			int val = stackArr[top];
			top--;
			return val;
		}
	}

	int peek(){
	
		if(empty()){
		
			return -1;
		}else{
		
			return stackArr[top];
		}
	}

	int size(){
	
		return maxSize;
	}

	void printStack(){
	
		if(empty()){
		
			System.out.println("Stack is empty");
		}else{
		
			System.out.print("[");
			for(int val=0;val<=top;val++)
				System.out.print(stackArr[val]+" ");
			System.out.print("]");
			System.out.println();
		}
	}
}

class Client{

	public static void main(String [] sau){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack you want: ");
		int i = sc.nextInt();
		Stack st = new Stack(i);
		char ch;

		do{
		
			System.out.println("-------Operations of stack-------");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. empty?");
			System.out.println("5. size");
			System.out.println("6. print stack");

			System.out.println("Enter the code of operation to be performed: ");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
				
					       System.out.println("Enter data to pushed: ");
					       int x = sc.nextInt();
					       st.push(x);
				}
				break;

				case 2:{
				
					       System.out.println(st.pop()+" popped");
				}
				break;

				case 3:{
				
					       System.out.println(st.peek()+" is top element");
				}
				break;

				case 4:{
				
					       System.out.println(st.empty());
				}
				break;

				case 5:{
				
					       System.out.println(st.size()+" is size of stack");
				}
				break;

				case 6:{
				
					       st.printStack();
				}
				break;

				default:{
				
						System.out.println("Wrong choice");
				}
			}
			System.out.println("Want to continue?");
			ch = sc.next().charAt(0);
		}while(ch =='Y'||ch=='y');
	}
}
