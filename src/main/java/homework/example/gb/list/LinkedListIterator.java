package homework.example.gb.list;

import homework.example.gb.NodeForLinkedList;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private NodeForLinkedList<T> position;


    public LinkedListIterator(NodeForLinkedList<T> first) {

        this.position = first;
    }
@Override
    public boolean hasNext() {
        return position != null;
    }
@Override
    public T next () {
        try {
            T element = position.getItem();
            position = position.getNext();
            return element;
        } catch (NullPointerException e) {
            System.out.println("last elem");
return null;
        }
}

}

