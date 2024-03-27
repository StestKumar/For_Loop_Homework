import java.util.Scanner;

//Finding factorial of a number entered by user
//
public class Factorial_Number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number = ");
        int Number = scanner.nextInt();

        int factorial = 1; int x;

        for (x=1; x<=Number;x++) {
            factorial = factorial * x;
        }
            System.out.println("The factorial of "+Number+ " is "+factorial);



    }

}
