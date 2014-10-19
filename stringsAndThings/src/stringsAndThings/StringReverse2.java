// "Hello New York" -> "olleH weN kroY"

package stringsAndThings;

public class StringReverse2 {
	public static void main(String[] args) {
		String str = "Hello New York";
		String result = stringReverse(str);
		System.out.println(result);
	}
	public static String stringReverse(String str) {
		if(str == null || str.length() == 0)
			return null;
		StringBuilder sb = new StringBuilder();
		String[] strings = str.split(" ");
		for(String s : strings)
			sb.append(new StringBuilder(s).reverse() + " ");
		return sb.toString().trim();
	}	
} 