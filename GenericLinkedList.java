
public class GenericLinkedList<T> {


	private T[] datastore;
	int size;
	int pos;
	
	public GenericLinkedList(int number){
		
		size=number;
		pos=0;
		datastore=(T[]) new Object[size];
		
		
	}
	
	
	GenericNode root;
	GenericNode next,prev,p,follow;
	
	public void insertFirstNode(T data){
		
		GenericNode ptr=new GenericNode(data);
		
		root=ptr;
		
	}
	
	public void insertBefore(T data1,T data2){
		
		GenericNode ptr=new GenericNode(data1);
		
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
	
	public void insertAfter(T data1,T data2){
		
		
		GenericNode ptr=new GenericNode(data1);
		
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
	
	public void deleteNode(T data){
		
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
		
		p=root;
		
		do{
			System.out.println(p.data+" ");
			p=p.next;
		}while(p.next!=null);
			
	}
	
	
}
