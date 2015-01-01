// Format an RGB value (three 1-byte numbers) as a 6-digit hexadecimal string

package stringsAndThings;

public class FormatRGB {
	public static void main(String[] args) {
		System.out.println("Formatted RGB string: " + formatRGB(255, 0, 128));
		System.out.println("Formatted RGB string (2nd method): " + formatRGB2(255, 0, 128));
	}
	public static String formatRGB(int r, int g, int b) {
		return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
	}
	public static String toHex(int n) {
		String s = Integer.toHexString(n);
		return (s.length() == 1) ? "0" + s : s;
	}
	public static String formatRGB2(int r, int g, int b) {
		return String.format("%02x%02x%02x".toUpperCase(), r, g, b);
	}
}
