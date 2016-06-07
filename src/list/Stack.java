package list;

import java.util.Arrays;

public class Stack<E> {
	
	private int size = 0;
	private static final int DEFAULT_SIZE = 10;
	private Object array[];

	public Stack() {
		array = new Object[DEFAULT_SIZE];
	}

	public void push(E e) {
		if (size == array.length) {
			incrementSize();
		}
		array[size++] = e;
	}

	public E pop() {
		E e = (E) array[--size];
		array[size] = null;
		return e;
	}

	private void incrementSize() {
		int newSize = array.length * 2;
		array = Arrays.copyOf(array, newSize);
	}
}
