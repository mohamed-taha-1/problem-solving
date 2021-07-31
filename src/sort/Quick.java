package sort;


/**
		Always pick first element as pivot.
		Always pick last element as pivot (implemented below)
		Pick a random element as pivot.
		Pick median as pivot.

*/

public class Quick {

	
	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	// function partion 
	
	static int partition(int[] arr, int low, int high)
	{
	     
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot)
	        {
	            i++;
	            swap(arr, i, j); // left side
	        }
	    }
	    swap(arr, i + 1, high);  // right side 
	    return (i + 1);
	}
	
	
	// quick sort 
	
	static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1); // sort for left side 
	        quickSort(arr, pi + 1, high); // sort for right side 
	    }
	}
	 
	
	
	
	// Function to print an array
	static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}
	

	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] arr = { 10, 7, 8, 9, 1, 5 };
		    int n = arr.length;
		     
		    quickSort(arr, 0, n - 1);
		    System.out.println("Sorted array: ");
		    printArray(arr, n);
		
		
		
	}

}
