package org.example;

public class L2H4ageconfirm {

    public static void main(String[] args) {
        printPermission(44);
    }

    public static String printPermission(int userAge) {
        if (userAge >= 18) {
            return "Pełnoletni";
        } else if (userAge > 0 && userAge < 18) {
            return "Niepełnoletni";
        } else {
            return "Błąd";
        }
    }
}
