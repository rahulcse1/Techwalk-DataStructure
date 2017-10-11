package search;

public class LinearSearch {

	public static boolean linearSearch(int[] data, int key) {
		for (int val : data) {
			if (key == val) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] data = { 1, 3, 4, 5, 6, 7 };
		System.out.println(linearSearch(data, 5));
	}
}
