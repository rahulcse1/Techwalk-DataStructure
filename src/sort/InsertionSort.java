package sort;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] array) {
		int len = array.length;
		for (int i = 0; i < len; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 6, 7, 2, 4, 8 };
		insertionSort(array);
	}
}
