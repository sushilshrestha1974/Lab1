import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		try {
			System.out.println("The division of two integers is "+ (a/b));
		}	
		catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Thank you");
		}
		
		System.out.println("The division of two integers is "+ (a/b));
		

	}

}
