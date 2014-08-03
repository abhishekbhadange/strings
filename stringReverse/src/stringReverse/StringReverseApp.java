package stringReverse;

import java.util.StringTokenizer;

public class StringReverseApp {

	public static void main(String[] args) {
		
		String str1 = "FCGDAEB";
		
		MyStack theStack = new MyStack(10);
		
		for(int i = 0; i < str1.length(); i++) {
			theStack.push(String.valueOf(str1.charAt(i))); //Character.toString(str1.charAt(i))
		}
		
		while(!theStack.isEmpty()) 
			System.out.print(theStack.pop() + " ");
		System.out.println("");
		
		String str2 = "Father Charles Goes Down And Ends Battle";
		
		MyStack theStack2 = new MyStack(10);
		StringTokenizer st = new StringTokenizer(str2);
		
		while(st.hasMoreTokens()) {
			theStack2.push(st.nextToken());
		}
			
		while(!theStack2.isEmpty()) 
			System.out.print(theStack2.pop() + " ");
		System.out.println("");
	}
}
