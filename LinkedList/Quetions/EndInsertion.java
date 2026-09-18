package LinkedList.Quetions;

public class EndInsertion {
      static class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    public  Node  head;
    public  Node tail;

    public  void Insertion(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }
}
