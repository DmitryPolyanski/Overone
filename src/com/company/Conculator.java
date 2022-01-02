package com.company;

public class Conculator {

    public double  sum (double a, double b) {
        return a + b;
    }
    public double  sub (double a, double b) {
        return a - b;
    }
    public double  mul (double a, double b) {
        return a * b;
    }
    public double  div (double a, double b) {
        return a / b;
    }

    public void oper (int result, double x, double y ) {

      switch (result) {
          case '+':
              System.out.println(sum(x, y));
              break;
          case '-':
              System.out.println(sub(x, y));
              break;
          case '*':
              System.out.println(mul(x, y));
              break;
          case '/':
              System.out.println(div(x, y));
              break;
      }
    }
 }
