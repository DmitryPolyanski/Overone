package by.inter;

public class Oper {
    public static void operei () {
        LivingOrganisms person = new Person("человек", "Петя", 25, "мужской");
        person.eat();
        person.drink();
        Movement person_i = new Person("человек", 2);
        person_i.go();
        person_i.pastime();

        LivingOrganisms baber = new Baber("бобер", "Рубен", 4, "мужской");
        baber.eat();
        baber.drink();
        Movement baber_i = new Baber("бобер", 4);
        baber_i.go();
        baber_i.pastime();

        LivingOrganisms cat = new Cat("кошка", "Муся", 2, "женский");
        cat.eat();
        cat.drink();
        Movement cat_i = new Cat("кошка", 4);
        cat_i.go();
        cat_i.pastime();
    }

}
