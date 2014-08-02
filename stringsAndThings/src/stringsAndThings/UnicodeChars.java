package stringsAndThings;

public class UnicodeChars {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		for(char i = 'a'; i < 'd'; i++)
			sb.append(i);
		
		sb.append('\u00a5');
		sb.append('\u01FC');
		sb.append('\u0391');
		sb.append('\u03A9');
		
		for(int i = 0; i < sb.length(); i++)
			System.out.println("Character " + i + " is " + sb.charAt(i));
		System.out.println("Accumulated characters are: " + sb);
	}
}
