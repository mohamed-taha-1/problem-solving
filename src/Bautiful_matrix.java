import java.util.*;
public class Bautiful_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("the matrix");
			
		int[][] arr=new int[5][5];
		Scanner in=new Scanner(System.in);
		
		int counter =0;
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
				
				arr[i][j]=in.nextInt();
				
				if(arr[i][j]==1) {

					counter+=Math.abs(i-2)+Math.abs(j-2);
					break;
					
					
					
					
					
				}
				
			}
		}
		
		System.out.println("number of movies "+counter);

	}

}
