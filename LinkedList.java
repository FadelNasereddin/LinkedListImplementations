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
    
    public int countNodes (){
		int counter = 0;
		Node traverse = head;

		while (traverse !=null){
			counter ++;
			traverse=traverse.next;
		}
		
		return counter;
	}
    
    public void insertAtStart(int data){
		Node node = new Node ();
		node.data=data;
		node.next=null;
		node.next= head;
		head=node;
		
    }
    
    public void insertAt(int index,int data){
		Node node = new Node();
		node.data= data;
		node.next=null;
		Node traverse=head;
		
		if(index==0){
			insertAtStart(data);
		}
		else{
		for(int i=0;i<index-1;i++){
			traverse=traverse.next;
		}
		node.next=traverse.next;
		traverse.next= node;
	}
    }
    
    public void getByIndex(int index){
		Node traverse = head;
		for(int i=0; i<index;i++){
			traverse=traverse.next;
		}
		System.out.println(traverse.data);
    }
    
    public Node reverseLinkedList(Node head){
		Node previousNode = null;
		Node currentNode = head;
		Node forwardNode = null;
		while(currentNode !=null){
			forwardNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode=currentNode;
			currentNode=forwardNode;
		}
		return previousNode;
	}
}
