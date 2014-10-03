//Remove characters from the first string which are present in the second string
package stringsAndThings;

import java.util.List;
import java.util.ArrayList;

public class RemCommonChars {
	public static void main(String[] args) {
		String str1 = "Abhishek", str2 = "Bhadange";
		String result = remCommonChars(str1.toLowerCase(), str2.toLowerCase());
		System.out.println(result);
	}
	public static String remCommonChars(String str1, String str2) {
		List<Character> list = new ArrayList<Character>();
		boolean[] bit = new boolean[256];
		for(int i = 0; i < str2.length(); i++)
			bit[str2.charAt(i)] = true;
		for(int i = 0; i < str1.length(); i++) {
			if(bit[str1.charAt(i)] == false) 
				list.add(str1.charAt(i));
		}
		StringBuilder builder = new StringBuilder();
		for(Character ch : list)
			builder.append(ch);
		return builder.toString();
	}
}