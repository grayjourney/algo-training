package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);

        myLinkedList.append(45);
        myLinkedList.append(78);
        myLinkedList.append(100);
        myLinkedList.append(234);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.insert(2, 12345);

        myLinkedList.reverse();

        System.out.println("\nremove item :" + myLinkedList.remove(2).value);


        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
