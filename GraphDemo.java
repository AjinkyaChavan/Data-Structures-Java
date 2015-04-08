import java.util.*;



class GraphDemo{
	
	Scanner obj = new Scanner(System.in);
	
	int len,i=0,j,n,data1,connected;
	
	
	GraphDemo(int n){
		
		len=n;
		
	}
	
	public void createNode(char data){
		
		System.out.println("Enter the number of connected nodes");
		
		connected = obj.nextInt(); 
		
		System.out.println("Enter the name values of connected nodes");
			
		
		
		GraphNode g = new GraphNode(data,connected);
		
	}
	
	
	
}