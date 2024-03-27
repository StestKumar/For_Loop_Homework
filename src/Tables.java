//Java Program to Print Multiplication Table for any Number

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number between 1 - 12= ");
        int Number = scanner.nextInt();
        int x;
        for (x = 1; x <= 12; x++) {
            System.out.println("Table of the input = " + Number + " * " + x + " = " + (Number * x));
        }
    }


}

