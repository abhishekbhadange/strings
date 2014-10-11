// Implement an algorithm to determine if a string has all unique characters. 

package stringsAndThings;

public class uniqueChars {
	public static void main(String[] args) {
		String str = "Abhishek";
		boolean result = isUniqueChars(str);
		System.out.println(result);
	}
	public static boolean isUniqueChars(String str) {
		if(str == null || str == "") {
			System.out.println("Input Error!");
			System.exit(0);
		}		
		if(str.length() > 256)
			return false;
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}
}