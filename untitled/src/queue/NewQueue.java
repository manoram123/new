//package queue;
//import java.util.Scanner;
//public class NewQueue {
//    int queue[] = new int[6];
//    int front;
//    int rear;
//    int size;
//
//    public void enqueue(int value){
//        if(isFull()){
//            System.out.println("Queue is Full!");
//        }
//        else {
//            queue[rear] = value;
//            rear = rear+1;
//            size++;
//        }
//    }
//
//    public void dequeue(){
//        if(!isEmpty()) {
//            front = front + 1;
//            size--;
//        }
//        else{
//            System.out.println("The Queue is Empty!");
//        }
//    }
//
//    public boolean isEmpty(){
//        return size == 0;
//    }
//
//    public boolean isFull(){
//        return size == queue.length;
//    }
//
//    public void display(){
//        System.out.println("front: "+front);
//        System.out.println("rear: "+rear);
//        System.out.println("size: "+size);
//        System.out.println("Elements in the queue: ");
//
//        for(int i=0; i<size; i++){
//            System.out.print(queue[i]+ " ");
//        }
//    }
//}
//
