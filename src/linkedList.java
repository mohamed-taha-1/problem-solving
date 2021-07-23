
public class linkedList {

	
		
		
		
		Node Head; // head of the list 
		
		static class Node{
			
			int data ;
			
			Node Next; // first constructor called next 
		
			Node(int d){ // second constructor  
				this.data=d;
				Next=null;
			}
			
		}
		
		
		
		//  print list 
		
		public void printList()
	    {
	        Node n = Head;
	        while (n != null) {
	            System.out.print(n.data + " ");
	            n = n.Next;
	        }
	    }
		
		// main 
		
		 public static void main(String[] args){
			 
			 linkedList l= new linkedList();
			 
			 l.Head= new Node(1);
			 Node second= new Node(2);
			 Node third= new Node(3);
			 
			 l.Head.Next= second;	
			 second.Next= third;
			 
			 // print list 
			 l.printList();
			 
		    }
		
		
		
		
		

	

}
