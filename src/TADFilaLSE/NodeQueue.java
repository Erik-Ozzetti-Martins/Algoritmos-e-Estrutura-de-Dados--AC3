package TADFilaLSE;

import LSE_TADPilha.Node;

public class NodeQueue<E> implements Queue<E> {
    protected int size;
    protected E S[];
    protected Node<E> head;
    protected Node<E> tail;

    public NodeQueue(){
        head = tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E front() throws EmptyQueueException {
        if (size == 0)
            throw new EmptyQueueException("Queue is empty.");
        return head.getElement();
    }

    public void enqueue(E elem) {
        Node<E> node = new Node<E>();
        node.setElement(elem);
        node.setNext(null);
        if (size == 0)
            head = node;
        else
            tail.setNext(node);
        tail = node;
        size++;
    }

    public E dequeue() throws EmptyQueueException {
        if (size == 0)
            throw new EmptyQueueException("Queue is empty.");
        E tmp = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return tmp;
    }

    public String toString() {
        String s;
        Node<E> p = head;

        s = "[";
        while (p != null) {
            s += p.getElement();
            s += ", ";
            p = p.getNext();
        }
        if (s.length() > 1)
            s = s.substring(0, s.length() - 2);
        return s + "]";
    }

}
