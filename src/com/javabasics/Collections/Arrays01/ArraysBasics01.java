package com.javabasics.Collections.Arrays01;

import java.util.Iterator;
import java.util.LinkedList;

public class ArraysBasics01 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Viraj");
        ll.add("Haris");
        ll.add("Shubham");
        ll.add("Raj");
        ll.add("Shiv");

        Iterator it = ll.descendingIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
