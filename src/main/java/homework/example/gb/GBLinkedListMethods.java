package homework.example.gb;

public interface GBLinkedListMethods<T> extends Iterable<T> {
    public boolean addFirst(T element);

    public boolean addLast(T element);

    int size();

    T get(int index);

}
