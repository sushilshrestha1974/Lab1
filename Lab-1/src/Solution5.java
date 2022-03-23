import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
			float flt = sc.nextFloat();
			
		System.out.println("The floor value of the number is " + Math.floor(flt));
		System.out.println("The ceil value of the number is " + Math.ceil(flt));
		System.out.println("The number rounded to its nearest integer is " +Math.round(flt));
		sc.close();

	}
	
}
