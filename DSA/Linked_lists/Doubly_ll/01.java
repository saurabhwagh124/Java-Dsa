import java.util.*;

class Node{

	Node prev = null;
	Node next = null;
	int data;

	Node(int data){
	
		this.data = data;
	}
}

class doublyll{
	
	Node head = null;

	void addFirst(int data){
	
		Node newNode = new Node(data);
		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void addLast(int data){
	
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	void addAtPos(int data, int pos){
	
		if(pos<=0||pos>countNode()+2){
		
			System.out.println("Invalid Position");
			return;
		}
		if(pos==1){
		
			addFirst(data);
		}else if(pos == countNode()+1){
		
			addLast(data);
		}else{
		
			Node newNode  = new Node(data);
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			newNode.prev = temp;
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.next.prev = newNode;

		}
	}

	void deleteFirst(){
	
		if(head == null){
		
			System.out.println("Linked list empty");
		}else{
		
		
			head = head.next;
			head.prev = null;
		}
	}

	void deleteLast(){
	
	
		if(head == null){
		
			System.out.println("Linked List is empty");
		}else if(countNode() == 1){
			head = null;
		}else{
			Node temp = head;
			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.prev.next = null;
			temp.prev = null;
		}
	}

	void deleteAtPos(int pos){
	
		if(pos<=0||pos>countNode()+1){
		
			System.out.println("Invalid Position");
			return;
		}
		if(pos==1){
		
			deleteFirst();
		}else if(pos == countNode()+1){
		
			deleteLast();
		}else{
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			temp.next = null;
			temp.prev = temp;
		}
	}

	void printLL(){
	
		if(head == null){
		
			System.out.println("Linked List is empty");	
		}else{
			Node temp = head;
			while(temp.next!= null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}

	int countNode(){
	
		int count = 0;
		if(head == null){
		
			return count;
		}else{
		
			Node temp = head;
			while(temp != null){
			
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
}
class Client{

	public static void main(String[] args){
	
		doublyll obj1 = new doublyll();
		char ch = 0;

		do{
		
			System.out.println("________Doubly Linked List program_______");
			System.out.println("\t \t 1. Add First");
			System.out.println("\t \t 2. Add Delete");
			System.out.println("\t \t 3. Add At Position");
			System.out.println("\t \t 4. Delete First");
			System.out.println("\t \t 5. Delete Last");
			System.out.println("\t \t 6. Delete At Position");
			System.out.println("\t \t 7. Count Nodes in Linked List");
			System.out.println("\t \t 8. Print Linked List");

			System.out.println("Enter a choice to proceed");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice){
			
				case 1: {
						System.out.println("Enter data: ");
						int data = sc.nextInt();
						obj1.addFirst(data);
				}
				break;
				case 2: {
				
						System.out.println("Enter data: ");
						int data = sc.nextInt();
						obj1.addLast(data);
				}
				break;
				case 3: {
						System.out.println("Enter data: ");
						int data = sc.nextInt();
						System.out.println("Enter position: ");
						int pos = sc.nextInt();
						obj1.addAtPos(data,pos);
				}
				break;
				case 4: {
				
						System.out.println("Deleting first...");
						obj1.deleteFirst();
						System.out.println("Deleted !");
				}
				break;
				case 5: {
				
						System.out.println("Deleting last...");
						obj1.deleteLast();
						System.out.println("Deleted !");
				}
				break;
				case 6: {
				
						System.out.println("Enter Position: ");
						int pos = sc.nextInt();
						obj1.deleteAtPos(pos);
						System.out.println("Deleted");
				}
				break;
				case 7: {
				
						System.out.println("Counting ...");
						System.out.println("The count is: "+obj1.countNode());
				}
				break;
				case 8: { 
				
						System.out.println("Printing ...");
						obj1.printLL();
				}
				break;
				default: {
				
						      System.out.println("Wrong choice!");
				}
			}
			System.out.println("Wish to continue? Y/N ");
			ch = sc.next().charAt(0);
		}
			while(ch == 'Y'|| ch== 'y');
	}	
}

