package graph;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(20);
        list.printList();
        int a = list.getIndex(3);

        System.out.println("List Item in 3rd: " + a);
    }
}
