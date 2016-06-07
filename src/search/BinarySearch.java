package search;

public class BinarySearch {

	public static boolean binarySearch(int[] data, int key) {
		int size = data.length;
		int low = 0;
		int high = size - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (data[middle] == key) {
				return true;
			}
			if (data[middle] < key) {
				low = middle + 1;
			}
			if (data[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] data = { 1, 3, 4, 5, 6, 7 };
		System.out.println(binarySearch(data, 5));
	}
}
