package LinkedList.SinglyLinkedList;

class basics {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    // 1. insert at first(head)
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // 2. insert at last(tail)
    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // 3.insert at position
    public void Position(int position, int data) {
        if (position < 1) {
            System.out.println("Insertion is not possible!");
            return;
        }
        if (position == 1) {
            AddFirst(data);
            return;
        }
        Node prev = head;
        for (int i = 1; i <= position - 2; i++) {
            if (prev == null) {
                System.out.println("Position does not exists");
                return;
            }
            prev = prev.next;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    // 4.Traversal
    public void Traversal() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }

        System.out.println("null");
    }

    // 5.print head data
    public int gethead() {
        if (head == null) {
            return -1;
        } else {
            return head.data;
        }
    }

    // 6.print tail data
    public int gettail() {
        if (tail == null) {
            return -1;
        } else {
            return tail.data;
        }
    }

    // 7. return true when u will find a target in given linked list
    public boolean Search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    // 8.find the position of the target
    public int findPosition(int target) {
        int position = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return position;
            } else {
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    // 9. delete at head
    public void deleteHead() {
        if (head == null) {
            System.out.println("Linkedlist is Empty !");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    // 10.delete at tail
    public void deleteTail() {
        if (tail == null) {
            System.out.println("there is no tail !");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;

        }
        temp.next = null;
        tail = temp;
    }

    //11.delete from the middle
    public void deleteMiddle(int data) {
        if (head == null) {
            System.out.println("LinkedLisrt is Empty");
            return;
        }
        if (head.data == data) {
            deleteHead();
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Target Not found");
            return;
        }
        temp.next = temp.next.next;
    }
}