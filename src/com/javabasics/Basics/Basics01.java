package com.javabasics.Basics;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printStudent(){
        System.out.println("I am "+name+" with id"+" "+id);
    }
}

public class Basics01 {

    public static void main(String[] args) {
        System.out.println("Here we are going to learn more about the java programming language as we can see here");

        Student std = new Student(123,"Viraj");

        std.printStudent();



    }
}
