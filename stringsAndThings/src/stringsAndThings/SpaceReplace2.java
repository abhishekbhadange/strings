package stringsAndThings;

public class SpaceReplace2 {
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		System.out.println("Result: " + spaceReplace(str, 13));
	}
	public static String spaceReplace(String str, int trueLength) {
		if(str == null || str == "")
			return null;
		if(str.indexOf(' ') == -1) {
			System.out.println("No space exists in the given string! Returning original string...");
			return str;
		}
		char[] chars = str.toCharArray();
		int ptr = trueLength - 1;
		for(int i = chars.length-1; i >= 0; i--) {
			if(chars[ptr] != ' ')
				chars[i] = chars[ptr];
			else {
				chars[i] = '0';
				chars[i-1] = '2';
				chars[i-2] = '%';
				i -= 2;
			}
			ptr--;
		}
		return new String(chars);
	}
}
