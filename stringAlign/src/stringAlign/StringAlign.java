package stringAlign;

import java.text.Format;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class StringAlign extends Format{
	
	public static final char JUST_LEFT = 'l';
	public static final char JUST_CENTER = 'c';
	public static final char JUST_RIGHT = 'r';
	
	private int maxChars;
	private char just;
	
	public StringAlign(int maxChars, char just) {
		if(maxChars < 0)
			throw new IllegalArgumentException("maxChars must be positive!");
		this.maxChars = maxChars;
		switch(just) {
		case 'l':
		case 'c':
		case 'r':
			this.just = just;
			break;
		default:
			throw new IllegalArgumentException("Invalid justification argument!");
		}
	}
	
	public String format(String str) {
		return format(str, new StringBuffer(), null).toString();
	}
	
	public StringBuffer format(Object input, StringBuffer sb, FieldPosition ignore) {
	
		String given = (String)input;
		String str = given.substring(0, Math.min(maxChars, given.length()));
		
		switch(just) {
			case 'r':
				pad(sb, maxChars - str.length());
				sb.append(input);
				break;
			case 'c':
				int startPos = sb.length();
				pad(sb, (maxChars - str.length())/2);
				sb.append(input);
				pad(sb, (maxChars - str.length())/2);
				pad(sb, maxChars  - (sb.length() - startPos));
				break;
			case 'l':
				sb.append(input);
				pad(sb, maxChars - str.length());
				break;
		}
		return sb;
	}
	
	public final void pad(StringBuffer sb, int howMany) {
		for(int i = 0; i < howMany; i++)
			sb.append(" ");
	}
	
	public Object parseObject(String source, ParsePosition pos) {
		return source;
	}
}
