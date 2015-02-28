package stringsAndThings;

public class StringCompress2 {
	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println("Compressed string: " + stringCompress(str));
	}
	public static String stringCompress(String str) {
		StringBuilder sb = new StringBuilder();
		char var = str.charAt(0);
		int varCount = 1;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1))
				varCount++;
			else {
				sb.append(var + "" + varCount);
				if(sb.length() >= str.length())
					return str;
				var = str.charAt(i+1);
				varCount = 1;
			}
		}
		sb.append(var + "" + varCount);
		if(sb.length() >= str.length())
			return str;
		else
			return sb.toString();
	}
}
