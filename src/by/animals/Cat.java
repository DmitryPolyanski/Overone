package by.animals;

public class Cat extends Animals {


    public Cat(String view, String name, String age, String colour) {
        super(view, name, age, colour);
    }

    @Override
    public void voice() {
       System.out.println(getView() + '\n' + getName() + '\n' + getAge() +
               '\n'+ getColour() + '\n' + "Голос: Мяу");
        System.out.println();
    }


}
