// Find the first non-repeating character of a string

package stringsAndThings;

public class NonRepeatChar {
	public static void main(String[] args) {
		String str = "aabb";
		char result = nonRepeatChar(str);
		if(result != '\u0000')
			System.out.println(result);
		else
			System.out.println("No such non-repeating character!");
	}	
	public static char nonRepeatChar(String str) {
		int[] count = new int[256];
		for(int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		for(int i = 0; i < str.length(); i++)
			if(count[str.charAt(i)] == 1)
				return str.charAt(i);
		return '\u0000';
	}
}