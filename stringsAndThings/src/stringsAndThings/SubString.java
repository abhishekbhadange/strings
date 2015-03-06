package stringsAndThings;

public class SubString {
	public static void main(String[] args) {
		String str1 = "abcd", str2 = "bc";
		System.out.println("String 2 sub-string of String 1: " + subString(str1, str2));
	}
	public static boolean subString(String str1, String str2) {
		if(str1.length() == 0 && str2.length() == 0)
			return true;
		if(str1 == null || str2 == null || str1 == "" || str2 == "")
			return false;
		int j = 0, flag = 0;
		for(int i = 0; i < str1.length(); i++) {
			if((j == 0 && str2.charAt(j) == str1.charAt(i)) || (flag == 1 && str2.charAt(j) == str1.charAt(i))) {
				j++;
				flag = 1;
			}
			else if(flag == 1 && str2.charAt(j) != str1.charAt(i))
				return false;
			if(j == str2.length())
				return true;
		}
		return false;
	}
}
