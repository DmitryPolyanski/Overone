package com.company.collecz;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
    public static void main(String[] args) {

        // 1. добавить элеммент в хеш-набор

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dima");
        hashSet.add("Ljocha");
        hashSet.add("Sacha");
        hashSet.add("Olivija");
        hashSet.add("Larisa");
        hashSet.add("Kolya");
        System.out.println(hashSet);

        // 2. перебираем элементы
        for (String d1 :hashSet) {
            System.out.print(d1 + ", ");
        }
        System.out.println();

        // через итератор
        Iterator<String> w1 = hashSet.iterator();
        while (w1.hasNext()){
            System.out.print(w1.next() + ", ");
        }


    }
}
