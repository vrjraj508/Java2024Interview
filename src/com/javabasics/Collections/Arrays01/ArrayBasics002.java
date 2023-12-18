package com.javabasics.Collections.Arrays01;

import java.util.*;

public class ArrayBasics002 {

    public static void printCollection(ArrayList<Integer> arr){

        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr01 = new ArrayList<>(10);

        ArrayList<Integer> arr02 = new ArrayList<>(List.of(56,67,89,23,37,17));

       arr01.addAll(arr02);
       arr01.add(4,80);

       printCollection(arr01);







        }


    }
