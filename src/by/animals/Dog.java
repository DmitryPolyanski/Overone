package by.animals;

public class Dog extends Animals{
    public Dog(String view, String name, String age, String colour) {
        super(view, name, age, colour);
    }

    @Override
    public void voice() {
        System.out.println(getView() + '\n' + getName() + '\n' + getAge() +
                '\n'+ getColour() + '\n' + "Голос: Гав");
        System.out.println();
    }
}
