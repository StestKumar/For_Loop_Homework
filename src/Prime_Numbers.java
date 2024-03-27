//Program to check whether input number is prime or not

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number = ");
        int n = scanner.nextInt();
        int num = 0;

        if (n <= 1)
            System.out.println("Number entered is not prime");

        for (int x = 1; x <= n / 2; x++)
            if (n % x == 0) {
                num++;
            }

        if (num > 1)
        {  System.out.println("Number entered is not prime");
        }else {
        System.out.println("Number entered is prime");


    }
}}