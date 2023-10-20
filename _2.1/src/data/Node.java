package data;

public class Node<T> {
    public final T data;
    public final Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
