import java.util.*;

class Node{

	Node next = null;
	int data;

	Node(int data){
	
		this.data = data;
	}
}

class Linkedlist{

	Node head = null;
	//addNode
	void addNode(int data){
	
		Node newNode = new Node(data);
		if(head == null){
		
			head = newNode;
		}else{
		
			Node temp = head;
			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	//printLL
	void printLL(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");
		}else{
		
			Node temp = head;
			while(temp.next != null){
			
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}

	//reverse Iterative
	void reverseItr(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList...");
		}else{
		
			Node prev = null;
			Node current = head;
			Node forward = null;

			while(current != null){
			
				forward = current.next;
				current.next = prev;
				prev = current;
				current = forward;
			}
			head = prev;
		}
	}

	//reverse Recursive
	void reverseRec(Node prev, Node current){
	
		if(current == null){
			head = prev;
			return;
		}else{
			Node forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
		}
		reverseRec(prev, current);
	}

	//countNode
	int countNode(){
	
		int count = 0;
		Node temp = head;
		while(temp.next != null){
		
			count++;
			temp = temp.next;
		}
		return count;
	}

	//finding midddlw using one node
	void middle1(){
	
		if(head == null){
		
			return;
		}
		int len = countNode();
		int x =0;
		Node temp = head;
		while(x<len/2){
		
			temp = temp.next;
			x++;
		}
		System.out.println(temp.data);
	}
	
	//finding middle using 2 nodes
	void middle2(){
	
		if(head  == null){
		
			return;
		}
		Node slow = head;
		Node fast = head.next;
		while(fast != null){
		
			fast = fast.next;
			if(fast != null)
				fast = fast.next;
			slow = slow.next;
		}
		System.out.println(slow.data);

	}
}

class Client{

	public static void main(String [] sau){
	
		Linkedlist ll = new Linkedlist();
		char ch = 0;
		
		do{
		
			System.out.println("-------Operations-------");
			System.out.println("1. Add Node");
			System.out.println("2. Print LL");
			System.out.println("3. Reverse Iterative");
			System.out.println("4. Reverse Recursive");
			System.out.println("5. Middle w 1 Node");
			System.out.println("6. Middle w 2 Node");
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
				
					       System.out.println("Enter data for your node");
					       int data = sc.nextInt();
					       ll.addNode(data);
					       System.out.println("Node added");
				}
				break;
				case 2:{
				
					       System.out.println("Printing ...");
					       ll.printLL();
				}
				break;
				case 3:{
				
					       ll.reverseItr();
					       ll.printLL();
				}
				break;
				case 4:{
				
					       Node prev  = null;
					       Node current = ll.head;
					       ll.reverseRec(prev, current);
					       ll.printLL();
				}
				break;
				case 5:{
				
					       ll.middle1();
				}
				break;
				case 6:{
				
					       ll.middle2();
				}
				break;

				default: {
				
					System.out.println("Wrong choice!");
				}
				break;
			}
			System.out.println("Want to continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y'|| ch == 'y');

	}
}
