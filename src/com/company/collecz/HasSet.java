package com.company.collecz;

import java.util.*;

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
        for (String d1 : hashSet) {
            System.out.print(d1 + ", ");
        }
        System.out.println();

        // через итератор
        Iterator<String> w1 = hashSet.iterator();
        while (w1.hasNext()) {
            System.out.print(w1.next() + ", ");
        }
        System.out.println();

        // 3. Узнать количество элементов
        System.out.println("Содержится элементов:" + hashSet.size());

        // 4. Очистить хэш-набор
//        hashSet.clear();
//        System.out.println(hashSet);

        // или

//        hashSet.removeAll(hashSet);
//        System.out.println(hashSet);

        // 5. проверить пуст ли набор
        System.out.println(hashSet.isEmpty());

        // 6. клонировать набор в другой набор

        System.out.println(hashSet.clone());

        // или

        HashSet<String> new_hashSet = new HashSet<>();
        new_hashSet = (HashSet) hashSet.clone();
        System.out.println(new_hashSet);

        // 7. Преобразование хэш-набора в массив
        String[] new_array = new String[hashSet.size()];
        hashSet.toArray(new_array);
        System.out.println(new_array); // так не получится...

        System.out.println("Элементы массива: ");
        for (String element : new_array) {
            System.out.print(element + ", "); //  а так все норм)
        }
        System.out.println();

        // 8.Преобразование хэш-набора в набор деревьев
        Set<String> tree_set = new TreeSet<>(hashSet);
        System.out.println("Элементы TreeSet: ");
        for (String element2 : tree_set) {
            System.out.print(element2 + ", ");
        }
        System.out.println();

        // 9. Преобразование хэш-набора в ArrayList
        ArrayList<String> arList = new ArrayList<>(hashSet);
        System.out.println(arList);
        for (String ar : arList) {
            System.out.print(ar + ", ");
        }
        System.out.println();

        // 10. сравнить два хэш набора

        HashSet<String> result_set = new HashSet<>();
        for (String element3 : hashSet) {
            System.out.print((new_hashSet.contains(element3) ? "Yes" : "No") + ", ");
        }
        System.out.println();

        // 11. сравнить два хэш набора и сохранить только одинаковые элементы
        new_hashSet.add("Dragon");
        new_hashSet.add("Tigr");
        new_hashSet.add("Haze");
        System.out.println(new_hashSet);

        new_hashSet.retainAll(hashSet);
        System.out.println("Повторяющиеся елементы: " + new_hashSet);

        // 13. сравнить два хэш набора и сохранить только не одинаковые элементы
        new_hashSet.add("Dragon");
        new_hashSet.add("Tigr");
        new_hashSet.add("Haze");
        System.out.println(new_hashSet);

        new_hashSet.removeAll(hashSet);
        System.out.println(new_hashSet);

        // 12.удалить все
        new_hashSet.removeAll(new_hashSet);
        System.out.println(new_hashSet);
        // или
        hashSet.clear();
        System.out.println(hashSet);

    }
}
