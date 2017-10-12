package gogArray;

import java.util.Arrays;

public class MainApp {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] rotateArray = RotateArray.rotateArray(a, 2);
		System.out.println(Arrays.toString(rotateArray));
	}
}
