package LinkedList.Quetions;

public class ReverseLinkedList {
    static class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public Node head;
    public Node tail;

    public  Node Reverse(Node head){
        Node prev  = null;
        Node curr = head;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
