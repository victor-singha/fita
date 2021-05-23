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

    public void display() {
        Node<T> temp = this.head;
        if (temp == null) {
            System.out.println("No such data exist.");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }

    public void remove(T data) {
        Node<T> temp = this.head;
        if (temp == null) {
            System.out.println("No such data exist.");
            return;
        }
        while (temp != null) {

        }

    }
}
