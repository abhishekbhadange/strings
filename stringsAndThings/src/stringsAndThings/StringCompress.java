// Implement a method to perform basic string compression using the counts of repeated 
// characters. If the compressed string would not become smaller than the original 
// string, your method should return the original string.

package stringsAndThings;

public class StringCompress {
	public static void main(String[] args) {
		String str = "abb bbccccddd";
		String result = stringCompress(str);
		System.out.println(result);
		String result2 = alternateCompress(str);
		System.out.println(result2);
	}
	public static String stringCompress(String str) { // using StringBuilder
		int size = compressCount(str);
		if(size >= str.length())
			return str;
		StringBuilder sb = new StringBuilder();
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == last)
				count++;
			else {
				if(str.charAt(i)==' ') {
					sb.append(last + "" + count);
					sb.append(' ');
					last = str.charAt(++i);
				}
				else {
					sb.append(last + "" + count);
					last = str.charAt(i);
				}
				count = 1;
			}
		}
		sb.append(last + "" + count);
		return sb.toString();
	}
	public static int compressCount(String str) {
		int size = 0;
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				size++;
				last = str.charAt(i);
				continue;
			}
			if(str.charAt(i) == last)
				count++;
			else {
				size += 1 + String.valueOf(count).length();
				last = str.charAt(i);
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
	public static String alternateCompress(String str) { // without using StringBuilder
		int size = compressCount(str);
		if(size >= str.length())
			return str;
		char[] finalStr = new char[size];
		int index = 0;
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == last)
				count++;
			else {
				if(str.charAt(i) == ' ') {
					index = insertIntoFinal(finalStr, index, last, count);
					index = insertIntoFinal(finalStr, index, ' ', count);
					last = str.charAt(++i);
				}
				else {
					index = insertIntoFinal(finalStr, index, last, count);
					last = str.charAt(i);
				}
				count = 1;
			}
		}
		index = insertIntoFinal(finalStr, index, last, count);
		return new String(finalStr);
	}
	public static int insertIntoFinal(char[] finalStr, int index, char c, int count) {
		finalStr[index] = c;
		index++;
		if(c != ' ') {
			char[] countArr = String.valueOf(count).toCharArray();
			for(char ch : countArr) {
				finalStr[index] = ch;
				index++;
			}
		}
		return index;
	}
}