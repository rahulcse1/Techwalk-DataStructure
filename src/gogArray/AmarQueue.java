package gogArray;

import java.util.Arrays;
import java.util.Stack;

public class AmarQueue<E> {

	private int size = 0;
	private Stack<E> s = new Stack<>();

	public void nqueue(E e) {
		s.push(e);
		size++;
	}

	public void dqueue() {
		if (size != 0) {
			s.remove(0);
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(s.toArray());
	}

	public static void main(String[] args) {
		AmarQueue<Integer> stack = new AmarQueue<>();
		stack.nqueue(1);
		System.out.println(stack);
		stack.nqueue(2);
		System.out.println(stack);
		stack.nqueue(3);
		System.out.println(stack);
		stack.nqueue(4);
		System.out.println(stack);
		stack.nqueue(5);
		System.out.println(stack);
		stack.dqueue();
		System.out.println(stack);
		stack.dqueue();
		System.out.println(stack);
	}
}