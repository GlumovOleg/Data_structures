package HomeWork.HomeWork3;

import java.util.Random;

public class MyListNode<T> {

    private SingleListNode<T> head;

    public MyListNode() {
        head = null;
    }

    public MyListNode(T[] list) {
        this();
        addAll();
    }

    public void addAll() {
        MyListNode<Integer> linkedList = new MyListNode<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            linkedList.add(random.nextInt(50));
        }
    }

    public void add(T e) {
        if (head == null)
            head = new SingleListNode<T>(e);
        else {
            SingleListNode<T> temp = head;

            while (temp.next != null)
                temp = temp.next;

            temp.next = new SingleListNode<T>(e);
        }
    }

    public void reverts() {
        SingleListNode<T> current = head;
        SingleListNode<T> reversed = null;

        while (current != null) {
            SingleListNode<T> next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }
        head = reversed;
    }

    public void printList() {
        SingleListNode<T> temp = head;

        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}
