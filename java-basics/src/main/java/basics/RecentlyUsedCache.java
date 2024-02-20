package basics;

import java.util.HashMap;
import java.util.Map;

public class RecentlyUsedCache {


    Map<Integer,Node> map = new HashMap<>();
    Node head;
    Node tail;
    int count;
    int capacity;

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    private  void addNode(Node toAdd) {
        head.next.prev = toAdd;
        toAdd.next = head.next;

        head.next = toAdd;
        toAdd.prev = head;
    }
    


    public RecentlyUsedCache(int capacity) {
        this.capacity= capacity;
        head = new Node();
        head.prev = null;
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

}
