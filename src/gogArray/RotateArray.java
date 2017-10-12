package gogArray;

public class RotateArray {

	static int[] rotateArray(int[] a, int delement) {
		int len = a.length;
		for (int j = 0; j < delement; j++) {
			leftRotatebyOne(a, len);
		}
		return a;
	}

	static void leftRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}
}