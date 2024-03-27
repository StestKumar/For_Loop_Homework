//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        int n = 100;
        int No1 = 0;
        int No2 = 1;

        System.out.print("Fibonacci Series  " + n + "numbers =");

        for (int i = 1; i <= n; ++i) {
            System.out.print(No1 + " ");

            int TotalofPrevTwo = No1 + No2;
            No1 = No2;
            No2 = TotalofPrevTwo;

        }
    }
}