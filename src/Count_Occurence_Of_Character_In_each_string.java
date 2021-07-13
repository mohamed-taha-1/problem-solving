import java.util.Scanner;

public class Count_Occurence_Of_Character_In_each_string {
	public static void main(String[] args) {
		
//     Scanner s= new Scanner(System.in);
//     System.out.println("enter the string ");
//     String str= s.nextLine();
//     int count =0, len=0;
//     
//     do {
//    	 try {
//    		 char name[]= str.toCharArray();
//    		 len=name.length;
//    		 for(int i=0; i<len;i++) {
//    			 if(( name[0]==name[i]&& name[0]>=65 && name[0]<=91 ) ||(name[0]>=97 && name[0]<=123 ) ) {
//    				 count ++;}
//    			 
//    		 }
//    		 if(count!=0) {
//    			 System.out.println(name[0]+ "  "+ count + "  times  ");
//    		 }
//    		 
//    		 
//    		 str= str.replace(""+name[0],"");
//    		 
//    		 
//    	 }catch(Exception e) {
//    		 System.out.println(e);
//    	 }
//     }while(len!=1);
		
		
		
		   Scanner s= new Scanner(System.in);
	     System.out.println("enter the string ");
	     String str= s.nextLine();

	     
	     int[] freq = new int[str.length()];  
	        System.out.println("The entered string is "+str);
	        //Convert the given string into character array  
	        char str1[] = str.toCharArray();            
	        for(int i = 0; i <str.length(); i++) 
	        {  
	            freq[i] = 1;  
	            for(int j = i+1; j <str.length(); j++) 
	            {  
	                if(str1[i] == str1[j])
	                {  
	                    freq[i]++;  
	                      
	                    //Set str1[j] to 0 to avoid printing visited character  
	                    str1[j] = '0';  
	                }  
	            }  
	        }            
	        //Displays the characters and their corresponding frequency  
	      
	        System.out.println("Characters  frequencies");  
	        for(int i = 0; i <freq.length; i++) 
	        {  
	            if(str1[i] != ' ' && str1[i] != '0')  
	                System.out.println(str1[i] + " " + freq[i]);  
	        }  
     
     
		
	}
}
