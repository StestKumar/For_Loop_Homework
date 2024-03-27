//14.Write a program to calculate the sum of following series where n is
//input by user. (where n is a positive integer and input by user.)
//1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n

import java.util.Scanner;

public class Sum_of_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number = ");
        int Num = scanner.nextInt();

        double x;
        double Sum = 0;

        for (x = 1; x <= Num; x++)
            Sum = Sum + 1 / x;
        {
            System.out.println("The sum of entered input = " + Sum);
        }
    }
}
