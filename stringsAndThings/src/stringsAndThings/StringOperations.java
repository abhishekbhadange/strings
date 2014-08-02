package stringsAndThings;

import java.util.StringTokenizer;

public class StringOperations {

	public static void main(String args[]) {
		
		String a = "Java is great.";
		System.out.println(a);
		String b = a.substring(5);
		System.out.println(b);
		String c = a.substring(5, 7);
		System.out.println(c);
		String d = a.substring(5, a.length());
		System.out.println(d);
		
		System.out.println("");
		
		StringTokenizer st = new StringTokenizer("Hello world of Java");
		while(st.hasMoreTokens())
			System.out.println("Token: " + st.nextToken());
		
		System.out.println("");
		
		StringTokenizer st1 = new StringTokenizer("Hello, world|of|Java", ", |");
		while(st1.hasMoreElements())
			System.out.println("Token: " + st1.nextElement());
		
		System.out.println("");
		
		StringTokenizer st2 = new StringTokenizer("Hello, world|of|Java", ", |", true);
		while(st2.hasMoreElements())
			System.out.println("Token: " + st2.nextElement());
	}
}
