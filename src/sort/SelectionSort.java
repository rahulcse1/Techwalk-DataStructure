package sort;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] array) {
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < len; j++) {
				if (array[j] < array[min_idx]) {
					min_idx = j;
				}
			}
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 6, 7, 2, 4, 8 };
		selectionSort(array);
	}
}
