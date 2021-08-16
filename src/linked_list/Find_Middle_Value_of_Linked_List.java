package linked_list;



public class Find_Middle_Value_of_Linked_List {




		static Node head;

		// Link list node
		class Node
		{
			int data;
			Node next;

			// Constructor
			public Node(Node next, int data)
			{
				this.data = data;
				this.next = next;
			}
		}

		// Function to get the middle of
		// the linked list
		void printMiddle(Node head)
		{
			int count = 0;
			Node mid = head;

			while (head != null)
			{

				// Update mid, when 'count'
				// is odd number
				if ((count % 2) == 1)
					mid = mid.next;

				++count;
				head = head.next;
			}

			// If empty list is provided
			if (mid != null)
				System.out.println("The middle element is [" +
									mid.data + "]\n");
		}

		void push(Node head_ref, int new_data)
		{
			
			// Allocate node
			Node new_node = new Node(head_ref, new_data);

			// Move the head to point to the new node
			head = new_node;
		}

		// A utility function to print a
		// given linked list
		void printList(Node head)
		{
			while (head != null)
			{
				System.out.print(head.data + "-> ");
				head = head.next;
			}
			System.out.println("null");
		}

		// Driver code
		public static void main(String[] args)
		{
			Find_Middle_Value_of_Linked_List l_M = new Find_Middle_Value_of_Linked_List();

			for(int i = 5; i > 0; i--)
			{
				l_M.push(head, i);
			
			}
			
			l_M.printList(head);
			l_M.printMiddle(head);
			
		}
}

		// This code is contributed by mark_3
