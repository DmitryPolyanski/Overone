package by.birds;

public class Cock extends Birds {
    private String voice;

    public Cock(String view, String name, String color, String voice) {
        super(view, name, color);
        this.voice = voice;
    }

    @Override
    public void voice() {
        super.print();
        System.out.println(voice + '\n');


    }
}
