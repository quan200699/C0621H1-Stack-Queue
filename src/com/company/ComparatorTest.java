package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(20));
        animals.add(new Animal(25));
        animals.add(new Animal(22));
        animals.add(new Animal(29));
        AnimalComparator animalComparator = new AnimalComparator();
        Collections.sort(animals, animalComparator);
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
