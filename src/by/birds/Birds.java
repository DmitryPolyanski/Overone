package by.birds;

public abstract class Birds {
    private String view;
    private String name;
    private String color;

    public Birds(String view, String name, String color) {
        this.view = view;
        this.name = name;
        this.color = color;
    }

    public String getView() {
        return view;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void print() {
        System.out.println("Вид:" + " " + getView() + '\n' + "Имя:" + " " + getName() + '\n' +
                "Цвет" + " " + getColor());
        System.out.print("Голос:" + " ");
    }

    public abstract void voice();

}
