package DS;

public class LinkedList<T> {
    Node<T> head = null;

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (head == null) {
            this.head = node;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
}
