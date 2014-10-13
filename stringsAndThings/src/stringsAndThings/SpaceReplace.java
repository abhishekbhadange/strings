//Replace space in the given string (with sufficient space at the end) with '%20'. "True" length of the string is also supplied as input.

package stringsAndThings;

public class SpaceReplace {
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		int trueLength = 13;
		String result = spaceReplace(str, trueLength);
		System.out.println(result);
	}
	public static String spaceReplace(String str, int trueLength) {
		char[] chars = str.toCharArray();
		int spaceCounter = 0, newLength;
		for(int i = 0; i < trueLength; i++)
			if(chars[i] == ' ')
				spaceCounter++;
		newLength = trueLength + spaceCounter * 2;
		for(int i = trueLength - 1; i >= 0; i--) {
			if(chars[i] == ' ') {
				chars[newLength - 1] = '0';
				chars[newLength - 2] = '2';
				chars[newLength - 3] = '%';
				newLength -= 3;
			}
			else {
				chars[newLength - 1] = chars[i];
				newLength--;
			}
		}
		return new String(chars);
	}
}