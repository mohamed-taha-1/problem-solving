package sort;



/**

	الافضل   واخد مميات كل الالجورزم السابقة
	معتمده عل يمبدأ  ال complete binary tree
	
	- divided into : max and min heap 
	- max :  ترتيب تصاعدي 
	-min : ترتيب تنازلي 
	
	- 3 functions : build heap, heapify , sort 
	
	
	- Heap sort is an in-place algorithm  O(1)
	-  Time complexity of heapify is O(Logn). Time complexity of createAndBuildHeap() is O(n)
	    and the overall time complexity of Heap Sort is O(nLogn)
	
	


*/
public class Heap {
	
	
	static public void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
	
	
	
	
	  static void heapify(int arr[], int n, int i)
	    {
	        int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2
	 
	        // If left child is larger than root   غير الكوندشن هنا من اصغر ال ياكبر هتتحو لمن min to max 
	        if (l < n && arr[l] > arr[largest])
	            largest = l;
	 
	        // If right child is larger than largest so far
	        if (r <n && arr[r] > arr[largest])
	            largest = r;
	 
	        // If largest is not root
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	            // Recursively heapify the affected sub-tree
	            heapify(arr, n, largest);
	        }
	    }
	 
	
	  /* A utility function to print array of size n */
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
 
 
        sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
        
		
		

	}

}
