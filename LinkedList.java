
public class LinkedList {

	Node root,next,prev,p,follow;
	
	public void insertFirstNode(int data){
		
		Node ptr=new Node(data);
		
		root=ptr;
		
	}
	
	public void insertBefore(int data1,int data2){
		
		Node ptr=new Node(data1);
		
		p=root;
		follow=null;
		
		while(p.data!=data2){
			follow=p;
			p=p.next;
		}
		
		
		if(empty())
			System.out.println("List is empty");
		else if(p==root){
			ptr.next=p;
			root=ptr;
		}
		else{
			follow.next=ptr;
			ptr.next=p;
		}
		
	}
	
	public void insertAfter(int data1,int data2){
		
		
		Node ptr=new Node(data1);
		
		p=root;
		follow=null;
		
		while(p.data!=data2){
			
			follow=p;
			p=p.next;
		}
		
		if(empty())
			System.out.println("List is empty");
		else if(p.next==null){
			
			p.next=ptr;
			ptr.next=null;
		}
		else{
			ptr.next=ptr.next;
			p.next=ptr;
		}
		
	}
	
		//chaining the data
	
	public void insertInChain(int chaindata,int nodedata){
		
		
		
	}
	
	
	public void deleteNode(int data){
		
		p=root;
		follow=null;
		
		while(p.data!=data){
			follow=p;
			p=p.next;
		}
		
		if(p==root){
			root=p.next;
			p.next=null;
		}
		else{
			follow.next=p.next;
			p.next=null;
		}
		
		
	}
	
	public boolean empty(){
		
		if(root==null)
			return true;
		else return false;
	}
	
	public void show(){
		
		p=root