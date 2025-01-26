//Singly Linked List Java Class
//Here's a Java class implementation for a singly linked list with the requested methods.

// Node class representing a single element in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// SinglyLinkedList class with methods for insertion, deletion, and printing
public class SinglyLinkedList {
    Node head;

    // Constructor to initialize an empty linked list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to insert an element at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    // Method to delete an element by key from the linked list
    public void delete(int key) {
        if (head == null)
            return;

        // If the node to be deleted is the head node
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == key) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    // Method to print the elements in the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Main method for example usage
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Linked List: ");
        list.printList();

        list.delete(3);

        System.out.println("After deletion: ");
        list.printList();
    }
}
/*
 * Explanation
 * This Java class provides the following methods:
 * 
 * insert(int data): Inserts an element at the end of the linked list. It checks
 * if the list is empty and updates the head accordingly. If the list is not
 * empty, it traverses the list to find the last node and appends the new node
 * to it.
 * delete(int key): Deletes the first occurrence of the specified key from the
 * linked list. If the head node matches the key, it updates the head.
 * Otherwise, it traverses the list to find the node with the matching key and
 * updates the next reference of the previous node.
 * printList(): Prints the elements in the linked list by traversing the nodes
 * from the head.
 * In the main method, an example usage is demonstrated where elements are
 * inserted, printed, deleted, and printed again to show the updated linked
 * list.
 * 
 * Time Complexity
 * insert(int data): O(n) because in the worst case, it traverses the entire
 * list to find the last node.
 * delete(int key): O(n) because in the worst case, it traverses the entire list
 * to find the node with the matching key.
 * printList(): O(n) because it traverses the entire list to print all elements.
 * Space Complexity
 * O(n) where n is the number of elements in the linked list, as each node
 * occupies memory.
 */