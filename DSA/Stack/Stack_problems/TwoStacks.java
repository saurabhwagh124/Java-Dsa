import java.util.*;
class TwoStacks{

	int stackArr[];
	int top1;
	int top2;
	int maxSize;
	TwoStacks(int size){
		
		this.stackArr = new int[size];
		this.top1 = -1;
	        this.top2 = size;
		this.maxSize = size;	
	}

	void push1(int data){
	
		if(top2-top1 > 1){
		
			top1++;
			stackArr[top1] = data;
		}else{
		
			System.out.println("Stack Overflow");
		}
	}

	void push2(int data){
	
		if(top2 - top1 > 1){
		
			top2--;
			stackArr[top2] = data;
		}else{
		
			System.out.println("StackOverflow");
		}
	}

	int pop1(){
	
		if(top1 == -1){
		
			return -1;
		}else{
		
			int val = stackArr[top1];
			top1--;
			return val;
		}
	}

	int pop2(){
	
		if(top2 == maxSize){
		
			return -1;
		}else{
		
			int val  = stackArr[top2];
			top2++;
			return val;
		}
	}

	void print1(){
	
		System.out.print("[");
		for(int i=0;i<=top1;i++){
		
			System.out.print(stackArr[i]+",");
		}
		System.out.print("]");
		System.out.println();
	}

	void print2(){
	
		System.out.print("[");
		for(int i=(maxSize-1); i>=top2;i--){
		
			System.out.print(stackArr[i]+",");
		}
		System.out.print("]");
		System.out.println();
	}
}

class Client{

	public static void main(String [] sau){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for Array:");
		TwoStacks obj = new TwoStacks(sc.nextInt());
		char ch;
		do{
			System.out.println("1. Push in stack 1");
			System.out.println("2. Push in stack 2");
			System.out.println("3. Pop stack 1");
			System.out.println("4. pop stack 2");
			System.out.println("5. print stack 1");
			System.out.println("6. print stack 2");

			System.out.println("Enter your choice: ");
			int x = sc.nextInt();
			
			switch(x){
				case 1:{
				
					       System.out.println("Enter element:");
					       int data = sc.nextInt();
					       obj.push1(data);
				}
				break;
				case 2:{
				
					       System.out.println("Enter element: ");
					       int data = sc.nextInt();
					       obj.push2(data);
				}
				break;
				case 3:{
				
					       System.out.println(obj.pop1()+" Popped from Stack1");
				}
				break;
				case 4:{
				
					       System.out.println(obj.pop2()+" Popped from stack2");
				}
				break;
				case 5:{
				
					       obj.print1();
				}
				break;
				case 6:{
				
					       obj.print2();
				}
				break;
				default:
				       System.out.println("Wrong Choice!");
			}
			System.out.println("Want to Continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y'||ch == 'y');
	}
}
