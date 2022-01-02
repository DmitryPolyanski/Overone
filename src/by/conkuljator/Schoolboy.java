package by.conkuljator;

public class Schoolboy extends Pers {
    private int getMark;

    public Schoolboy(String name, int age, int getMark) {
        super(name, age);
        this.getMark = getMark;
    }

    public int getMark() {
        return getMark;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String goToShool() {
        return "Школьник " + getName() + " " + getAge() + " лет " + " получает оценки " + getMark() + '\n';
    }


}
