package by.animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Животное: Кот", "Имя: Барс",
                "Возраст: 2 года", "Окрас: Серый");
        cat.voice();

        Dog dog = new Dog("Животное: Собака", "Имя: Пират",
                "Возраст: 5 лет", "Окрас: Черно-рыжый");
        dog.voice();

        Bear bear = new Bear("Животное: Медведь", "Имя: Балу",
                "Возраст: 4 года", "Окрас: Бурый");
        bear.voice();

        Mouse mouse = new Mouse("Животное: Мышь", "Имя: Джери",
                "Возраст: 2 года", "Окрас: Серый");
        mouse.voice();

        Horse horse = new Horse("Животное: Конь", "Имя: Сильвер",
                "Возраст: 5 лет", "Окрас: Черный");
        horse.voice();
    }
}
