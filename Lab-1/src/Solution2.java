import java.util.Scanner;
	//Enter year by user and find if it is leap year
public class Solution2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year = sc.nextInt();
		//int year = 2400;
		if(year%400==0) {
			System.out.println("This year is leapyear");
	}
		else if (year%4==0 && year%100!=0) {
			System.out.println("This year is leap year");
			
		}
		else {
			System.out.println("This year is not leap year");
			
		}
		
	}

}
