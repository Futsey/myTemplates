package collectionTemplates.linkedList;

public class DuplicateRemovalInLinkedList {
    /*
        //Represent a node of the singly linked list
        static class Node{
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        //Represent the head and tail of the singly linked list
        static Node head = null;
        static Node tail = null;
        //addNode() will add a new node to the list
        public static void addNode(int data) {
            //Create a new node
            Node newNode = new Node(data);
            //Checks if the list is empty
            if(head == null) {
                //If list is empty, both head and tail will point to new node
                head = newNode;
            }
            else
                //If list is empty, both head and tail will point to new node
                tail.next = newNode;
            //newNode will become new tail of the list
        }
        tail = newNode;
    }
    //removeDuplicate() will remove duplicate nodes from the list
    public static void removeDuplicate() {
        //Node current will point to head
        Node current = head, index = null, temp = null;
        if(head == null) {
            return;
        }
        else {
            while(current != null){
                //Node temp will point to previous node to index.
                temp = current;
                //Index will point to node next to current
                index = current.next;
                while(index != null) {
                    //If current node's data is equal to index node's data
                    if(current.data == index.data) {
                        //Here, index node is pointing
                        to the node which is duplicate of current node
                        //Skips the duplicate node by pointing to next node
                        temp.next = index.next;
                    }
                    else {
                        //Temp will point to previous node of index.
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    //display() will display all the nodes present in the list
    public static void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Adds data to the list
        addNode(11);
        addNode(12);
        addNode(31);
        addNode(12);
        addNode(31);
        addNode(4);
        addNode(11);
        System.out.println("Originals list: ");
        display();
        removeDuplicate();
        System.out.println("List after removing duplicates: ");
        display();
    }
     */
}
