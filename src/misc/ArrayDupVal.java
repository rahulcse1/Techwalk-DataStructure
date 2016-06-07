package misc;

import java.util.HashMap;

public class ArrayDupVal {
	public static void duplicateValueInArray(int[] array) {
		HashMap<Integer, Integer> result = new HashMap<>();
		for (int key : array) {
			Integer value = result.get(key);
			if(value == null){
				result.put(key, 1);
			}else{
				value += 1;
				result.put(key, value);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 3, 4, 4, 5, 6, 7, 7, 7, 7, 7 };
		duplicateValueInArray(array);
	}
}
