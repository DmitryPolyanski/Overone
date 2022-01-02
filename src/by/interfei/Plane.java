package by.interfei;

public class Plane implements Flying{
    private String name;
    private String type;
    private int age;

    public Plane(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Я " + name + " тип " + type + " мне " + age + " лет";

    }

  }
