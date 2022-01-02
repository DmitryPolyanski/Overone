package com.company.collecz;

import by.oop.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaping {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "January");
        hashMap.put(2, "February");
        hashMap.put(3, "March");
        hashMap.put(4, "April");
        hashMap.put(5, "May");
        hashMap.put(3, "May");

        System.out.println(hashMap);
        System.out.println(hashMap.get(3));

        String value = hashMap.get(5);
        System.out.println(value);

        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);

        ArrayList<String> list = new ArrayList<>(hashMap.values());
        System.out.println(list);

        hashMap.replace(1, "January", "Oktober");
        System.out.println(hashMap);

        hashMap.remove(3);
        System.out.println(hashMap);

        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue("April"));

        System.out.println(hashMap.size());

//       hashMap.clear();

        if(!hashMap.isEmpty()){
            System.out.println(hashMap);
        }
        for (Map.Entry<Integer, String> value1 : hashMap.entrySet()) {
            System.out.println(value1);
        }

        Map<Integer, String> hashmap2 = new HashMap<>();
        hashmap2.put(5, "311");
        hashmap2.put(6, "287");
        hashmap2.put(7, "457");

        hashMap.putAll(hashmap2);
        System.out.println(hashMap);

        Map<Integer, Person> people = new HashMap<>();
        people.put(1, new Person("Petya"));
        people.put(123, new Person("Vasya"));
        people.put(1234, new Person("Misha"));

        for (Map.Entry<Integer, Person> person : people.entrySet()) {
            System.out.print(person.getKey() + " --->");
            System.out.println(person.getValue());

        }



    }
}
