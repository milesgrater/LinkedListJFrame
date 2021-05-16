
public class Node {
	private static int serialNumber = 0;
	
	int id;
	String stuff;
	Node next = null;

	public Node(String stuff) {
		id = ++serialNumber;
		this.stuff = stuff;
	}

	public Node() {
		id = ++serialNumber;
		this.stuff = "";
	}

	public String toString() {
		String output;

		output = "" + id +": " + stuff + "\tLinks to: ";
		if(next == null) 
			output += "End of List!";
		else
			output += next.id;


		return output;
	}
}