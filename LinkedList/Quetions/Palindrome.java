public class Palindrome {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public Node Midnode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean IsPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }
        // three step me palindrome nikalnege 

        // 1.find midnode using slow and fast pointer
        Node midnode = Midnode(head);

        // 2.reverse a linkedlist from midnode
        Node prev = null;
        Node curr = midnode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // 3. to check left and right part data
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
