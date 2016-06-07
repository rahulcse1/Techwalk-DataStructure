package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		System.out.println("unsorted array : " + Arrays.toString(array));

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		
		System.out.println("sorted array : " + Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] unsorted = { 34, 23, 56, 70, 89 };
		bubbleSort(unsorted);
	}
}
