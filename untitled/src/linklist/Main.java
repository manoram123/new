package linklist;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.insertAtStart(99);

        list.insertAtPos(4,900);

        list.delete(5);

        list.display();
    }
}
