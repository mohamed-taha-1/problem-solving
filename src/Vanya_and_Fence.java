import java.util.Scanner;

public class Vanya_and_Fence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	int   hight_of_each_frind,hight_of_each_frind2,hight_of_each_frind3,  n,height_of_fence, Height_temp1=0, Height_temp2=0;
		
		System.out.print("ENter the number of frinds : ");
		Scanner in =new Scanner(System.in);
		 n=in.nextInt();
		 System.out.print("ENter the hieght of fence : ");
		 height_of_fence=in.nextInt();
		 
		 System.out.print("enter the hieht of frind 1   :  ");
		 hight_of_each_frind=in.nextInt();
		 System.out.print("enter the hieht of frind 2 ");
		 hight_of_each_frind2=in.nextInt();
		 System.out.print("enter the hieht of frind 3 ");
		 hight_of_each_frind3=in.nextInt();
		 
		 
		 
		 if( hight_of_each_frind3> height_of_fence) {
			 Height_temp2+=2;
		 
		 } else {
			 Height_temp1+=1;
		 }
		 
	
		 
		 
	 
		 
		 if( hight_of_each_frind2> height_of_fence) {
			 Height_temp2+=2;
		 
		 } else {
			 Height_temp1+=1;
		 }
		 
		 
		 
	 
		 
		 if( hight_of_each_frind> height_of_fence) {
			 Height_temp2+=2;
		 
		 } else {
			 Height_temp1+=1;
		 }
		 
		 
		 System.out.println("the total min width is : "+(Height_temp1+Height_temp2));
		
		
		
		

	}

}
