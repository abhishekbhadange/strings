package stringAlign;

public class StringAlignApp {

	public static void main(String args[]) {
		StringAlign formatter = new StringAlign(120, StringAlign.JUST_CENTER);
		System.out.println(formatter.format("- i -"));
		System.out.println(formatter.format(Integer.toString(4)));
	}
}
