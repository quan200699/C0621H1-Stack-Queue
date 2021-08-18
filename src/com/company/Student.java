package com.company;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){ //sắp xếp từ bé -> lớn
            return 1;
        }else {
            return -1;
        }
//        if (age < o.age) { //sắp xếp lớn đến bé
//            return 1;
//        } else {
//            return -1;
//        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
