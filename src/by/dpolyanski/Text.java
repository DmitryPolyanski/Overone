package by.dpolyanski;

import java.util.Locale;

public class Text {
    public static void main(String[] args) {

        String text = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;";

        // 1. Вывести каждое слово с новой строки и удалить все ненужные пробелы.
//        String [] s = text.split(" ");
//        for (String word : s) {
//            word.trim();
//            System.out.println(word);
//        }

        //2. Заменить все буквы «ё» на «е» и все буквы «а» на «я».
//        String s2 = text.replace('ё','е');
//        String s3 = s2.replace('а','я');
//        System.out.println(s3);

    // 3. Вырезать строку «И днём и ночью».

   //     System.out.println(text.indexOf("И днём и ночью кот учёный")); // - маходим место первого символа
   //     System.out.println(text.indexOf("Всё ходит по цепи кругом;")); //   строки в тексте, что бы не считать

        // после используем их значение для удаления нужной строки.
 /*       String s4 = text.substring(0, 49);
        System.out.println(s4);
        String s5 = text.substring(76);
        System.out.println(s5);     */


        // 4. Вывести текст в ВЕРХНЕМ РЕГИСТРЕ

     //   System.out.println(text.toUpperCase(Locale.ROOT));

        // 5. Вывести текст в нижнем регистре.

     //   System.out.println(text.toLowerCase(Locale.ROOT));



       // 6. Проверить, содержит ли наш текст строку «Русалка на ветвях сидит;»

      //  System.out.println(text.indexOf("Русалка на ветвях сидит;"));

        // согласно поиска строка начинается с 187 символа.


      //  7. Переверните текст наоборот, что бы начало оказалось в конце, а конец текста в начале.

        // тупой метод

//        String s5 = text.replace("У лукоморья дуб зелёный;","Следы невиданных зверей;" );
//        String s6 = s5.replace("Следы невиданных зверей;","У лукоморья дуб зелёный;" );
//        String s7 = s6.replace("Златая цепь на дубе том:","Там на неведомых дорожках" );
//        String s8 = s7.replace("Там на неведомых дорожках","Златая цепь на дубе том:" );
//        System.out.println(s6);

        // правильный метод)
/*        String rev = " ";
        int l = text.length();
        for (int i = l - 1; i >= 0; i--){
            rev = rev + text.charAt(i);
        }
        System.out.println(rev);        */


        // 8. На каждую строку создайте отдельную ссылку. Сравните ссылки(==) и значения(.equals()).
        String t = ("У лукоморья дуб зелёный;");
        String t1 =  ("Златая цепь на дубе том:");
        String t2 = ("И днём и ночью кот учёный");
        String t3 = ("Всё ходит по цепи кругом;");
        String t4 = ("Идёт направо — песнь заводит,");
        String t5 = ("Налево — сказку говорит.");
        String t6 = ("Там чудеса: там леший бродит,");
        String t7 = ("Русалка на ветвях сидит;");
        String t8 = ("Там на неведомых дорожках");
        String t9 = ("Следы невиданных зверей;");

        System.out.println(t.equals(t1));
        System.out.println(t==t1);

        System.out.println(t2.equals(t3));
        System.out.println(t2==t3);

        System.out.println(t4.equals(t5));
        System.out.println(t4==t5);
    }
}
