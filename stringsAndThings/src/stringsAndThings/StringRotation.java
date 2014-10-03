//A Program to check if strings are rotations of each other or not
package stringsAndThings;

public class StringRotation {
	public static void main(String[] args) {
		String str1 = "abapaz", str2 = "bapaza";
		boolean result = stringRotation(str1.toLowerCase(), str2.toLowerCase());
		System.out.println(result);
		boolean result2 = conciseStringRotation(str1.toLowerCase(), str2.toLowerCase());
		System.out.println(result2);
	}
	public static boolean stringRotation(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		String two = str1.substring(0, 2);
		int j, i = 2;
		if((j = str2.indexOf(two)) != -1)
			j += 2;
		else if(str2.charAt(str2.length() - 1) == two.charAt(0) && str2.charAt(0) == two.charAt(1))
			j = 1;
		else
			return false;
		while(i < str1.length()) {
			if(j == str2.length())
				j = 0;
			if(str1.charAt(i) != str2.charAt(j))
				return false;
			i++;
			j++;
		}
		return true;
	}
	public static boolean conciseStringRotation(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		for (int i = 0; i < str1.length(); i++) { 
			if(str2.equals(str1.substring(i) + str1.substring(0, i))) { 
				return true; 
			} 
		} 
		return false;
	}
}