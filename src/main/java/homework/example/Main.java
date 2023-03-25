package homework.example;

import homework.example.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(1);
        gbLList.addFirst(2);
        gbLList.addFirst(3);
        gbLList.addFirst(12);
        gbLList.addFirst(111);

        gbLList.addLast(1);
        gbLList.addLast(2);
        gbLList.addLast(3);
        gbLList.addLast(12);
        gbLList.addLast(111);

        System.out.format("Created LinkedList is "+ gbLList + " \nits size is ");
        System.out.println(gbLList.size());
        for (int i = 0; i< gbLList.size();i++) {
            System.out.format("element by index "+i+ " = " + gbLList.get(i)+"\n");
        }

    }
}