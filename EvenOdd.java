import java.util.LinkedList;

public class EvenOdd {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> sorted = new LinkedList<Integer>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(4);
        list.add(7);
        for (Integer i : list) {
            if (i % 2 == 0) {
                sorted.addFirst(i);
            } else
                sorted.addLast(i);
        }

        System.out.println(sorted);
    }
}
