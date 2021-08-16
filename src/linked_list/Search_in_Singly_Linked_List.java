package linked_list;

public class Search_in_Singly_Linked_List {
	
    class Node4{  
        int data;  
        Node4 next;  
        public Node4(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    
    //Represent the head and tail of the singly linked list  
    public Node4 head = null;  
    public Node4 tail = null;  
    
    
  //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node4 newNode = new Node4(data);  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
    } 
    
    
    
    
    
    
    //searchNode() will search for a given node in the list  
    public  void searchNode(int data) {  
        Node4 current = head;  
        int i = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                 //Compares node to be found with each node present in the list  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + i);  
        else  
             System.out.println("Element is not present in the list");  
    }  
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search_in_Singly_Linked_List S_linked = new Search_in_Singly_Linked_List() ;
		
		S_linked.addNode(1);
		S_linked.addNode(7);
		S_linked.addNode(8);
		S_linked.addNode(3);
		
		S_linked.searchNode(4);
		
	}

}
