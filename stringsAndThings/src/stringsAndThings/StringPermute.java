//Given two strings, write a method to decide if one is a permutation of the other

package stringsAndThings;

import java.util.Arrays;

public class StringPermute {
	public static void main (String[] args) {
		String str1 = "New York", str2 = "York weN";
		boolean result = stringPermute(str1, str2);
		System.out.println(result);
		boolean result2 = stringPermute2(str1, str2);
		System.out.println(result2);
	}
	public static boolean stringPermute(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		int[] count = new int[256];
		for(int i = 0; i < str1.length(); i++)
			count[str1.charAt(i)]++;
		for(int i = 0; i < str2.length(); i++) {
			if(--count[str2.charAt(i)] < 0)
				return false;
		}
		return true;
	}
	public static boolean stringPermute2(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		return stringSort(str1).equals(stringSort(str2));
	}
	public static String stringSort(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}