import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {
	static ArrayList<String> state = new ArrayList<String>();
	public static void main(String[] args) {
		System.out.println("Enter the states you have visited one at a time");
		System.out.println("State name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine().toLowerCase();
		
			state.add(name);
			while( !(name.equals("done"))) {
				System.out.println("State name");
				name = sc.nextLine().toLowerCase();
				
				if( !(name.equals("done"))) {
					state.add(name);
				}
			}
			
				System.out.println(state);	
			}
		
	

}
