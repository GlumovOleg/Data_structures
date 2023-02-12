package HomeWork.HomeWork3;

public final class SingleListNode<T> {

    public T value;
    public SingleListNode<T> next;

    public SingleListNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SingleListNode<T> getNext() {
        return next;
    }

    public void setNext(SingleListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
