package week1a;

public class LinkList {

    Node head;
    Node tail;
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = head;
        }
        else{
            tail.next= newNode;
            tail = newNode;
        }
    }

    public void displayList(){
        Node travel = head;
        while(travel != null){
            System.out.println(travel.data);
            travel = travel.next;
        }
    }

    public int size(){
        Node travel = head;
        int count = 0;
        while(travel != null){
           count++;
           travel = travel.next;
        }
        return count;
    }

    public int index(int index){
        Node travel = head;
        for(int i=0; i<index; i++){
            travel = travel.next;
        }
       return travel.data;
    }

//    public static void main(String[] args) {
//        LinkList l = new LinkList();
//        l.addEdge(10);
//        l.addEdge(20);
//        l.displayList();
//        System.out.println(l.size());
//    }

}