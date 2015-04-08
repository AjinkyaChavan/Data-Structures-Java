

import java.util.*;

class GraphMain{
	
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		GraphNode gnode=null;
		
		int i,j,data,n;
		
		
		System.out.println("Enter the number of elements");
		
		n = obj.nextInt();
		
		char value[]=new char[n];
		
		GraphDemo gd = new GraphDemo(n);
		
		
		System.out.println("Enter the name value of elements");
		
		for(i=0;i<n;i++){
			value[i] = obj.next().toCharArray()[0];
		}
		
		for(i=0;i<n;i++){
			gd.createNode(value[i]);
		}
		
	
		
	}
	

}
