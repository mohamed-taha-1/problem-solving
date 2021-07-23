
public class heap_sort {

	
	public void sort(int arr[]) {
		int n=arr.length;
		
		/** Build heap arry */
		for(int i=n/2;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		/**  one by one extract the elements from the heap */
	     
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			
			/***  call the max heapon the reduced heap   ***/
			heapify(arr,i,0);
		}	
		
		
	}
	
	
	void heapify(int arr[], int n, int i) {
		
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
//		  if the left child is greater than the root 
		
		if(left <n && arr[left]> arr[largest]) {
			largest=left;
		}
		
//		if the right child is larger than the root 
		if(right <n && arr[right]> arr[largest]) {
			largest=right;
		}
		
//		 if largest is not root
		if(largest!=i) {
			int swap=arr[i];
			arr[i]=	arr[largest];
			arr[largest]=swap;	
			
			
//			 recerisvly heapify the affected sub tree
			heapify(arr ,n ,largest);
		}
		
	}
	
	
	static void printArray(int arr[]) {
		int length=arr.length;
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,5,6};
		int length=arr.length;
		heap_sort heap=new heap_sort();
		heap.sort(arr);
		
		System.out.println("sorted array ");
		System.out.println("   ");
		
		printArray(arr);  /**  this is a static way */
		
		
		

	}

}
