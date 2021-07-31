package dataStructures;



public class LinkedStack {

	
	class Node2{
		 int data=0;
		 Node2 link;
		 
  }
	
	
	Node2 top;
	
	
	
	// push function 
	
	LinkedStack(){
		this.top =null;
	}
	
		public void push(int x) {
			
			  // create new node temp and allocate memory
	        Node2 temp = new Node2();
			
			
			if( temp == null) {
				
				System.out.println("Stack is full ");
			
			}else {
			
				 temp.data = x;
				 
			      // put top reference into temp link
			        temp.link = top;
			 
			        // update top reference
			        top = temp;
			
			System.out.println("added ");
		       }
		}
		
		
		
		 public boolean isEmpty()
		    {
		        return top == null;
		    }
		 
		    // Utility function to return top element in a stack
		    public int peek()
		    {
		        // check for empty stack
		        if (!isEmpty()) {
		            return top.data;
		        }
		        else {
		            System.out.println("Stack is empty");
		            return -1;
		        }
		    }
		    
		    
		    
		    
		    
	 public void pop() // remove at the beginning
		    {
		       
		 
		        // update the top pointer to point to the next node
		        top = (top).link;
		    }
	 
	 
	 
	 
	 
	 
	 public void display()
	    {
	        // check for stack underflow
	        if (top == null) {
	            System.out.printf("\nStack Underflow");
	           
	        }
	        else {
	            Node2 temp = top;
	            while (temp != null) {
	 
	                // print node data
	                System.out.print("-> "+ temp.data);
	 
	                // assign temp link to temp
	                temp = temp.link;
	            }
	        }
	    }
		 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedStack ls =new LinkedStack();
		
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);
		ls.push(6);
		ls.push(7);
		
		ls.display();
		
		ls.pop();
     	System.out.println();
    	System.out.println( " After deletion ");
		ls.display();
		
		
		
		
	}

}
