//Print any 10 numbers between given/user input range. For eg. Print numbers
//between 23-33

import javax.sound.sampled.EnumControl;
import java.util.Scanner;

public class Print_Number {
    public static void main(String[] args) {
        int Start;
        int End;
        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any starting number to print 10 number = ");
        Start = scanner.nextInt();

        System.out.println("please enter ending number to print 10 numbers = ");
        End = scanner.nextInt();

        for (x = Start; Start <= End; Start++) {
            System.out.println("Given range = " + Start);
        }
    }
}
