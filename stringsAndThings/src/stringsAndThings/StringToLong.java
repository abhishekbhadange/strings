package stringsAndThings;

public class StringToLong {
	public static void main(String[] args) {
		String str = "+12345";
		long value = 12345;
		long result = stringToLong(str);
		if(result == value)
			System.out.println("Success!");
		else
			System.out.println("Failure!");
	}
	private static long stringToLong(String str) {
		if(str == null || str == "")	// input error check
			return Long.MIN_VALUE;
		String ref = "+-0123456789";	// reference string having allowed characters
		int factor = 1, index = 0;
		long res = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if(ch == '+' && i != 0)		// checking '+' position
				return Long.MIN_VALUE;
			else if(ch == '+' && i == 0)
				continue;
			if(ch == '-' && i != 0)		// checking '-' position
				return Long.MIN_VALUE;
			else if(ch == '-' && i == 0) { 
				res = -res;
				continue;
			}
			if((index = ref.indexOf(ch)) != -1) {	// checking allowed characters & conversion
				Integer x = new Integer(new StringBuilder(ref.substring(index, index + 1)).toString());
				res = res + x * factor;
				factor *= 10;
			}
			else
				return Long.MIN_VALUE;
		}
		return res;
	}
}