
public class javaClass {
	public static void main(String args[]) {
	/*
	 * welcome to this store 
	 * this is the test for  the base of the work 
	 * */
//		String name = "John";
//	    System.out.println(name);
	    
     //  welcome there sir ,  this is the next awsome thing 
//	    int num = 15;
//	    System.out.println(num);
//	    
//	    
//	   String[] name= {"volovo","ford"}; 
//	   for (int i=0; i< name.length;i++) {
//		   System.out.println(name[i]);
//	   }
//	   
		
//		 2D array 
		
//		int d[][]= {{1,2,3},
//				    {4,5,6}  };
//		
//		for (int i=0 ; i<2 ; i++ ) {
//			for (int j= 0 ; j<3;j++) {
//				System.out.print (" "+d[i][j]);
//			}
//			System.out.println ();
//			
//		}	
//		
	
//		
//		int a[]= {3,2,4};
//		
//		for(int k: a) {
//			System.out.println(k);
//		}
		
	
		
//		int i =5; // int => is primitive data type 
	
		String s= "javapoint";
		 String ch[];
		 
//		for(int j=0; j< ch.length()	;j++) {
//			char c = s.charAt(j);
////			System.out.println(c);
//			System.out.println(ch);
//			
//		}

		 
		 
		 //		 ch=s.split("",5);
//		 char ss[];
//			for(String f: ch) {
//		     System.out.println(f);     
////		     String i=f.concat(s);
////		     System.out.println(i);  
//		     
//		     
//		     System.out.println(ss);
//			}
//		     
		     
		 String output = "";
		    for (int start = 0; start < input.length(); start++) {
		        Set<Character> visited = new HashSet<>();
		        int end = start;
		        for (; end < input.length(); end++) {
		            char currChar = input.charAt(end);
		            if (visited.contains(currChar)) {
		                break;
		            } else {
		                visited.add(currChar);
		            }
		        }
		        if (output.length() < end - start + 1) {
		            output = input.substring(start, end);
		        }
		    }
		    return output;
		
		
		
		
		
		
		
		
		
	   
	}
}
