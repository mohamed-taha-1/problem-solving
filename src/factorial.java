import java.util.Scanner;

public class factorial {

	
	
	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
	}   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("ENter the the size you wan in positive  !");
		int size = in.nextInt();
		int result =1;
	
		
		result=factorial(size);
		
		System.out.println("the result is : "+result );
	    
	   
		
		
		
		

	}

}
