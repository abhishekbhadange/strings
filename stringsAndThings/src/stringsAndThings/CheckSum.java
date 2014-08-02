package stringsAndThings;

import java.io.*;

public class CheckSum {

	public static void main(String args[]) throws IOException{
		
		String str = null;
		
		System.out.print("Enter some text: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		int checkSum = process(str);
		
		System.out.println("CheckSum: " + checkSum);
	}
	public static int process(String s) {
		
		int sum = 0, i;

		try {
			for(i = 0; i < s.length(); i++)
				sum += s.charAt(i);
		}
		catch(Exception e) {
			System.out.println("Exception occured:");
			e.printStackTrace();
		}
		return sum;
	}
}
