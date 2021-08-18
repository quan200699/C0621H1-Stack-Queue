package com.company;

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> elements;

    public MyQueue() {
        this.elements = new LinkedList<>();
    }

    public void enqueue(int element) {
        elements.addLast(element);
    }

    public int dequeue(){
        return elements.removeFirst();
    }
}
