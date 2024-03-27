//Reverse a number using for Loop

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number = ");
        int Number = scanner.nextInt();

        for (; Number != 0; Number = Number / 10) {
            int Remainder = Number % 10;
           reverse = reverse * 10 + Remainder;
        }
        System.out.println("Reverse of the entered number = " + reverse);
    }


}
