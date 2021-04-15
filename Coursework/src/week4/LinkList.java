package week4;

public class LinkList {

    Node head = null;
    Node tail = null;

    public void addNode(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println(current);
    }

    public  int size(){
        int count = 0;
        Node current = head;
        while(current!=null){
            count++;
            current = current.next;
        }

        return count;
    }


    public int getIndex(int i){
        Node current = head;
        for(int j=0; j<i; j++){
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        LinkList l = new LinkList();
        l.addNode(10);
        l.addNode(20);
        l.printList();
    }
}
