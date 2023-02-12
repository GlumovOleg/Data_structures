package HomeWork.HomeWork3;


public class App {
    public static void main(String[] args) {

        MyListNode<Integer> linkedList = new MyListNode<Integer>();
        
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(7);
        

        linkedList.printList();
        linkedList.reverts();
        linkedList.printList();
    }

    }

