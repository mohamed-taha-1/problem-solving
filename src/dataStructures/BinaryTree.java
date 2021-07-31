package dataStructures;




/* Class containing left and right child of current
   node and key value*/
class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}




public class BinaryTree {

	/***  Trees: Unlike Arrays, Linked Lists, Stack and queues,
	 *  which are linear data structures, 
	 * trees are hierarchical data structures. 
	 * For example, the file system on a computer:
	 * 
	 *  
	 *   Binary Tree: A tree whose elements have at most 2 children is called a binary tree. 
	 *   Since each element in a binary tree can have only 2 children, 
	 *   we typically name them the left and right child. 
	 *  **/
	
	
	 // Root of Binary Tree
     Node root;
 
    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }
	
    
    BinaryTree()
    {
        root = null;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  BinaryTree tree = new BinaryTree();
		  tree.root = new Node(1);
		  

	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        
	        tree.root.left.left = new Node(4);
	        tree.root.right.left=new Node(4);
		  

	        System.out.println(tree);
	        
	        
	}

}
