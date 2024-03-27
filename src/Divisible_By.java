//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

import java.util.Scanner;

public class Divisible_By {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number between 1 - 100 = ");
        int Number = scanner.nextInt();

        int x = Number%3;
        int y = Number%5;
        char Modulus = '%';

        for (Number=1; x <= 0; Number++){
            System.out.println("Number entered is divisible by 3");
        }
    }
}

