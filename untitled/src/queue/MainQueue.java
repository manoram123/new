package queue;

public class MainQueue {
    public static void main(String[] args) {
        LinearQueue num = new LinearQueue();
        num.enqueue(10);
        num.enqueue(20);
        num.enqueue(30);
        num.enqueue(40);
        num.enqueue(50);
        num.enqueue(60);
        num.dequeue();
        num.enqueue(80);
        num.display();
    }
}
