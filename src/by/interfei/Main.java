package by.interfei;

public class Main {
    public static void main(String[] args) {
        Flying plane = new Plane("Боинг", "пассажирский", 6);
        Flying duck = new Duck("утка", "птица", 5);
        Flying dragon = new Dragon("дракон", "рептилия", 100);
        Flying bat = new Bat("летучая мышь", "гризун", 5);
        Flying swan = new Swan("лебедь", "птица", 7);


        Flying[] mas = {plane, duck, dragon, bat, swan};
        for (Flying object : mas) {
            object.fly();

        }
    }

}
