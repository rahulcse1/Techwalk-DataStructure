package list;

public class LinkedList {

	private Node head;
	private Node tail;
	
	public LinkedList() {
		this.head = new Node("Head");
		tail = head;
	}

	public Node getNode() {
		return head;
	}
	
	public void add(Node node){
        tail.setNode(node);
        tail = node;
    }

}