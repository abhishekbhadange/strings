//Remove all duplicates from the input string
package stringsAndThings;

import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "abhuaafbbdbhuggj";
		String result = removeDuplicates(str);
		System.out.println(result);
	}
	public static String removeDuplicates(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		List<Character> list = new ArrayList<Character>();
		int[] count = new int[256];
		for(int i = 0; i < chars.length; i++) {
			if(count[chars[i]] == 1)
				continue;
			else {
				count[chars[i]] = 1;
				list.add(chars[i]);
			}
		}	
		StringBuilder builder = new StringBuilder(list.size());
		for(Character ch : list)
			builder.append(ch);
		return builder.toString();
	}
}