package by.animals;

public class Mouse extends Animals {
    public Mouse(String view, String name, String age, String colour) {
        super(view, name, age, colour);
    }

    @Override
    public void voice() {
        System.out.println(getView() + '\n' + getName() + '\n' + getAge() +
                '\n'+ getColour() + '\n' + "Голос: Пи-пи");
        System.out.println();
    }
}
