package list;

public class Node {

	private Node node;
	private String nodeValue;

	public Node() {
	}

	public Node(String string) {
		this.nodeValue = string;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public String getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(String nodeValue) {
		this.nodeValue = nodeValue;
	}

	public String toString() {
		return this.nodeValue;
	}

}
