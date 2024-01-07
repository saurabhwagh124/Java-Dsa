import java.util.*;
class Node{

	int data;
	Node next;
	Node(int data){
	
		this.data = data;
	}
}

class Sll{

	Scanner sc = new Scanner(System.in);

	Node head = null;
	void addFirst(int data){
	
		if(head == null){
		
			Node newNode = new Node(data);
			head = newNode;
		}else{
		
			Node temp = head;
			Node newNode = new Node(data);
			head = newNode;
			newNode.next = temp;
		}
	}

	void addLast(int data){
	
		if(head == null)
			addFirst(data);
		else{
		
			Node temp = head;
			while(temp.next != null){
			
				temp = temp.next;
			}
			Node newNode = new Node(data);
			temp.next = newNode;
		}
	}

	void add(int a){
		System.out.println("Start of input: ");
		while(a!=0){
			System.out.print("->");
			int x = sc.nextInt();
			System.out.print("->");
			int y = sc.nextInt();
			if(y==0){
				addFirst(x);
			}else{
			
				addLast(x);
			}
			a--;
		}
		System.out.println("null\n");
	}

	void printFinal(){
	
	
		Node temp = head;
		while(temp != null){
		
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("null\n");
	}
}

class Client{

	public static void main(String [] sau){
	
		Scanner sc = new Scanner(System.in);
		Sll obj = new Sll();
		System.out.println("Enter Length of LL: ");
		int c  = sc.nextInt();
		obj.add(c);
		obj.printFinal();
	}
}
