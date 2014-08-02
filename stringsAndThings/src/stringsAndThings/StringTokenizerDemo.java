package stringsAndThings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public final static int MAXFIELDS = 5;
	public final static String DELIM = "|";
	
	public static void main(String args[]) {
		
		String input1, input2, input3;
		input1 = "A|B|C|D";
		input2 = "A||D|E";
		input3 = "A|||C|P";
		
		printResults(input1, process(input1));
		printResults(input2, process(input2));
		printResults(input3, process(input3));
	}
	public static String[] process(String input) {
		
		int i = 0;
		String s;
		
		String[] result = new String[MAXFIELDS];
		
		StringTokenizer st = new StringTokenizer(input, DELIM, true);
		while(st.hasMoreTokens()) {
			s = st.nextToken();
			if(s.equals(DELIM)) 
				continue;
			result[i++] = s;
		}
		return result;
	}
	public static void printResults(String input, String[] result) {
		System.out.println("Input: " + input);
		for(int i = 0; i < result.length; i++)
			System.out.println("Output for " + i + " is: " + result[i]);
	}
}
