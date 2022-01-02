package by.conkuljator;

public class Student extends Pers {
    private int getMark;

    public Student(String name, int age, int getMark) {
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
        return "Студент " + getName() + " " + getAge() + " лет " + " получает оценки " + getMark() + '\n';
    }


}
