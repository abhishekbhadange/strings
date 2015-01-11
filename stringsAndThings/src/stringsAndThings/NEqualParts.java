// Write a program to print N equal parts of a given string

package stringsAndThings;

public class NEqualParts {
	public static void main(String[] args) {
		String str = "ABCDEF";
		int parts = 3;
		nEqualParts(str, parts);
	}
	public static void nEqualParts(String str, int parts) {
		int size = str.length();
		if(size % parts == 0) {
			int partSize = size / parts;
			for(int i = 0; i < str.length(); i += partSize) 
				System.out.println(str.substring(i, i + partSize));
		}
		else
			System.out.println("Invalid Input: String size is not divisible by " + parts);
	}
}	
