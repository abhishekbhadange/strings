package stringsAndThings;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println("Is string palindrome: " + isPalindrome(str));
	}
	private static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while(i < j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}
			else
				return false;
		}
		return true;
	}
}
