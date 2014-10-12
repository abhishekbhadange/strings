//Implement a function which reverses a string in place.

package stringsAndThings;

public class StringReverse {
	public static void main(String[] args) {
		String str = "New York";
		String result = stringReverse(str);
		System.out.println(result);
	}
	public static String stringReverse(String str) { // Time Complexity O(n/2)
		char chars[] = str.toCharArray();
		int j = chars.length - 1;
		for(int i = 0; i < chars.length/2; i++) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			j--;
		}
		return new String(chars);
	}
}