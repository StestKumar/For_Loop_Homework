//WAP to print month names with 1-12 – other invalid entry by using switch.

import java.util.Scanner;

class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number between 1-12 = ");
        int Number = scanner.nextInt();

        switch (Number) {
            case 1:
                System.out.println("1st Month is January");
                break;
            case 2:
                System.out.println("2nd Month is February");
                break;
            case 3:
                System.out.println("3rd Month is March");
                break;
            case 4:
                System.out.println("4th Month is April");
                break;
            case 5:
                System.out.println("5th Month is May");
                break;
            case 6:
                System.out.println("6th Month is June");
                break;
            case 7:
                System.out.println("7th Month is July");
                break;
            case 8:
                System.out.println("8th Month is August");
                break;
            case 9:
                System.out.println("9th Month is September");
                break;
            case 10:
                System.out.println("10th Month is October");
                break;
            case 11:
                System.out.println("11th Month is November");
                break;
            case 12:
                System.out.println("12th Month is December");
                break;
            default:
                System.out.println("\"Invalid Number entered\"");
        }
    }
}
