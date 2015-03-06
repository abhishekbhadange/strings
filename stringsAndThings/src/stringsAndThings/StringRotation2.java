package stringsAndThings;

public class StringRotation2 {
	public static void main(String[] args) {
		String s1 = "Abhishek";
		String s2 = "ishekAbh";
		System.out.println(isRotation(s1, s2));
	}
	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if(s2.length() == len && len > 0) {
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}
		return false;
	}
	public static boolean isSubstring(String s1, String s2) {
		return (s1.indexOf(s2) != -1);
	}
}
