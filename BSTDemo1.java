
public class BSTDemo1 {

	TreeNode root,p,follow,temp;
	
	public void insertNode(int data){
		
		TreeNode ptr=new TreeNode(data);
	

		
		
		if(root==null){
			root=ptr;
			System.out.println("Yes");
			System.out.println("root= "+root.data);
		}
		else{
			
			p=root;
			follow=null;
			
			
			while(p!=null){
				
				follow=p;
				
				if(p.data>ptr.data){
					
					p=p.lchild;
				}
				else if(p.data<ptr.data){
					
					p=p.rchild;
				}
			}
			
			if(ptr.data<follow.data){
				follow.lchild=ptr;
				ptr.parent = follow;
			}
			else{ 
				follow.rchild=ptr;
				ptr.parent = follow;
			}	
		}
		
	}
	
	public boolean empty(){
		
		if(root==null)
			return true;
		else
			return false;
	}
	
	
	public void deleteNode(int data){
		
		System.out.println("root= "+root.data);
		
		
		p=root;
		follow=null;
		
		while(p.data!=data && p!=null){
			
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
	
	public void inorder(TreeNode node){
		
		if(node!=null){
		inorder(node.lchild);
		System.out.println(node.data);
		
		inorder(node.rchild);
		
		}
		
		
		}
	
	public void preorder(TreeNode node){
		
		if(node!=null){
		System.out.println(node.data);
		preorder(node.lchild);
		preorder(node.rchild);
		}
	}

	public void postorder(TreeNode node){
	
	if(node!=null){
	postorder(node.lchild);
	postorder(node.rchild);
	System.out.println(node.data);
	}
	}
	
	public TreeNode getRoot(){
		System.out.println("In getRoot method, root= "+root.data);
		p=root;
		return p;
	}
	
	
}
