package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Quân", 22);
        students[1] = new Student("Huy", 25);
        students[2] = new Student("Hoàng Anh", 20);
        Arrays.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
