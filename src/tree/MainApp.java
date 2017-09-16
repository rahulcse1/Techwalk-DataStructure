package tree;

public class MainApp {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(12);
		tree.root.right = new Node(52);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(43);
		//tree.printLeftView(tree.root, 1);
		tree.printRightView(tree.root, 1);
	}
}
