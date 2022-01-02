package by.conkuljator;

import java.util.Scanner;

public class Person implements Conculator{

    @Override
    public double summa(double a, double b) {
        return a + b;
    }

    @Override
    public double decrement(double a, double b) {
        return a - b;
    }

    @Override
    public double muitiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    public  void  opereishen (double a, double b) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите символ: ");
        String scan = sc.nextLine();

        switch (scan){
            case "+" -> System.out.println(summa(a,b));
            case "-" -> System.out.println(decrement(a, b));
            case "*" -> System.out.println(muitiplication(a, b));
            case "/" -> System.out.println(division(a, b));
            default -> System.out.println("Error");
        }
    }
}
