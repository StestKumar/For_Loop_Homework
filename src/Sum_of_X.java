//write a program that prints the sum of x ranging from 1 to 20.

import java.util.Scanner;

public class Sum_of_X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number ranging from 1-20 =");
        int Number = scanner.nextInt();

        int i;
        int Sum = 0;


        for (i = 1; i <= Number; i++)
            Sum = Sum + i;

        {System.out.println("Sum of the entered" + " = " + Sum);

        }
    }
}
