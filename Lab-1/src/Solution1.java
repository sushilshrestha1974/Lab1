
public class Solution1 {

	public static void main(String[] args) {
		// Hello World
		// reverse should be World Hello
		String word = "The first program everyone writes is hello World";
		String result = " ";

		String a[] = word.split(" ");
		for (int i = a.length-1; i >= 0; i--) {
			result = result + a[i] + " ";
			System.out.println(result);
		}

	}

}
