package LinkedList.DoublyLinkedList;

class Basics {
    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public Node head;
    public Node tail;

    // addfirst
    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    // addlast
    public void Addlast(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    // insert at position
    public void insertAtPosition(int position, int data) {
        if (position < 1) {
            System.out.println("Insertion is not possible !");
            return;
        }
        if (position == 1) {
            addfirst(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i <= position - 2; i++) {
            if (temp == null) {
                System.out.println("position does not exists");
                return;
            } else {
                temp = temp.next;
            }
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.previous = temp;
        if (temp.next != null) {

            temp.next.previous = newNode;

        } else {

            tail = newNode;
        }
        temp.next = newNode;
    }


}