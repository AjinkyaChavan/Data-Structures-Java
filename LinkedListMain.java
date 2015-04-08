
import java.util.*;

public class LinkedListMain {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		LinkedList list=new LinkedList();
		
		int ch,data,data1,data2,chaindata,nodedata;
		
		do{
			
			System.out.println();
			System.out.println(" Menu ");
			System.out.println("1. insert first node");
			System.out.println("2. insert before");
			System.out.println("3. insert after");
			System.out.println("4. insert chain for a node");
			System.out.println("5. delete node");
			System.out.println("6. delete node from a chain");
			System.out.println("7. show");
			System.out.println("8. exit");
			System.out.println();
			System.out.println("Enter ur choice");
			ch=obj.nextInt();
			
			switch(ch){
			
			case 1:
					if(list.empty()){
					System.out.println("Enter the data value");
					data=obj.nextInt();
					list.insertFirstNode(data);
					}
					else{
						System.out.println("The list is not empty");
					}
					break;
					
			case 2:
					System.out.println("Enter the data value");
					data1=obj.nextInt();
					System.out.println("Enter the data value of the node before" +
							"which u wana insert this node");
					data2=obj.nextInt();
					list.insertBefore(data1, data2);
					break;
					
			case 3:	
					System.out.println("Enter the data value");
					data1=obj.nextInt();
					System.out.println("Enter the data value of the node after" +
						"which u wana insert this node");
					data2=obj.nextInt();
					list.insertAfter(data1, data2);
					break;
					
					
			case 4:
					System.out.println("Insert the data value of the node");
					chaindata = obj.nextInt();
					System.out.println("Enter the node data to which this value is to be chained");
					nodedata