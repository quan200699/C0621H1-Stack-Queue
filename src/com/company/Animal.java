package com.company;

import java.util.Comparator;

public class Animal{
    int weight;

    public Animal() {
    }

    public Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                '}';
    }
}
