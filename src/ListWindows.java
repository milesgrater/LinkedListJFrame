import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListWindows extends JFrame {
	private static final long serialVersionUID = 1L;
	
	LinkedList list = new LinkedList();
	JButton insert = new JButton("Insert");
	JButton remove = new JButton("Remove");
	JTextField data = new JTextField(30);
	JLabel dataLabel = new JLabel("New Data: ");
	JLabel flabel = new JLabel("Insert at: Front");
	JLabel rlabel = new JLabel("Insert at: Rear");
	JRadioButton front = new JRadioButton();
	JRadioButton rear = new JRadioButton();
	ButtonGroup insertGroup = new ButtonGroup();
	JButton printList = new JButton("Print List");
	JPanel panel = new JPanel();
	public ListWindows() {	
		setSize(500,300);
		setTitle("Linked List Control Window");
		panel.add(dataLabel);
		panel.add(data);
		panel.add(insert);
		panel.add(remove);
		insert.addActionListener(new InsertListener());
		remove.addActionListener(new RemoveListener());
		panel.add(flabel);		
		panel.add(front);
		panel.add(rlabel);
		panel.add(rear);
		insertGroup.add(front);
		insertGroup.add(rear);
		panel.add(printList);
		printList.addActionListener(new PrintListener());
		add(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);


	}

	public static void main(String[] args) {
		new ListWindows();
	}

	class InsertListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			Node t;
			if(front.isSelected()) {
				System.out.println("Inserting at front....");
				t = new Node(data.getText());
				list.insertFront(t);
				data.setText("");
			}
			else {
				if(rear.isSelected()) {
					System.out.println("Inserting at rear....");
					t = new Node(data.getText());
					list.insertRear(t);
					data.setText("");
				}
			}
		}
	}



		class RemoveListener implements ActionListener {

			public void actionPerformed(ActionEvent arg0) {
				if(front.isSelected()) {
					System.out.println("Removing front: " + list.removeFront());
				}
				
				else if(rear.isSelected()) {
					System.out.println("Removing rear:  " + list.removeRear());
				}

			}

		}

		class PrintListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				list.print();			
			}

		}


	
}
