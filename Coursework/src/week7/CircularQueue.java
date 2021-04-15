package week7;


public class CircularQueue {
    int queue[]=new int [6];
    int front;
    int rear;
    int siz;


    //enqueue
    public void enqueue(int value) {

        if (!isFull()) {
            queue[rear]=value;
            //
            rear=(rear+1)%6;
            siz++;
        }else {
            System.out.println("Queue is full");
        }
    }


    //dequeue
    public void dequeue() {
        if (!isEmpt()) {
            front = (front+1)%6;
            siz--;
        }else{
            System.out.println("Queue is empty");
        }

    }
    //isFull
    public boolean isFull() {
        return siz==6;
    }

    //isEmpty
    public boolean isEmpt() {
        return siz==0;
    }

    //display
    public void display() {
        System.out.println("front: "+front);
        System.out.println("rear: "+rear);
        System.out.println("size: "+siz);

        System.out.println();

        System.out.print("element in queue: ");

        for(int i=0; i<siz;i++) {
            System.out.print(queue[(front+i)%6]+ " ");
        }
        System.out.println();
        System.out.println("Actual array");
        for(int i:queue) {
            System.out.print(i+"  ");
        }

    }


    public static void main(String[] args) {
        CircularQueue circ = new CircularQueue();

        circ.enqueue(1);
        circ.enqueue(2);
        circ.enqueue(3);
        circ.enqueue(4);
        circ.enqueue(5);
        circ.enqueue(6);

        circ.dequeue();
        circ.dequeue();
        circ.dequeue();
        circ.dequeue();
        circ.dequeue();
        circ.dequeue();

        circ.enqueue(1);

        circ.enqueue(3);
        circ.enqueue(4);
        circ.enqueue(5);
        circ.enqueue(6);


        circ.display();
    }

}
