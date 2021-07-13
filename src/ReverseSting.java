
public class ReverseSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to ";
		String[] strArr= str.split(" ");
		
		for (int i=0;i< 2;i++) {
			
			char[] str1 =strArr[i].toCharArray();
			for (int j=str1.length-1; j>=0;j--) {
				System.out.print(str1[j]);
			}
			
			System.out.print(" ");
			
			
			
		}
		
		

	}

}
