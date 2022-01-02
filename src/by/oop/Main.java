package by.oop;
//OOP

// Абстракция
// Инкапсуляция     Get -еры   Set -еры
// Наследование     * extends
// Полиморфизм      * @Override

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("Petja");
//        System.out.println(person.getName());
//        person.setAge(21);
//        System.out.println(person.getAge());


//        Person petr = new Person("Petr");
//        petr.printToConsole();

//        Person vasya = new Person("Vasya", 25);
//        vasya.printToConsole();

        Person olya = new Person("Olya",21);
        olya.printToConsole();
        Student student = new Student("Vera", "WOW");
        student.getNameAndUniver();
    }
}
