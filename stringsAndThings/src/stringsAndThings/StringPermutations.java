package stringsAndThings;

public class StringPermutations {
	public static void main(String[] args) {
		String str = "ABC";
		stringPermutations(str, 0, str.length() - 1);
	}
	public static void stringPermutations(String str, int i, int n) {
		if(str == null)
			return;
		if(i == n)
			System.out.println(str);
		else {
			for(int j = i; j <= n; j++) {
				str = swap(str.toCharArray(), i, j);
				stringPermutations(str, i + 1, n);
				str = swap(str.toCharArray(), i, j);
			}
		}
	}
	public static String swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		return new String(chars);
	}
}