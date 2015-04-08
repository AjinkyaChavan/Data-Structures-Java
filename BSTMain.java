
import java.util.*;

public class BSTMain {

	public static void main(String[] args) {

	Scanner obj=new Scanner(System.in);
	
	BSTDemo bst=new BSTDemo();
	
	TreeNode root1;
	
	int choice=0,a,b,i,j;
	int counter=0;
	
	System.out.println("Enter the number of nodes");
	int in=obj.nextInt();
	
	System.out.println("Enter the value of nodes");
	
	for(i=0;i<in;i++){
	
		a=obj.nextInt();
		bst.insertNode(a);
	}
	
	
	do{
		
	
		System.out.println("");
		System.out.println("Menu");
		
		System.out.println("2. insertNode");
		System.out.println("3. deleteNode");
		System.out.println("4. inorder");
		System.out.println("5. preorder");
		System.out.println("6. postorder");
		System.out.println("7. check if empty");
		System.out.println("8. parent value");
		System.out.println("9. Get root from data");
		System.out.println("10. exit");
		System.out.println();
		System.out.println("Enter ur choice");
		 choice=obj.nextInt();
		
		switch(choice){
		
		
		
		
		case 2:
				System.out.println("Enter the data value");
				int data1=obj.nextInt();
				bst.insertNode(data1);
				break;
		case 3:
				System.out.println("Enter the data of node to be deleted");
				int data2=obj.nextInt();
				bst.deleteNode(data2);
				break;
				
		case 4:
				root1=bst.getRoot();
				System.out.println("inorder root1 value= "+root1.data);
				bst.inorder(root1);
				break;
				
		case 5:
			root1=bst.getRoot();
			System.out.println("preorder root1 value= "+root1.data);

			   bst.preorder(root1);
			   break;
			   
		case 6:
			root1=bst.getRoot();
			System.out.println("postorder root1 value= "+root1.data
					);

				bst.postorder(root1);
				break;
				
		case 7:
			 	bst.empty();
			 	break;
			 	
		case 8:
				System.out.println("Enter the node's value");
				a = obj.nextInt();
				bst.getParent(a);
				break;
				
		case 9:
				System.out.println("Enter the data value");
				int newdata = obj.nextInt();
				TreeNode newrootrec = bst.getNode(newdata);
				System.out.println("The data value of the expected node is "+newrootrec.data);
				break;
			
		default:
				System.out.println("Invalid Operation.Try Again");
		}
		
	}while(choice!=10);
		
		
	}
}
	
	
