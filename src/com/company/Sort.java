package com.company;

import java.util.Arrays;

public class Sort {

    public static int [] massa (int [] syka){

        return syka;
    }

    public static void printToSyka() {
        int [] skaba = new int[20];
        for (int i = 0; i < skaba.length; i++) {
            skaba[i] = (int) (Math.random()* 100);
        }
        int max = skaba[0];
        for (int i = 0; i < skaba.length; i++) {
            for (int j = 0; j < skaba.length-1; j++) {
                if (skaba[j] < skaba[j+1]){
                    max = skaba[j];
                    skaba[j] = skaba[j+1];
                    skaba[j+1] = max;
                }
            }

        }
        Sort.massa(skaba);
        System.out.println(Arrays.toString(skaba));
    }
}
