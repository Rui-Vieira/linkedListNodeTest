package academy.mindswap;

public class LinkedList {

    private int length;
    private Node head;

    public LinkedList() {
        this.length = 0;
        this.head = new Node(null);
    }
    int size() {
        return length;
    }

    void add(Object data) {

        Node node = new Node(data);
        Node iterator = head;

        // Advance to the end of the list
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }

        iterator.setNext(node);
        length++;

    }

    int indexOf(Object data) {
             return 0;
    }


    Object get(int index) {
        return 0;
    }


    boolean remove(Object data) {
         return false;
    }

    public double sum(int a, int b) {
        return a + b;
    }

}