//Display Sum of n Natural Number

import java.util.Scanner;

public class Sum_of_Natural_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any Natural number = ");
        int Number = scanner.nextInt();

        int a;
        int sum = 0;

        for (a = 1; a <= Number; ++a)
            sum = sum + a;

        System.out.println("Sum of Natural number " + Number + "  is  " + sum);

    }


}



