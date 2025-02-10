package com.manvendra.collectionapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*==============================

In Java, a collection is a framework that provides an architecture to store and manipulate a group of objects.
Collections are used to perform various operations such as searching, sorting, insertion, manipulation, and deletion
on data. The Java Collections Framework (JCF) is a set of classes and interfaces that implement commonly reusable collection
data structures.

-----------
Collections
 - utility class contains static methods that operate on or return collections. It provides methods for sorting, searching,
 and modifying collections.
 - Common Methods: sort(), binarySearch(), reverse(), shuffle(), etc.
------------

------------
Data structure is a way of organizing and storing data in a computer so that it can be accessed and modified efficiently.
Data structures are fundamental to designing efficient algorithms and are essential for managing large amounts of data in
software applications.
------------
=================================*/
public class LearnCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.set(1,3);
        System.out.println(list);

        list.add(1,4);
        System.out.println(list);
        System.out.println(list.size());

        // return -1 if element not present
        System.out.println(list.indexOf(10));

        /* ========= SET ===================== */
        // find unique elements in array
        int[] arr = {1,3,1,2,4,23,67,7,5,3,1,3,57,7,8,8,9,67};
        Set<Integer> unique = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(unique);
        int[] uniqueArray = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueArray));

    }
}
