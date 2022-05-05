import java.util.*;
class Que2{
	
	Node head;
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	void addLast(){
		
		
		int n = sc.nextInt();
		for(int i =1;i<=n;i++){
			
				int d = sc.nextInt();
			Node new_node = new Node(d);
			new_node.next = null;
			
			if(head == null){
				
				head = new_node;
			}
			
			Node temp =head;
			while(temp!= null){
				
				temp = temp.next;
			}
			temp = new_node;
		}
	}
	
	void display(){
		
		Node temp = head;
		while(temp!=null){
			
			System.out.print(temp.data +"--> ");
			temp =temp.next;
		}
		System.out.print("NULL");
	}
	
	public static void main(String[] args){
		
		Que2 e = new Que2();
		e.addLast();
		e.display();
		
	}
	
	
	
}