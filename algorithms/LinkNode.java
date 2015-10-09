package algorithms;

/**
 * Created by law on 07/10/2015.
 */
public class LinkNode<T> {

    private T value;
    private LinkNode<T> next;

    public LinkNode(T value, LinkNode next){
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }
}
