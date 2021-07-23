import java.util.Scanner;

public class beatuful_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year ");
		int i = in.nextInt();
		int a,b,c,d;
		
		a = i % 10;
		System.out.println(a);
		b = (i / 10) % 10;
		System.out.println("b"+b);
		c = (i / 100) % 10;
		System.out.println("c "+c);
		d = (i / 1000) % 10;
		System.out.println("d "+d);
		for (int j = i + 1; ; j++) {
		if (a != b && b != c && c != d && a != c && b != d && a != d)
		{
			System.out.println(" the result of beatuful year is :"+j);
			break;
		}else {
			System.out.println("it is not a beatuful year ");
			break;
		}
	  }
		
		
		
	}

}
