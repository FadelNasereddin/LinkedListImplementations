public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.insert(5);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		//list.insertAtStart(18);
		list.insertAt(3, 26);
		list.insertAt(0,55);
		
		list.deleteAt(2);
		//list.show();
		Node headNode = list.head;
		System.out.println("the number of nodes in the linked list is" + " " + list.countNodes());
		list.getByIndex(4);
		Node newHead = list.reverseLinkedList(headNode);
		list.show(newHead);
	}

}
