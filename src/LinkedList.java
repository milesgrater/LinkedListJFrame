
public class LinkedList {
	private Node head = null;
	private Node tail = null;

	public void insertFront(Node t) {
		if(head == null) 
			tail = t;

		t.next = head;
		head = t;

	}
	public Node removeFront() {
		if (head==null)
			return null;

		Node t = head;

		head = head.next;

		if (head==null) 
			tail = null;

		return t;
	}

	public Node removeRear() {
		if(head == null)
			return null;

		else if(head.next == null) {
			return removeFront();
		}

		tail = head;
		while(tail.next.next != null) {
			tail = tail.next;
		}

		Node t = tail.next;
		tail.next = null;

		return t;
	}


	public void insertRear(Node t) {
		if(head == null)
			head = t;
		else 
			tail.next = t;

		tail = t;
	}

	public void print() {
		if(head == null) {
			System.out.println("List Is Empty");
			return;
		}

		Node q = head;
		while(q != null) {
			System.out.println(q);
			q = q.next;
		}


	}


}
