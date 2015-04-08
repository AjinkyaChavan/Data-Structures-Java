
import java.util.*;

public class BreadthFirstMain {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		BSTDemo1 bst = new BSTDemo1();
		
		TreeNode root1 = null;
		int data,i,key,n,choice;
		
		System.out.println("Enter the number of elements");
		n = obj.nextInt();
		
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			bst.insertNode(obj.nextInt());
		}
	
		root1 = bst.getRoot();
		int rootdata=root1.data;
		System.out.println("Enter the element to be searched");
		key = obj.nextInt();
		
		breadthFirst(root1,rootdata,n,bst,key);
	
	}
	
	public static boolean isLeafNode(TreeNode root){
		
		
		if(root.lchild==null && root.rchild == null && root.parent!=null){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static void breadthFirst(TreeNode root,int rootdata,int n,BSTDemo1 bst,int key){
	
		QueueDemo q = new QueueDemo(n);
		
		
		q.insert(root.data);
		
		System.out.println();
		System.out.println("Root inserted. value :"+root.data);
		
		System.out.println("Queue is : ");

		for(int i=q.front;i<=q.rear;i++)
			System.out.print(q.dqarray[i]+" ");
		
		while(!q.isEmpty()){
		
			System.out.println("first if else loop");
			
		if(root.data!=key && !(isLeafNode(root)) ){
			
			if(root.lchild!=null)
			q.insert(root.lchild.data);
			
			if(root.rchild!=null)
			q.insert(root.rchild.data);
			
			root = root.lchild;
			
			q.remove();
			
			System.out.println("Queue is : ");

			for(int i=q.front;i<=q.rear;i++)
				System.out.print(q.dqarray[i]+" ");
			
		}
		else if(isLeafNode(root)){
			
			System.out.println("first else if loop");
			root=root.parent.rchild;
			
			
			
			if(q.dqarray.length==1){
				System.out.println("Node not found bro");
				System.exit(0);
			}
			
			q.remove();
			
			System.out.println("Queue is : ");

			for(int i=q.front;i<=q.rear;i++)
				System.out.print(q.dqarray[i]+" ");
		}
		else if(root.data==key){
			System.out.println("Element found : "+root.data+" "+key);
			System.exit(0);
		}
		
		if(root.data!=key && !(isLeafNode(root))){
			
			System.out.println();
			System.out.println("seconf if else loop");
			
			if(root.lchild!=null)
				q.insert(root.lchild.data);
				if(root.rchild!=null)
				q.insert(root.rchild.data);
				
			root = root.parent.rchild;
			
			q.remove();
			
			System.out.println("Queue is : ");

			for(int i=q.front;i<=q.rear;i++)
				System.out.print(q.dqarray[i]+" ");
		}
		else if(isLeafNode(root)){
			
			System.out.println("second eles if loop");
			root=root.parent.parent.rchild;
			
			if(q.dqarray.length==1){
				System.out.println("Node not found bro");
				System.exit(0);
			}
			
			q.remove(); 
			
			System.out.println("Queue is : ");

			for(int i=q.front;i<=q.rear;i++)
				System.out.print(q.dqarray[i]+" ");
			
		}else if(root.data==key){
			System.out.println("Element found : "+root.data+" "+key);
			System.exit(0);
		}
		
		
		
		
		if(root.data!=key && !(isLeafNode(root))){
			
			System.out.println();
			System.out.println("third if else loop");
			
			if(root.lchild!=null)
				q.insert(root.lchild.data);
				if(root.rchild!=null)
				q.insert(root.rchild.data);
				
			root = root.parent.lchild.lchild;
			
			q.remove();
			
			System.out.println("Queue is : ");

			for(int i=q.front;i<=q.rear;i++)
				System.out.print(q.dqarray[i]+" ");
			
		}
		else if(isLeafNode(root)){
			
			System.out.println("third else if loop");
			root=root.parent.rchild;
			if(q.dqarray.length==1){
				System.out.println("Node not found bro");
				System.exit(0);
			}
			
			q.remove();
			
			System.out.println("Queue is : ");

			for(int i=q.front;i<=q.rear;i++)
				System.out.print(q.dqarray[i]+" ");
		}
		else if(root.data==key){
			System.out.println("Element found : "+root.data+" "+key);
			System.exit(0);
		}
		
	}
		
	
  }
	
		
}		
		