package by.animals;

public class Bear extends Animals{
    public Bear(String view, String name, String age, String colour) {
        super(view, name, age, colour);
    }

    @Override
    public void voice() {
        System.out.println(getView() + '\n' + getName() + '\n' + getAge() +
                '\n'+ getColour() + '\n' + "Голос: Бр-бр-бр");
        System.out.println();
    }
}
