package org.example;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        char operator;
        double value1;
        double value2;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Wybierz rodzaj działania: +, -, *, /");
        operator = input.next() .charAt(0);

        System.out.println("Wpisz pierwszą liczbę");
        value1 = input.nextDouble();

        System.out.println("Wpisz drugą liczbę");
        value2 = input.nextDouble();

        calculate(value1 ,value2, operator);

    }
    public static double calculate(double value1, double value2, char operator){
       double response = 0;
       if (operator == '+'){
           response = value1 + value2;
       }
       else if (operator == '-'){
           response = value1 - value2;
       }
       else if (operator == '*') {
           response = value1 * value2;
       }
       else if (operator == '/'){
           response = value1 / value2;
       }
       System.out.println("wynik to " + response);
       return response;
    }

}
