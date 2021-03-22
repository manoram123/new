package linklist;
public class LinkList{
    Node head;
    public void insert(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next =newNode;
        }
    }

    public void display(){
        Node n = head;
        while(n.next != null){
            System.out.print("->");
            System.out.print(n.data);
            n = n.next;
        }
        System.out.print("->");
        System.out.print(n.data);
    }

    public void insertAtStart(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        newNode.next = head;
        head = newNode;
    }
     public void insertAtPos(int index, int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(index == 0){
            insertAtStart(value);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            newNode.next = n.next;
            n.next = newNode;
        }

     }

     public void delete(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node delete;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            delete = n.next;
            n.next = delete.next;
            delete.next = null;
        }
     }

}