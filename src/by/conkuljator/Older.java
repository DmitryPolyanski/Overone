package by.conkuljator;

public class Older {
    public static void red() {
        Pers student = new Student("Вася", 20, 5);
        System.out.println(student.goToShool());

        Pers schoolboy = new Schoolboy("Петя", 15, 4);
        System.out.println(schoolboy.goToShool());

        if (student.getAge() > schoolboy.getAge()) {
            System.out.println(student.getName() + " старше");
        }
        if (student.getAge() < schoolboy.getAge()) {
            System.out.println(schoolboy.getName() + " старше");
        }
        if (student.getAge() == schoolboy.getAge()) {
            System.out.println(schoolboy.getName() + schoolboy.getName() + " одного возраста");
        }
    }
}
