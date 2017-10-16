package list;

import java.util.Arrays;

public class Stack<E> {
	
	private int size = 0;
	private static final int DEFAULT_SIZE = 5;
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
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack =  new Stack<>();
		stack.push(1);
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		stack.push(3);
		System.out.println(stack);
		stack.push(4);
		System.out.println(stack);
		stack.push(5);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
