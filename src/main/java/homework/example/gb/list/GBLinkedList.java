package homework.example.gb.list;

import homework.example.gb.GBLinkedListMethods;
import homework.example.gb.NodeForLinkedList;

import java.util.Iterator;


public class GBLinkedList<T> implements GBLinkedListMethods<T> {

    private NodeForLinkedList<T> first;
    private NodeForLinkedList<T> last;
    NodeForLinkedList<T> position;


    public GBLinkedList() {
        this.first = null;
        this.last = null;

    }

    @Override
    public boolean addFirst(T element) {
        try {
            NodeForLinkedList<T> newNode = new NodeForLinkedList<>(null, element, first);
            if (first == null) {
                last = newNode;
            } else {
                first.setPrev(newNode);
            }
            first = newNode;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("something went wrong: list out of boarders");
        }
        return false;
    }

    @Override
    public boolean addLast(T element) {
        try {
            NodeForLinkedList<T> newNode = new NodeForLinkedList<>(last, element, null);
            if (last == null) {
                first = newNode;
            } else {
                last.setNext(newNode);
            }
            last = newNode;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("something went wrong");
        }
        return false;
    }

    @Override
    public int size() {
        int count = 0;

        for (T item : this) {
            count++;
        }
        return count;
    }

    @Override
    public T get(int index) {
        position = first;
        try {
            for (int i = 0; i < index; i++) {
                position = position.getNext();
            }
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
        return position.getItem();
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(first);
    }

    @Override
    public String toString() {
        StringBuilder showMeLinkedList = new StringBuilder("[");
        position = first;
        while (position != null) {
            showMeLinkedList.append(position.getItem());
            if (position.getNext() != null) {
                showMeLinkedList.append(", ");
            }
            position = position.getNext();
        }
        showMeLinkedList.append("]");
        return showMeLinkedList.toString();
    }
}

