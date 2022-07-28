package academy.mindswap;

class Node {
    private Node next;
    private Object data;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }

    void setNext(Node next) {
        this.next = next;
    }
    Object getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

}