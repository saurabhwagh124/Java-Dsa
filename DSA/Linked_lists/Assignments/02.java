import java.util.*;
class Node{

	int data;
	Node next = null;
	Node(int data){

		this.data  = data;
	}
}

class sll{

	Scanner sc = new Scanner(System.in);
	Node head;

	void add(int x){
		int i = 0;
		if(i==0){
			head = null;
			System.out.println("Enter data for Node: ");
			int g = sc.nextInt();
			Node newNode = new Node(g);
			head = newNode;
			i++;
		}
		for(i=1;i<x;i++){
			Node temp = head;
			while(temp.next!= null){
				temp = temp.next;
			}
			System.out.println("Enter data for Node: ");
			int g = sc.nextInt();
			Node newNode = new Node(g);
			temp.next = newNode;
		}
	}
	

	void printNode(){
	
		Node temp = head;
		while(temp != null){
		
			System.out.print(temp.data);
			System.out.print("->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	void countNode(){
	
		Node temp = head;
		int count = 0;
		while(temp != null){
		
			temp = temp.next;
			count++;
		}
		System.out.println("No. of Nodes is : "+ count);
	}

	void countLoopNodes(int f){
	
		int y = 1;
		Node temp = head;
		while(y!=f){
			temp = temp.next;
			y++;
		}
		int countx= 1;
		while(temp.next!=null){
		
			temp = temp.next;
			countx++;
		}
		System.out.println("The count of loop is : "+countx);

	}

}

class Client{

	public static void main(String [] sau){
	
		Scanner sc = new Scanner(System.in);
		sll obj = new sll();
		System.out.println("Enter the no. of nodes to form: ");
		int x = sc.nextInt();
		obj.add(x);
		System.out.println("Enter loop start : ");
		int f = sc.nextInt();
		obj.countLoopNodes(f);
		obj.printNode();

	}
}
