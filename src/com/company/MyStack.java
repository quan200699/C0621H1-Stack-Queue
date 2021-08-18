package com.company;

import java.util.Arrays;

public class MyStack {
    private int[] elements;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        this.elements = new int[size];
    }

    public void push(int element) {
        if (index == size) {
            ensureCapacity();
        }
        elements[index] = element;
        index++;
    }

    public void ensureCapacity() {
        if (index == size) {
            int newSize = this.size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public int pop() {
        if (index < 0) {
            return -1;
        } else {
            index--;
            return elements[index];
        }
    }

    public int[] getElements() {
        return elements;
    }
}
