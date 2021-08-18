package com.company;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
    }
}
