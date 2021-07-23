import java.util.*;


public class Anton_and_Danik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int acounter=0;
		 int dcounter = 0;
		System.out.println("please enter the number of the games : ");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		
		
	
		String s="ADADDD";
		
		System.out.println(s);
		
		 char[] ch = new char[s.length()];
		 
		// covert string to array of character 
		 
		for(int i=0;i<s.length();i++) {
			 ch[i] = s.charAt(i);
		}
		
		  for (int i=0 ;i<ch.length;i++) {
	            
	            
	            if(ch[i]=='A') {
	            	
	            
	              acounter++;
	            	
	            }else {
	           
	            	dcounter++;
	            }
	     
	            
	            
	        }
		  
		  if(acounter>dcounter){
		  System.out.println("ANTON");
		  }else if(acounter< dcounter){
			  System.out.println("Danit");
		  }else if(acounter==dcounter){
			  System.out.println("Frindship");
		  }
		 
		
		
		
		
		
		
	}

}
