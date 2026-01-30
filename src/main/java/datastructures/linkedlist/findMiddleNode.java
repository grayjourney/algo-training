package datastructures.linkedlist;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.LinkedList.Node;

public class findMiddleNode {
    public Node execute(LinkedList linkedList) {
        Node slow = linkedList.get(0);
        Node fast = linkedList.get(0);
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
