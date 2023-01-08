package org.example;

public class AddAndEven {
    public static void main(String[] args) {
        int number = 30;
System.out.println(number + " to liczba " + getEvenOrOdd(30));
    }

    public static String getEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "parzysta";
        } else {
            return "nieparzysta";
        }
    }
}
