package general;

public class StaticTest {

	static int numberOfPairs(int[] a, long k) {
		int length = a.length;
		int duplicate;
		for (int i = 0; i < a.length; i++) {
			duplicate = a[i];
			for (int j = i + 1; j < length; j++) {
				if (duplicate == j) {
					a[i] = 0;
					break;
				}
			}
		}
		int temp;
		int pairs = 0;
		for (int i = 0; i < length; i++) {
			temp = a[i];
			for (int j = i + 1; j < length; j++) {
				if (temp + a[j] == k) {
					pairs++;
					break;
				}
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		int[] a = { 6, 1, 3, 46, 1, 3, 9 };
		System.out.println(numberOfPairs(a, 47));
	}
}
