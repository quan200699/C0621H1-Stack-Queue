package com.company;

import java.util.Comparator;

public class AnimalComparator extends Animal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.weight > o2.weight) {
            return 1;
        } else if (o1.weight < o2.weight) {
            return -1;
        }
        return 0;
    }
}
