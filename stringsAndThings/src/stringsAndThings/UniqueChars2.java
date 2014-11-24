package stringsAndThings;

public class UniqueChars2 {
	public static void main(String[] args) {
		String str = "Abhishek";
		boolean result = checkUniqueChars(str);
		System.out.println(result);
	}
	public static boolean checkUniqueChars(String str) {
		if(str == "" || str == null) {
			System.out.println("Input error");
			return false;
		}
		char[] chars = str.toCharArray();
		quickSort(chars, 0, chars.length - 1);
		for(int i = 0; i < chars.length - 1; i++) {
			if(chars[i] == chars[i + 1])
				return false;
		}
		return true;
	}
	private static void quickSort(char[] arr, int low, int high) {
		int i = low, j = high;
		int pivot = arr[low + (high - low)/2];
		while(i <= j) {
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i <= j) {
				exchange(arr, i, j);
				i++;
				j--;
			}
		}
		if(low < j)
			quickSort(arr, low, j);
		if(i < high)
			quickSort(arr, i, high);
	}
	private static void exchange(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
