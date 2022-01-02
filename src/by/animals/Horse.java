package by.animals;

public class Horse extends Animals{
    public Horse(String view, String name, String age, String colour) {
        super(view, name, age, colour);
    }

    @Override
    public void voice() {
        System.out.println(getView() + '\n' + getName() + '\n' + getAge() +
                '\n'+ getColour() + '\n' + "Голос: Ииии-га-га");
        System.out.println();
    }
}
