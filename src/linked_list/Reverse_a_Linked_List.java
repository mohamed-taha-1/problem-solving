package linked_list;

public class Reverse_a_Linked_List {

	class Node5{
		int data ;
		Node5 Next;
		
		public Node5(int d) {
			this.data=d;
			this.Next=null;
		}
	}
	
	
	public Node5 head=null;
	public Node5 tail=null;
	
	public void addNode(int data) {
		
		Node5 newNode =new Node5(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.Next=newNode;
			tail=newNode;
		}
		
		
	}
	
	   //reverse() will help the reverse the order of the list  
    public void reverse(Node5 current) {  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks if the next node is null, if yes then prints it.  
            if(current.Next == null) {  
                System.out.print(current.data + " ");  
                return;  
            }  
            //Recursively calls the reverse function  
            reverse(current.Next);  
            System.out.print(current.data + " ");  
        }  
    }  
    
    
    
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node5 current = head;  
  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.Next;  
        }  
        System.out.println();  
    }  
    
    
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_a_Linked_List Rv_linked=new Reverse_a_Linked_List();
		Rv_linked.addNode(2);
		Rv_linked.addNode(3);
		Rv_linked.addNode(4);
		Rv_linked.addNode(5);
		
		 System.out.println("Original List: ");  
	      Rv_linked.display();  
	      
	        System.out.println("Reversed List: ");  
	        //Print reversed list  
	        Rv_linked.reverse( Rv_linked.head);  

	}

}
