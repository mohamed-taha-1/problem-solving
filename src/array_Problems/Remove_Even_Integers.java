package array_Problems;


import java.util.Arrays;

public class Remove_Even_Integers {

	static void removeEven(int[] k) {
		
		int n=k.length;
		int[] arr2=new int[n-1];
		
		
	
	    for (int i = 0,j=0; i < n; i++) { 
	        if (k[i] % 2 == 0) {
	        	continue ;
	        }
	        
	        arr2[j++]=k[i];
	  
	       
	  }
	 for(int j=0;j<arr2.length;j++) {
	      System.out.print(arr2[j]+" ");
	 }
	        
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,14,17,18,20,8};
		
		removeEven(arr);
		
		
		
	}

}
