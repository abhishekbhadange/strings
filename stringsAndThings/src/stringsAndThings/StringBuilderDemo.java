package stringsAndThings;

import java.util.StringTokenizer;

public class StringBuilderDemo {

	public static void main(String args[]) {
		
		String str = "One Two Three Four";
		
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
			if(st.hasMoreTokens())
				sb.append(", ");
		}
		
		System.out.println(sb.toString());
	}
}
