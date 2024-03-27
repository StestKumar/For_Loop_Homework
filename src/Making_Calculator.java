//Making Calculator using the switch statement (The program takes three inputs
//from the user: one operator and 2 numbers. Based on the operator provided
//by the user, it performs the calculation on the numbers. Then the result is
//displayed on the screen.)

import java.util.Scanner;

public class Making_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st Number = ");
        int Number01 = scanner.nextInt();

        System.out.println("Please enter 2nd Number = ");
        int Number02 = scanner.nextInt();

        System.out.println("Please any operator from +,-,%,*,/");
        char Operator = scanner.next().charAt(0);

        int Addition = Number01 + Number02;
        int Subtraction = Number01 - Number02;
        int Modulus = Number01 % Number02;
        int Multiplication = Number01 * Number02;
        int Division = Number01 / Number02;


        switch (Operator) {
            case '+':
                System.out.println("Addition of " + Number01 + " + " + Number02 + " = " + Addition);
                break;
            case '-':
                System.out.println("Subtraction of " + Number01 + " - " + Number02 + " = " + Subtraction);
                break;
            case '%':
                System.out.println("Modulus of " + Number01 + " % " + Number02 + " = " + Modulus);
                break;
            case '*':
                System.out.println("Multiplication of " + Number01 + " * " + Number02 + " = " + Multiplication);
                break;
            case '/':
                System.out.println("Division of " + Number01 + " / " + Number02 + " = " + Division);
                break;
            default:
                System.out.println(" \"Operator Not Valid \"");


        }
    }
}
