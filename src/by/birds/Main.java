package by.birds;

public class Main {
    public static void main(String[] args) {
        Owl owl = new Owl("Сова", "Букля", "Белый","Ух-ух");
        owl.voice();

        Crow crow = new Crow("Ворона","Каркуша", "Черный", "Кар-кар");
        crow.voice();

        Sparrow sparrow = new Sparrow("Воробей","Хвастун","Серо-коричневый","Чик-чирик");
        sparrow.voice();

        Cuckoo cuckoo = new Cuckoo("Кукушка","Вертушка","Рябый","Ку-ку");
        cuckoo.voice();

        Cock cock = new Cock("Петух","Петя","Красно-черный","Кукорекууу");
        cock.voice();
    }
}
