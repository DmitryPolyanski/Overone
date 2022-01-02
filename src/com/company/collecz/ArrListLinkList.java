package com.company.collecz;

import java.lang.reflect.Array;
import java.util.*;

public class ArrListLinkList {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(452);
//        list1.add(4325);
//        list1.add(25456);
//        list1.add(45456);
//        list1.add(14897);
//        System.out.println(list1);

//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list2.add(i);
//        }
//        System.out.println(list2);


        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 4);
        list.add(3, 5);
        list.add(4, 6);
        list.add(5, 7);
        list.add(6, 8);
        list.add(7, 9);

        list.remove(3);
        System.out.println(list);

        for (Integer integer : list) {
            System.out.println("number = " + integer);
        }


//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(arrayList);
//
//        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Petya", "Vasya", "Vera"));
//        System.out.println(arrayList2);


        ArrayList<String> months = new ArrayList<>();
        months.add("Январь");
        months.add("Февраль");
        months.add("Март");
        months.add("Апрель");
        months.add("Май");
        months.add("Июнь");
        months.add("Июль");
        months.add("Август");

        System.out.println("В массиве всего элементов: " + months.size());

        months.set(1, "Декабрь");
        System.out.println(months);

        months.remove("Январь");
        System.out.println(months);

        System.out.println(months.get(5));

        int b1 = months.indexOf("Май");
        System.out.println(b1);

        boolean b2 = months.contains("Map");
        System.out.println(b2);

        Collections.swap(months, months.indexOf("Август"), months.indexOf("Июнь"));
        System.out.println("IIII" + months);

        Collections.sort(months);
        System.out.println(months);

        months.clear();
        System.out.println(months);

        System.out.println(list.equals(months));

        String[] strArray = {"a", "b", "c", "e", "f"};
        ArrayList <String> arrayList1 = new ArrayList<>(Arrays.asList(strArray));
        System.out.println(arrayList1);

        String[] strArray1 = {"a", "b", "c", "e", "f"};
        boolean b = Arrays.asList(strArray1).contains("b");
        System.out.println(b);

     //   LinkedList

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst() + " " + linkedList.getLast());

        System.out.println(linkedList.removeFirst() + " " + linkedList.removeLast());

        System.out.println(linkedList);


        String mitsubishi = "Mitsubishi Outlander";
        String mazda = "Mazda 6";
        String honda = "Honda Accord X";
        String toyota = "Toyota Gibrit";

        LinkedList<String> cars = new LinkedList<>();
        cars.add(mazda);
        cars.add(honda);

        cars.addFirst(toyota);
        cars.addLast(mitsubishi);

        System.out.println(cars);

  //      cars.clear();

        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());

        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());

        System.out.println(cars);



    }
}
