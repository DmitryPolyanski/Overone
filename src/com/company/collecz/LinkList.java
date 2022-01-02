package com.company.collecz;

import java.util.*;

public class LinkList {
    public static void main(String[] args) {

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("Sacha");
        linkList.add("Macha");
        linkList.add("Pacha");
        linkList.add("Dacha");
        linkList.add("Dima");
        linkList.add("Olya");
        System.out.println(linkList);

        // перебор всех элементов
        for (String imya : linkList) {
            System.out.print(imya + ", ");
        }
        System.out.println();

        // перебор всех элементов с указанной позиции
        Iterator a = linkList.listIterator(2);
        while (a.hasNext()) {
            System.out.print(a.next() + ", ");
        }
        System.out.println();

        // перебор всех элементов в обратном порядке
        Iterator s = linkList.descendingIterator();
        while (s.hasNext()) {
            System.out.print(s.next() + ", ");
        }
        System.out.println();

        // вставка элемента в список в указанную позицию
        linkList.add(1, "Veronika");
        System.out.println(linkList);

        // 6. вставка элемента в начало и конец списка
        linkList.addFirst("Ljuba");
        linkList.addLast("Morfei");
        System.out.println(linkList);

        // 7.вставка элемента в начало списка
        linkList.offerFirst("Petya");
        System.out.println(linkList);

        // 8.вставка элемента в конец списка
        linkList.offerLast("Tanya");
        System.out.println(linkList);

        // 9. вставка нескольких элементов в список в указанной позиции
        LinkedList<String> animal = new LinkedList<>();
        animal.add("Tiger");
        animal.add("Hare");

        linkList.addAll(3, animal);
        System.out.println(linkList);

        // 10.  получить первое и последнее вхождение указанных элементов в список
        System.out.println(linkList.getFirst());
        System.out.println(linkList.getLast());

        // 11. отображение элементов и их позиции в списке
        for (int p = 0; p < linkList.size(); p++) {
            System.out.print(p + " : " + linkList.get(p) + ", ");
        }
        System.out.println();

        // 12. удаление указанного элемента из списка
        linkList.remove(3);
        System.out.println(linkList);

        linkList.remove("Hare");
        System.out.println(linkList);

        //13. удаляет первый и последний элемент
        linkList.removeFirst();
        linkList.removeLast();
        System.out.println(linkList);

        // 14. удаление всех элементов
//        linkList.clear();
//        System.out.println(linkList);

        // 15. поменять элементы местами в списке
        Collections.swap(linkList, 0, 7);
        System.out.println(linkList);

        // 16. перемешать элементы в списке
        Collections.shuffle(linkList);
        System.out.println(linkList);

        // 18. Клонирование списка
        animal = (LinkedList) linkList.clone();
        System.out.println("Resylt: " + animal);

        // 19. удаление и возврат первого элемента списка
        linkList.pop();
        System.out.println(linkList);

        // 20. извлечение первого элемента без удаления
        System.out.println(linkList.getFirst());
        System.out.println(linkList.peekFirst());

        // 21. извлечение последнего элемента без удаления
        System.out.println(linkList.getLast());
        System.out.println(linkList.peekLast());

        // 22. проверить имеется ли в списке определенный элемент
        if (linkList.contains("Macha")) {
            System.out.println("Такое имя есть в спискеп");
        } else {
            System.out.println("Такого имени в списке нет");
        }

        // 23. преобразовать двухсвязный список в список массивов

        List<String> preora = new ArrayList<>(linkList);
        for (String pulya : preora) {
            System.out.print(pulya + ", ");
        }
        System.out.println();

        // 24. сравнить два двухсвязных списка
        LinkedList<String> c1 = new LinkedList<>();
        for (String str : animal) {
            c1.add(linkList.contains(str) ? "Да" : "Нет");
        }
        System.out.println(linkList);
        System.out.println(animal);
        System.out.println(c1);

        // 25. проверить пуст список или нет
        System.out.println(linkList.isEmpty());
        linkList.removeAll(linkList);
        System.out.println(linkList.isEmpty());

        // 26. замена элемента в список

        linkList.addAll(animal);
        System.out.println(linkList);

        linkList.set(5, "Bomba");
        System.out.println(linkList);

//        System.out.println(linkList.equals(animal));
//        System.out.println(linkList.indexOf("Sacha"));
//        System.out.println(linkList.lastIndexOf("Morfei"));

    }

}
