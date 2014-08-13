package stringsAndThings;

public class SubStrCount {
	
	public static void main(String args[]) {
		String str = "abcdefabcabcdeabc2yababc";
		String str1 = "abdghjbnjbcabjkabcbcal";
		String subStr = "abc";
		int count = subStringCount(str, subStr);
		if(count != 0)
			System.out.println("Count: " + count);
		else
			System.out.println("No occurence of substring");
	}
	
	public static int subStringCount(String str, String subStr) {
		int pos = 0, ctr = 0;
		String temp = str;
		while(temp != null) {
			if((pos = temp.indexOf(subStr, pos)) != -1) {
				pos = pos + subStr.length();
				ctr++;
			}
			else
				return ctr;
		}
		return 0;
	}

}
