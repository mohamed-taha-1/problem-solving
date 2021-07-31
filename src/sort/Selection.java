package sort;



/**
 *Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)  
 * @author mohamed taha 
 *
 */








public class Selection {

	 void sort(int arr[])
	    {
	        int n = arr.length;
	 
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	 
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	 
	    // Prints the array
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selection ss =new Selection();
		int[] arr = {60,10,30,50};
		ss.sort(arr);
		
		ss.printArray(arr);
		
	}

}
