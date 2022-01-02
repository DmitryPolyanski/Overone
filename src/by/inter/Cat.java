package by.inter;

public class Cat implements LivingOrganisms, Movement{
    String type;
    String name;
    int age;
    String gender;
    int legs;

    public Cat(String type, String name, int age, String gender) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Cat(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println("Я " + type + ", меня зовут " + name);
    }

    @Override
    public void drink() {
        System.out.println("Мне " + age + " года, пол " + gender);
    }

    @Override
    public void go() {
        System.out.println("Так как я " + type + " у меня ноги " + legs);
    }

    @Override
    public void pastime() {
        System.out.println("Я очень люблю спать");
        System.out.println();
    }

    public String operai (){
        return "eat() + drink() + ";
    }

}
