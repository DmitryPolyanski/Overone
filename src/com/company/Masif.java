package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Masif {

 /*   public static int [] massif (int[] arrais) {
            return arrais;
    }

    public static void print() {
        int[] arrais = new  int[10];
        for (int i = 0; i < arrais.length; i++) {
            arrais [i]= (int) (Math.random() * 100);
            }
        Masif.massif(arrais);
        System.out.println(Arrays.toString(arrais));
    }     */


    // сортировка массива

    public static void masSort(int[] mass) {
        int buffer = 0;
        boolean masSort = false;

        while (!masSort) {
            masSort = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    masSort = false;

                    buffer = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = buffer;
                }
            }
        }
    }
    public static void print () {
        int[] mass = {1, 2, 5, 6, 3, 7, 4, 11, 18, 13};
        masSort(mass);
        System.out.println(Arrays.toString(mass));


    }


}


