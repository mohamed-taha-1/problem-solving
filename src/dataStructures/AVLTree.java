package dataStructures;




//Java program for insertion in AVL Tree
class Node1 {
 int key, height;
 Node1 left, right;

 Node1(int d) {
     key = d;
     height = 1;
 }
}



public class AVLTree {

	// AVL tree is a self-balancing Binary Search Tree (BST)..
	// The height of an AVL tree is always O(Logn) where n is the number of nodes
	
	/*Following are two basic operations that can be performed to re-balance a BST
	 *  without violating the BST property (keys(left) < key(root) < keys(right)). 
	  * 1) Left Rotation 
      * 2) Right Rotation
	 * */
	
	 Node1 root;
	 
	 // A utility function to get the height of the tree
	    int height(Node1 N) {
	        if (N == null)
	            return 0;
	 
	        return N.height;
	    }
	 
	    // A utility function to get maximum of two integers
	    int max(int a, int b) {
	        return (a > b) ? a : b;
	    }
	 
	    
	    
	    
	    // A utility function to right rotate subtree rooted with y
	    // See the diagram given above.
	    Node1 rightRotate(Node1 y) {
	        Node1 x = y.left;
	        Node1 T2 = x.right;
	 
	        // Perform rotation
	        x.right = y;
	        y.left = T2;
	 
	        // Update heights
	        y.height = max(height(y.left), height(y.right)) + 1;
	        x.height = max(height(x.left), height(x.right)) + 1;
	 
	        // Return new root
	        return x;
	    }
	 
	    
	    
	    
	 // A utility function to left rotate subtree rooted with x
	    // See the diagram given above.
	    Node1 leftRotate(Node1 x) {
	        Node1 y = x.right;
	        Node1 T2 = y.left;
	 
	        // Perform rotation
	        y.left = x;
	        x.right = T2;
	 
	        //  Update heights
	        x.height = max(height(x.left), height(x.right)) + 1;
	        y.height = max(height(y.left), height(y.right)) + 1;
	 
	        // Return new root
	        return y;
	    }
	 
	    
	    
	    
	 // Get Balance factor of node N
	    int getBalance(Node1 N) {
	        if (N == null)
	            return 0;
	 
	        return height(N.left) - height(N.right);
	    }
	 
	
	    
	    
	    Node1 insert(Node1 node, int key) {
	 
	        /* 1.  Perform the normal BST insertion */
	        if (node == null)
	            return (new Node1(key));
	 
	        if (key < node.key)
	            node.left = insert(node.left, key);
	        else if (key > node.key)
	            node.right = insert(node.right, key);
	        else // Duplicate keys not allowed
	            return node;
	 
	        /* 2. Update height of this ancestor node */
	        node.height = 1 + max(height(node.left),
	                              height(node.right));
	 
	        /* 3. Get the balance factor of this ancestor
	              node to check whether this node became
	              unbalanced */
	        int balance = getBalance(node);
	 
	        // If this node becomes unbalanced, then there
	        // are 4 cases Left Left Case
	        if (balance > 1 && key < node.left.key)
	            return rightRotate(node);
	 
	        // Right Right Case
	        if (balance < -1 && key > node.right.key)
	            return leftRotate(node);
	 
	        // Left Right Case
	        if (balance > 1 && key > node.left.key) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }
	 
	        // Right Left Case
	        if (balance < -1 && key < node.right.key) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }
	 
	        /* return the (unchanged) node pointer */
	        return node;
	    }
	 
	    
	 // A utility function to print preorder traversal
	    // of the tree.
	    // The function also prints height of every node
	    void preOrder(Node1 node) {
	        if (node != null) {
	            System.out.print(node.key + " ");
	            preOrder(node.left);
	            preOrder(node.right);
	        }
	    }
	    
	    
	    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 AVLTree tree = new AVLTree();
		 
	        /* Constructing tree given in the above figure */
	        tree.root = tree.insert(tree.root, 10);
	        tree.root = tree.insert(tree.root, 20);
	        tree.root = tree.insert(tree.root, 30);
	        tree.root = tree.insert(tree.root, 40);
	        tree.root = tree.insert(tree.root, 50);
	        tree.root = tree.insert(tree.root, 25);
	        
	        
	        System.out.println("Preorder traversal" + " of constructed tree is : ");
		    tree.preOrder(tree.root);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
