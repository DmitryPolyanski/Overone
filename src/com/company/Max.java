package com.company;

public class Max {

    public int osorti(int a, int b) {

        int max =  0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public void print (){
        System.out.println(osorti(7, 11));
    }



//    int [] skaba = new int[20];
//        for (int i = 0; i < skaba.length; i++) {
//        skaba[i] = (int) (Math.random()* 100);
//    }
//    int max;
//        for (int i = 0; i < skaba.length; i++) {
//        for (int j = i+1; j < skaba.length; j++) {
//            if (skaba[i] < skaba[j]){
//                max = skaba[j];
//                skaba[j] = skaba[i];
//                skaba[i] = max;
//            }
//        }
//
//    }
}
