/**
 * Definition for singly-linked list.
 * public class Node {
 *     int val;
 *     ListNode next;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node next) { this.val = val; this.next = next; }
 * }
 */
package DS;

class OddEven {
    public Node<Integer> oddEvenList(Node<Integer> head) {
        if (head == null)
            return null;
        Node<Integer> odd = head;
        Node<Integer> even = head.next;
        Node<Integer> evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
