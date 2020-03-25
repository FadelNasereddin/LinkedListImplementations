public class LinkedList {
	Node head;
	
	public void insert(int data){
		Node node = new Node(); // Create a new empty Node object
		node.data = data; // fill the data of the node with the input data
		node.next = null; // assign null to the address part of the node 
		
		if(head==null){ // Check if head is null (It will be at the beginning)
			head = node; // if head is null, the node created becomes the head node
			
		}
		else {
		Node traverse = head;   // if a head node exists m create Node n to traverse through entire linkedlist
		while(traverse.next!=null){
			traverse=traverse.next;
		}
		traverse.next= node;
		}
    }	
    
    public void show(Node head){
		Node node = head;
		while(node !=null){
			System.out.println(node.data);
			node=node.next;
		}
		
	}