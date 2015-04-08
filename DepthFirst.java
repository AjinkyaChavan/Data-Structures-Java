
import java.util.*;

public class DepthFirst {


	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in); 
		
		BSTDemo1 bst=new BSTDemo1();
		
		
		
		int i,j,key;
		
		System.out.println("Enter the number of elements");
		int n = obj.nextInt();
		
		System.out.println("Enter the elements");
		
		for(i=0;i<n;i++)
			bst.insertNode(obj.nextInt());
		
		//finding the root
		TreeNode root1=bst.getRoot();
		
		
		System.out.println("ENter the element to be searched");
		key=obj.nextInt();
		
		final long startTime = System.currentTimeMillis();

		depthFirst(startTime,root1,n,bst,key);
		
	}
	
	
	public static void depthFirst(long startTime,TreeNode root,int n,BSTDemo1 bst,int key){	
		
		
		DoubleEndedQueueMain q = new DoubleEndedQueueMain();		
		
		final long duration = System.currentTimeMillis() - startTime;
		System.out.println();
		System.out.println("Running time of program is "+duration);

	}
	
}
