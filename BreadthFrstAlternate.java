
import java.util.*;

public class BreadthFrstAlternate {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		BSTDemo bst = new BSTDemo();
		
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
	
	public static void breadthFirst(TreeNode root,int rootdata,int n,BSTDemo bst,int key){
	
		QueueDemo q = new QueueDemo(n);
		
		
		q.insert(root.data);
		
		
		while(!q.isEmpty()){
			
			if(root.data!=key){
				
				if(root.lchild!=null)
					q.insert(root.lchild.data);
				if(root.rchild!=null)
					q.insert(root.rchild.data);
				
				q.remove();
				
				if(q.isEmpty()){
					System.out.println("Queue is empty");
					System.out.println("Element not found");
					System.exit(0);
				}
				
				for(int i=q.front;i<=q.rear;i++)
					System.out.print(q.dqarray[i]+" ");
				
				System.out.println();
				
				root = bst.getNode(q.dqarray[q.front]);
			//	System.out.println(root.data);
			}
			else if(root.data==key){
				System.out.println("Element found");
				System.exit(0);
			}
			
			
		
		}
	
		
	}
	
		
}		
		