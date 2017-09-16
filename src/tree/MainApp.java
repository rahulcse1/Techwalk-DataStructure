package tree;

public class MainApp {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		// tree.printLeftView(tree.root, 1);
		// tree.printRightView(tree.root, 1);
		boolean flag = tree.isValidBST(tree.root, 1, 5);
		System.out.println(flag);
	}
}
