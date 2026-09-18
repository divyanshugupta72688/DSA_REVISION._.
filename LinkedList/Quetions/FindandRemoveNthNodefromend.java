// find and remove nth node from end
class FindandRemoveNthNodefromend{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node head;
    public  Node tail;
    public Node Remove(Node head,int n){
        Node temp = head;
        int size = 0;
        while (temp!=null) {
            temp = temp.next;
            size++;
        }
        if (size==n) {
            head = head.next;
            return head;
        }
        int i =1;
        int itofind = size-n;
        Node prev = head;
        while (i<itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}