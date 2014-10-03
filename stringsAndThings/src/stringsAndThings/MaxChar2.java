//Return maximum occurring character in the input string
package stringsAndThings;

public class MaxChar2 {
	public static void main(String[] args) {
		String str = "Abhishek Bhadange";
		char result = maxChar(str.toLowerCase());
		System.out.println(result);
	}
	public static char maxChar(String input) {
		char[] chars = input.toCharArray();
		int[] counter = new int[256];
		int maxValue = 0;
		char c = 0;
		for(int i = 0; i < chars.length; i++) 
			counter[chars[i]] += 1;
		for(int i = 0; i < counter.length; i++) {
			if(maxValue < counter[i]) {
				maxValue = counter[i];
				c = (char)i;
			}
		}
		return c;
	}
}