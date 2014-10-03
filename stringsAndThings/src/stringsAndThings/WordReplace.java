package stringsAndThings;

public class WordReplace {
	public static void main(String[] args) {
		String str = "Gandhi was born in 1969. Gandhi was from Gujarat.";
		String subStr = "Gandhi", replace = "Mahatma";
		String result = replaceWord(str, subStr, replace);
		System.out.println("Modified string: " + result);
	}

	public static String replaceWord(String origStr, String subStr, String replace) {
		int startIndex = 0, subStrPtr = 0;
		String strPrev, strNext;
		if(origStr.contains(subStr)) {
			while((subStrPtr = origStr.indexOf(subStr, startIndex)) != -1) {
				startIndex = subStrPtr + subStr.length();
				strPrev = origStr.substring(0, subStrPtr);
				strNext = origStr.substring(startIndex);
				origStr = strPrev + replace + strNext;
			}
		}
		else
			System.out.println("Input Error: No " + subStr + " in the input string.");
		return origStr;
	}
}
