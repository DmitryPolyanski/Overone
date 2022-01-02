package com.company.collecz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
//      1.
//        List<String> arrlist = new ArrayList<>();
//        arrlist.add("Red");
//        arrlist.add("Green");
//        arrlist.add("White");
//        arrlist.add("Orange");
//        arrlist.add("Black");
//        System.out.println(arrlist);

        //   2. 3. 4. 5. 6. 7. 8
        List<String> arrList1 = new ArrayList<>();
        arrList1.add("Red");
        arrList1.add("Green");
        arrList1.add("White");
        arrList1.add("Orange");
        arrList1.add("Black");
        for (String objekt : arrList1) {
            System.out.println(objekt);
        }
        arrList1.add(0, "Black2");
        System.out.println(arrList1);

        System.out.println(arrList1.get(2));

        arrList1.set(3, "Tricolor");
        System.out.println(arrList1);

        arrList1.remove(2);
        System.out.println(arrList1);

        if (arrList1.contains("Tricolor")) {
            System.out.println("Такой элемент есть");
        } else
            System.out.println("Такого элемента нет");

        Collections.sort(arrList1);
        System.out.println(arrList1);

        ArrayList<String> rayList = new ArrayList<>();
        rayList.add("Blue");
        rayList.add("Yellow");
        rayList.add("Pink");
        System.out.println(rayList);

        Collections.copy(arrList1, rayList);
        System.out.println(arrList1);

//        arrList1.addAll(rayList);     // добавляет один массив в другой
//        System.out.println(arrList1);

        Collections.shuffle(arrList1);
        System.out.println(arrList1);

        Collections.reverse(arrList1);
        System.out.println(arrList1);
        ;

        ArrayList<String> not = new ArrayList<>(arrList1.subList(2, 5));
        System.out.println(not);

        System.out.println(arrList1.contains("Red"));

        //  сравнение двух списков массива
        ArrayList<String> pot = new ArrayList<>();
        for (String r : arrList1)
            pot.add(not.contains(r) ? "Yes" : " No");
        System.out.println(pot);

        // смена мест двух элементов в списке массива
        Collections.swap(arrList1, 0, 2);
        System.out.println(arrList1);

        for (String g : arrList1) {
            System.out.print(g + ", ");
        }
        System.out.println();

        ArrayList<String> sssssss = new ArrayList<>();
        sssssss.addAll(arrList1);
        sssssss.addAll(rayList);
        System.out.println(sssssss);

        ArrayList<String> fairi = new ArrayList<>(rayList);
        fairi.clone();
        System.out.println(fairi);

        Collections.swap(sssssss, sssssss.indexOf("Tricolor"), sssssss.lastIndexOf("Red"));
        System.out.println("jjjj " + sssssss);

        sssssss.removeAll(sssssss);
        System.out.println(sssssss);

        System.out.println(sssssss.size());
        System.out.println(arrList1.size());

        System.out.println(sssssss.isEmpty());

        ArrayList<String> k = new ArrayList<>(arrList1);
        k.clone();
        k.trimToSize();
        System.out.println(k);


        rayList.trimToSize();
        System.out.println(rayList);

        Collections.copy(k, rayList);
        System.out.println(k);

        rayList.ensureCapacity(5);
        System.out.println(rayList);
       rayList.add("Wais");
       rayList.add("Ridik");
        System.out.println(rayList);

        rayList.set(0, "Dragon");
        System.out.println(rayList);

        System.out.print( "Pechtate ");
        for (String q : rayList) {
        System.out.print(q + ", ");
        }

    }
}
