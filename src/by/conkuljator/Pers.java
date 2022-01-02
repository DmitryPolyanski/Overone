package by.conkuljator;

public abstract class Pers {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String goToShool();

}
