// A Linked List is a linear data structure where elements (called nodes) are not stored in contiguous memory.
// Each node contains:
// Data
// Reference (link) to the next node

// Singly Linked List

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // Creating a LinkedList object
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList using add() method
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // Printing the LinkedList
        System.out.println(list);
    }
}
