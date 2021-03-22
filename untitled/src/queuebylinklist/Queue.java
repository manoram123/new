package queuebylinklist;

import graph.Node;

public class Queue {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail =newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue(){
        int value = head.data;
        head = head.next;
        return value;
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


    public void printQueue(){

    }
}
