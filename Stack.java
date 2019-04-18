package String;

public class Stack {

	private Node head;
	private int size;
	

	public void push(String data) {
		Node newNode = new Node(data,head);// to create a new node
		head = newNode;// inserts at head
		size++;
	}
	
	public String pop() {
		if (empty()) {
			try {
				throw new IllegalOperationException("Stack is empty!!!");
			} catch (IllegalOperationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 Node deleteNode = head;
		 head = head.getLink();
		 size--;
		 return deleteNode.getData();
	}
	public boolean empty() {
		return head == null;
	}
	
	
	
}

