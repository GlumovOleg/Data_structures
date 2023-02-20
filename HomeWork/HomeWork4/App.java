package HomeWork.HomeWork4;

public class App {

    public static void main(String[] args) {

        RBTree tree = new RBTree();

        for (int i =  12; i > 0; i--) {
            tree.add(i);
        }

        System.out.println(tree);

    }

}