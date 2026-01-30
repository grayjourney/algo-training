package datastructures.linkedlist;

import datastructures.linkedlist.LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);

        myLinkedList.append(45);
        myLinkedList.append(78);
        myLinkedList.append(100);
        myLinkedList.append(234);
        myLinkedList.append(234);
        myLinkedList.append(234);
        myLinkedList.append(234);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

         myLinkedList.insert(2, 12345);
        //
//         myLinkedList.reverse();
        findMiddleNode findMiddleNode = new findMiddleNode();
        Node middleNode = findMiddleNode.execute(myLinkedList);
        System.out.println("k Node: " + myLinkedList.findKthFromEnd(0));
        myLinkedList.removeDuplicates();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
