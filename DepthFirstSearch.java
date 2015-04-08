
import java.util.*;

public class DepthFirstSearch {


	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in); 
		
		BSTDemo bst=new BSTDemo();
		
		TreeNode root1=null;
		
		int i,j,k,a,b,n,count=0;
		
		System.out.println("Enter the number of elements");
		n=obj.nextInt();
		
	
		System.out.println("Enter the elements");
		
		for(i=0;i<n;i++){
			
			a=obj.nextInt();
			bst.insertNode(a);
			count++;
		}
	
		
		
		System.out.println("Enter the element to be searched");
		b=obj.nextInt();
		
		final long startTime = System.currentTimeMillis();

		
			root1=bst.getRoot();
			int rootdata = root1.data;
			
			depthFirst(root1,b,bst,n,rootdata,startTime);
			
	}
	
 

	public static void depthFirst(TreeNode root,int key,BSTDemo bst,int n,int rootdata,long startTime){
		
	
		ReverseQueueDemo q = new ReverseQueueDemo(n);
		
		boolean goal = false;
		
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
				
				root = bst.getNode(q.dqarray[q.rear]);
			//	System.out.println(root.data);
			}
			else if(root.data==key){
				System.out.println("Element found");
				System.exit(0);
			}
		
		}
		
		
		final long duration = System.currentTimeMillis() - startTime;
		System.out.println();
		System.out.println("Running time of program is "+duration);

	
	
	}
}
