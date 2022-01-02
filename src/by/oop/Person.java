package by.oop;
//конструктор без параметров работает по умолчанию,
// пока не создали другойконструктор с параметрами

public class Person {
    private String name;
    private int age;

    public void printToConsole() {
        System.out.println(name + '\n' + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

//    private void printAge(){
//        System.out.println(age);
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
