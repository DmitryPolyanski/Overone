package by.inter;

public class Person implements LivingOrganisms, Movement {

    String type;
    String name;
    int age;
    String gender;
    int legs;


    public Person (String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Я " + type + ", меня зовут " + name);
    }

    public Person(String type, String name, int age, String gender) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void drink() {
        System.out.println("Мне " + age + " лет, пол " + gender);
    }

    public Person(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }

    @Override
    public void go() {
        System.out.println("Так как я " + type + " у меня ноги " + legs);
    }

    @Override
    public void pastime() {
        System.out.println("Я очень люблю гулять по утрам");
        System.out.println();
    }


}
