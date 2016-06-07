package list;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		
		linkedList.add(new Node("one"));
		linkedList.add(new Node("two"));
		linkedList.add(new Node("three"));
		linkedList.add(new Node("four"));
		linkedList.add(new Node("five"));
		
		Node currrentNode = linkedList.getNode();
		Node middle = currrentNode;
		int length = 0;

		while (currrentNode.getNode() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.getNode();
			}
			currrentNode = currrentNode.getNode();
		}

		if (length % 2 == 1) {
			middle = middle.getNode();
		}

		System.out.println("Length: " + length);
		System.out.println("Middle Element: " + middle);

	}

}
