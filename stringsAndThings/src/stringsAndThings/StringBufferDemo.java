package stringsAndThings;

public class StringBufferDemo {
	
	public static void main(String args[]) {
		
		String s1 = "Hello" + ", " + "World";
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(", ");
		sb.append("World");
		
		String s2 = sb.toString();
		System.out.println(s2);
		
		StringBuffer sb1 = new StringBuffer().append("Hello").append(", ").append("World");
		System.out.println(sb1.toString());
	}
}
