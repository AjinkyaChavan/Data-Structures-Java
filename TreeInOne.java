
import java.util.*;

public class TreeInOne {

	public static void insertFirstNode(int data,TreeNode root){
		
		TreeNode ptr=new TreeNode(data);
		root=ptr;
	}

	
public static void insertNode(int data,TreeNode p,TreeNode follow,TreeNode root){
		
		TreeNode ptr=new TreeNode(data);
		
		p=root;
		follow=null;
		try{
			
			while(p!=null){
				
				if(p.data>ptr.data){
					follow=p;
					p=p.lchild;
				}
				else if(p.data<ptr.data){
					follow=p;
					p=p.rchild;
				}
			}
			
			if(follow.lchild==null){
				
				follow.lchild=ptr;
			}
			else if(follow.rchild==null){
				
				follow.rchild=ptr;
			}
			else{
				follow.lchild=ptr;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
		}
		

	
	public static void main(String[] args) {

	Scanner obj=new Scanner(System.in);
	

	
	TreeNode root1,root=null,p=null,follow=null,temp=null;
	
	int choice=0,a,b,i,j;
	int counter=0;
	
	System.out.println("Enter the root node value");
	a=obj.nextInt();
	insertFirstNode(a,root);
	
	do{
		
	
		System.out.println("");
		System.out.println("Menu");
		
		System.out.println("2. insertNode");
		System.out.println("3. deleteNode");
		System.out.println("4. inorder");
		System.out.println("5. preorder");
		System.out.println("6. postorder");
		System.out.println("7. check if empty");
		System.out.println("8. exit");
		System.out.println();
		System.out.println("Enter ur choice");
		 choice=obj.nextInt();
		
		switch(choice){
		
		
		
		
		case 2:
				System.out.println("Enter the data value");
				int data1=obj.nextInt();
				insertNode(data1,p,follow,root);
				break;
		case 3:
				System.out.println("Enter the data of node to be deleted");
				int data2=obj.nextInt();
				deleteNode(data2,p,follow,root,temp);
				break;
				
		case 4:
			try{
				inorder(root);
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(root);
			}
				break;
				
		case 5:
			try{
				preorder(root);
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(root);
			}   break;
			   
		case 6:
			try{
			postorder(root);
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(root);
			}break;
				
		case 7:
			 	empty(root);
			 	break;
			 	
		case 8:
				break;
				
		default:
				System.out.println("Invalid Operation.Try Again");
		}
		
	}while(choice!=8);
		
		
	}
	

	
	public static boolean empty(TreeNode root){
		
		if(root==null)
			return true;
		else
			return false;
	}
	
	
	public static void deleteNode(int data,TreeNode p,TreeNode follow,TreeNode root,TreeNode temp){
		
		p=root;
		follow=null;
		
		while(p.data!=data){
			
			if(p.data>data){
				follow=p;
				p=p.lchild;
			}
			else if(p.data<data){
				follow=p;
				p=p.rchild;
			}
		}
		
		if(p==null)
			System.out.println("Node not found");
		else{
			
			//if p is a leaf node
			
			if(p.lchild==null && p.rchild==null){
				if(follow.lchild==p)
					follow.lchild=null;
				else if(follow.rchild==p)
					follow.rchild=null;
			}
			
			//if the node has ana empty left subtree
			
			if(p.lchild==null)
				if(p!=root)
					if(follow.lchild==p)
						follow.lchild=p.rchild;
					else
						follow.rchild=p.rchild;
				else 
					root=p.rchild;
			
			// if the node has an empty right subtree
			

			if(p.rchild==null)
				if(p!=root)
					if(follow.rchild==p)
						follow.rchild=p.lchild;
					else
						follow.lchild=p.lchild;
				else 
					root=p.lchild;
			
			//if the node has nonempty left and right subtrees
			
			if(p.data<root.data){
				temp=p.rchild;
				
				while(temp.lchild!=null)
					temp=temp.lchild;
				
			
				follow.lchild=p.rchild;
				temp.lchild=p.lchild;
				}
			else if(p.data>root.data){
				
				temp=p.lchild;
				
				while(temp.rchild!=null)
					temp=temp.rchild;
				
				follow.rchild=p.lchild;
				temp.rchild=p.rchild;
				
			}
			
		}
		
		
	}
	
	public static void inorder(TreeNode root){
		
		inorder(root.lchild);
		System.out.println(root.data);
		
		inorder(root.rchild);
	}
	
	public static void preorder(TreeNode root){
		
		System.out.println(root.data);
		preorder(root.lchild);
		preorder(root.rchild);
	}

	public static void postorder(TreeNode root){
	
	
	postorder(root.lchild);
	postorder(root.rchild);
	System.out.println(root.data);
	}
	
	

}



	
	
	
	
	


