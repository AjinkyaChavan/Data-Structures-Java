


import java.util.*;

public class DoubleEndedQueueMain {

	public static void main(String[] args) {


		Scanner obj =new Scanner(System.in);
		
		int i,j,data,n,choice,f,b,dirstr;
		boolean dir;
		
		
		System.out.println("Enter the elements in the queue");
		n = obj.nextInt();
		
		DoubleEndedQueue dq = new DoubleEndedQueue(n);
		
		
		
		
		do{
			
			System.out.println("-----------");
			System.out.println("   Menu   ");
			System.out.println("1. insert");
			System.out.println("2. remove");
			System.out.println("3. check if empty");
			System.out.println("4. show");
			System.out.println("5. exit");
			System.out.println("-----------");
			System.out.println("Enter your choice");
			
			choice = obj.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the data value to be inserted");
				data = obj.nextInt();
				
				System.out.println("Enter direction(0/1)");
				dirstr = obj.nextInt();
				if(dirstr==0)
					dir=true;
				else
					dir=false;
			
				dq.insert(data,dir);
				break;
			
				
		
			
			case 2:
				
				System.out.println("Enter direction(t/f)");
				dirstr = obj.nextInt();
				if(dirstr==0)
					dir=true;
				else
					dir=false;
				
				dq.remove(dir);
				break;
				
		
			
			case 3:
				boolean check = dq.isEmpty();
			
				if(check)
					System.out.println("Queue is empty");
				else
					System.out.println("Queue is not empty");
			
				break;
				
			
			case 4:
				System.out.println("Enter direction(t/f)");
				dirstr = obj.nextInt();
				if(dirstr==0)
					dir=true;
				else
					dir=false;
				
				dq.show(dir);
				break;
				
			
			case 5:break;
			
			
			default:
				System.out.println("Illegal Operation, Try again");
			
			
			}
			
		}while(choice!=5);
		
	}

}





class DoubleEndedQueue{
	
	int ffront,frear,bfront,brear,len;
	int dqarray[];
	
	public DoubleEndedQueue(int n) {
	
		len=n;
		
		ffront = 0;
		frear = -1;
		bfront = len;
		brear = len;
		
		
		dqarray = new int[len];
		System.out.println("len : "+len);
	}
	
	public void insert(int data,boolean dir){
		
		if( (frear == dqarray.length-1 && dir==true) || (brear==0 && dir==false) )
			System.out.println("Queue is full");
		else{
			if(dir){
			dqarray[++frear] = data;
			ffront=frear;
			System.out.println(ffront+" "+frear+" "+bfront+" "+brear+" "+dir);
			}
			else{
			dqarray[--brear] = data;
			System.out.println(ffront+" "+frear+" "+bfront+" "+brear+" "+dir);
			}
			
		}
	}

	

	
	public void remove(boolean dir){
		
		if(isEmpty()){
			System.out.println("Queue is empty");
			System.out.println(ffront+" "+frear+" "+bfront+" "+brear+" "+dir);
		}
		else{
			ffront++;
			System.out.println(ffront+" "+frear+" "+bfront+" "+brear+" "+dir);
		}
		
	}
	
	public boolean isEmpty(){
		
		if(ffront>frear){
			System.out.println(ffront+" "+frear+" "+bfront+" "+brear);
			return true;
		}
			
		else {
			System.out.println(ffront+" "+frear+" "+bfront+" "+brear);
			return false;
		}
		
	}
	
	public void show(boolean dir){
		
		if(isEmpty())
			System.out.println("Queue is empty");
		if(dir){
			for(int i=ffront;i<=frear;i++){
				if((Object)dqarray[i]!=null)
					System.out.print(dqarray[i]+" ");
			}
			
			if((frear-ffront)!=len-1)
			for(int i=bfront;i>=brear;i--){
				
				System.out.print(dqarray[i]+" ");
			}
		}
		else{
			
			for(int i=bfront-1;i>=brear;i--){
				 
					System.out.print(dqarray[i]+" ");
			}
		}
		
	}
}
