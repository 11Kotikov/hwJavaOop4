package homework.example.gb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class NodeForLinkedList<E> {

    private E item;

    private NodeForLinkedList<E> next;

    private NodeForLinkedList<E> prev;


    public NodeForLinkedList(NodeForLinkedList<E> prev, E element, NodeForLinkedList<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
