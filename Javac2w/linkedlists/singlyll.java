import java.util.*;
class Node{

	int data;
	Node next = null;
	Node(int data){
	
		this.data=data;
	}
}


class linkedList{


	Node head = null;

	void printSLL(){

                if(head==null){

                        System.out.println("Linked List is empty");
                }else{
                        Node temp = head;
                        while(temp!=null){

                                System.out.print(temp.data+"->");
                                temp = temp.next;
                        }
                        System.out.print("null");
                        System.out.println();
                }
        }

	int countNode(){
	
		int count = 0;
		Node temp = head;
		while(temp!=null){
		
			temp = temp.next;
			count++;
		}
		return count;
	}

	void addFirst(int data){
		
		Node newNode = new Node(data);
		if(head==null){
		
			head=newNode;
		}else{
		
			newNode.next = head;
			head=newNode;
		}
	}
	
	
	void addLast(int data){
	
		Node newNode = new Node(data);
		if(head==null){
		
			head=newNode;
		}else{
		
			Node temp = head;
			while(temp.next!=null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	
	void addAtPos(int pos, int data){
	
		if(pos<=0||pos>countNode()+2){
		
			System.out.println("Wrong Position input");
			return;
		}else if(pos==1){
			addFirst(data);
		}else if(pos==countNode()+1){
			addLast(data);
		}else{
		
			Node newNode = new Node(data);
			Node temp = head;
			while((pos-2)!=0){
			
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}


	}

	
	void deleteFirst(){
	
		if(head==null){
		
			System.out.println("Linked List is empty");
		}else if(countNode()==1){
		
			head=null;
			System.out.println("Node deleted");
		}else{
		
			head = head.next;
			System.out.println("Node deleted");
		}
	}

	void deleteLast(){
	
		if(head==null){
		
			System.out.println("Linked list is empty");
		}else if(countNode()==1){
		
			head=null;
			System.out.println("Node deleted");
		}else{
		
			Node temp = head;
			while(temp.next.next!=null){
			
				temp = temp.next;
			}
			temp.next=null;
		}
	}
	
		
	void deleteAtPosition(int pos){
	
		if(pos<=0||pos>countNode()){
		
			System.out.println("Wrong position input");
		}else if(pos==1){
		
			deleteFirst();
			System.out.println("Node deleted");
		}else if(pos==countNode()){
		
			deleteLast();
			System.out.println("Node deleted");
		}else{
		
			Node temp = head;
			while((pos-1)!=0){
			
				temp = temp.next;
				pos--;
			}
			temp.next=temp.next.next;
			System.out.println("Node deleted");
		}
	}
}

class client{

	public static void main(String [] sau){
	
		LinkedList ll = new LinkedList();
		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addFirst(1);
		ll.printSLL();
	}
}
